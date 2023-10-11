package hw9;

public class Question01 implements Runnable{

	int bowls = 1;
	String name;
	
	public Question01() {
		
	}
	
	public Question01(String name) {
		this.name = name;
	}
	
	public int randomMilliSec() {
		int milliSec = ((int)(Math.random()*2501)) + 500; // 亂數產生500～3000之間的毫秒數
		return milliSec;
	}
	
	public void run() {
		while(bowls <= 10) {
			System.out.println(name + "吃第" + bowls + "碗飯");
			bowls++;
			
			try {
				Thread.sleep(randomMilliSec());
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println(name + "吃完了！");
	}
	
	
	// 實際測試
	public static void main(String[] args) {
		
		Question01 p1 = new Question01("饅頭人");
		Question01 p2 = new Question01("詹姆士");
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		
		System.out.println("-----大胃王快食比賽開始！-----");
		t1.start();
		t2.start();
		
		
	}
	
}
