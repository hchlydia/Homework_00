package hw3;

import java.util.Scanner;

public class Question02 {

	// 0~9猜數字

	public static int RandomNum() {
		int i = (int) (Math.random() * 10);
		return i;
	}

	public static void main(String[] args) {
		int k = RandomNum();
		Scanner s = new Scanner(System.in);
		System.out.println("開始猜數字吧！");

		while (true) {
			int j = s.nextInt();
			if (j < 0 || j > 9) {
				System.out.println("請輸入0~9的數字");
			} else if (k != j) {
				System.out.println("猜錯囉");
				continue;
			} else {
				System.out.println("答對了！答案就是" + k);
				break;
			}
		}

		// 0~100猜數字，並提示比正確答案大或小

//	public static int RandomNum100() {
//		int i = (int)(Math.random() * 101);
//		return i;
//	}

//		public static void main(String[] args) {
//			int k = RandomNum100();
//			Scanner s = new Scanner(System.in);
//			System.out.println("開始猜數字吧！");
//			
//			while(true) {
//				int j = s.nextInt();
//				if(j < 0 || j > 100) {
//					System.out.println("請輸入0~100的數字");
//					continue;
//				}
//				else if(j < k) {
//					System.out.println("猜錯囉，比這個數字大");
//					continue;
//				}
//				else if(j>k) {
//					System.out.println("猜錯囉，比這個數字小");
//					continue;
//				}
//				else {
//					System.out.println("答對了！答案就是"+k);
//					break;
//				}
//			}

		s.close();
	}

}
