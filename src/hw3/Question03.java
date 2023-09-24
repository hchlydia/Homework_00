package hw3;

import java.util.Scanner;

import java.util.Arrays;

public class Question03 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("阿文...這次你要討厭哪個數字？");
		int i = s.nextInt();

		// 印出可以選擇的號碼與總數
		
//		int count = 0;
//		for (int j = 1; j <= 49; j++) {
//			if (!(j % 10 == i || (j >= i * 10 && j <= i * 10 + 9))) {
//				System.out.print(j + "\t");
//				count++;
//
//				if (count == 6) {
//					System.out.println();
//					count = 0;
//				}
//			}
//
//		}
//		if (i <= 4) {
//			System.out.println("總共有35個數字可選");
//		} else if (i > 4) {
//			System.out.println("總共有44個數字可選");
//		}
		
		
		// 亂數印出6個號碼且不重複
		// 重複已解決
		int count;
		int[] numbers = new int[6]; // 用來放已隨機出的數字，以便使用Arrays.binarySearch()方法檢查
		
		for (count = 0; count < 6; count++) {
			int j = (int)(Math.random()*49)+1;
			if( j % 10 == i || ((j >= i * 10 && j <= i * 10 + 9))) {
				count--;
				continue;
			}else if(Arrays.binarySearch(numbers, j) >= 0) {
				count--;
				continue;
			}else {
				numbers[0] = j;  // 因為下一行會執行排序，所以index不用numbers，用排序後一定會空下來的(有初始值0的)index 0位置
				Arrays.sort(numbers);
			}
		}

		for(int k = 0; k < numbers.length; k++) {
			System.out.print(numbers[k] + " ");
		}
		
		
		s.close();
	}
}
