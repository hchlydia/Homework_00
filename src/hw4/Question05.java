package hw4;

import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("請輸入3個整數代表西元年/月/日：");
		int year = s.nextInt();
		int month = s.nextInt();
		int day = s.nextInt();
		
		// 擋下錯誤輸入：月份
		if(month <= 0 || month > 12) {
			System.out.println("月份輸入錯誤，請輸入1~12月");
			month = s.nextInt();
		}
		
		
		// 擋下錯誤輸入：一個月有幾天
		
		// 天數 | 月份
		// 31天: 1, 3, 5, 7, 8, 10, 12
		// 30天: 4, 6, 9, 11
		// 28天/29天(閨年): 2
		if(year % 4 != 0 
			&& (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) 
			&& (day <= 0 || day > 31)) {
			System.out.println("日期輸入錯誤，請輸入1~31日");
			day = s.nextInt();
		}else if(year % 4 != 0
			&&  (month==4 || month==6 || month==9 || month==11)
			&& (day <= 0 || day > 30)) {
			System.out.println("日期輸入錯誤，請輸入1~30日");
			day = s.nextInt();
		}else if(year % 4 != 0 && month==2 && (day <= 0 || day > 28)) {
			System.out.println("日期輸入錯誤，請輸入1~28日");
			day = s.nextInt();
		}else if(year % 4 == 0 && month==2 && (day <= 0 || day > 29)) {
			System.out.println("日期輸入錯誤，請輸入1~29日");
			day = s.nextInt();
		}
		
		
		
		int daysCount = 0;
		int[] daysOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		// 判斷是否為閨年
		if(year % 4 == 0 && month > 2) {
			for(int i = 0; i < month-1; i++) {
				daysCount += daysOfMonth[i];
			}
			daysCount += day + 1;
		}else{
			for(int i = 0; i < month-1; i++) {
				daysCount += daysOfMonth[i];
			}
			daysCount += day;
		}
		
		
		System.out.println("輸入的日期為該年第" + daysCount + "天");
		
		s.close();
	}
	
}
