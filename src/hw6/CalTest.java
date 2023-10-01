package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) {
		
		Calculator test = new Calculator();
		while(true) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("請輸入x的值：");
				int x = sc.nextInt();
				System.out.println("請輸入y的值：");
				int y = sc.nextInt();
				test.powerXY(x, y);
				break;
			}catch(CalException e) {
				System.out.println(e.getMessage());
			}catch(InputMismatchException input) {
				System.out.println("輸入格式不正確");
			}
		}
	}
	
}
