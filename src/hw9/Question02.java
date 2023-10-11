package hw9;

class Bank {

	private int balance = 0; // 餘額
	
	synchronized public void deposit(int money) {
		while(balance >= 3000) {
			System.out.println("媽媽看到餘額在3000以上，暫停匯款");
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance += money;
		System.out.println("媽媽存了" + money + "，帳戶共有：" + balance);
		notify();
		System.out.println("熊大被老媽告知帳戶已經有錢！");
	}
	
	synchronized public void withdraw(int money) {
		while(balance == 0) {
			System.out.println("熊大看到帳戶沒錢，暫停提款");
			System.out.println("媽媽被熊大要求匯款！");
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance -= money;
		System.out.println("熊大領了" + money + "，帳戶共有：" + balance);
		if(balance <= 2000) {
			System.out.println("熊大看到餘額在2000以下，要求匯款");
			notify();
			
		}
	}
	
}


class Son extends Thread{
	
	Bank bank;

	public Son(Bank bank) {
		this.bank = bank;
	}
	
	public void run() {
		for(int i = 1; i <= 10; i++) {
			bank.withdraw(1000); // 每次提領1000元
		}
	}
}


class Mother extends Thread{
	
	Bank bank;
	
	public Mother(Bank bank) {
		this.bank = bank;
	}
	
	public void run() {
		for(int i = 1; i <= 10; i++) {
			bank.deposit(2000); // 每次存2000進去
		}
	}
}


public class Question02 {
	public static void main(String[] args) {
		
		Bank bank = new Bank();
		Son son = new Son(bank);
		Mother mom = new Mother(bank);
		
		son.start();
		mom.start();
		
	}
}
