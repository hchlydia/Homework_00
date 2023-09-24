package hw5;

import java.util.Scanner;

public class Question01 {
	
	public static void starSquare(int width, int height) {
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入長方形寬與高兩個數字：");
		int width = sc.nextInt();
		int height = sc.nextInt();
		starSquare(width, height);
		
		sc.close();
	}
	
}
