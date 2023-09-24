package hw4;

import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		
		int[][] arr = {
						{25, 2500},
						{32, 800},
						{8, 500},
						{19, 1000},
						{27, 1200}
					  };
		
		Scanner s = new Scanner(System.in);
		System.out.println("請輸入欲借的金額：");
		int borrow = s.nextInt();
		
		
		System.out.print("有錢可借的員工編號：");
		
		// 先找出能借的人，count計數
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i][1] >= borrow) {
				System.out.print(arr[i][0] + " ");
				count++;
			}
		}
		System.out.print("共" + count + "人！");
	
		s.close();
	}
	
}
