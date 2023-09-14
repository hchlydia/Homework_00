package hw3;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("請輸入三個整數：");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

		if (a + b <= c || a + c <= b || b + c <= a || a * b * c == 0) {
			System.out.println("不是三角形");
		} else if (a == b && b == c && a == c) {
			System.out.println("正三角形");
		} else if (a == b || b == c || a == c) {
			System.out.println("等腰三角形");
		} else if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
			System.out.println("直角三角形");
		} else {
			System.out.println("其他三角形");
		}

		s.close();
	}

}
