package hw5;

public class Question02 {

	public static void randAvg() {
		int num;
		int[] arr = new int[10];
		for(int i = 0; i < 10; i++) {
			num = (int)(Math.random()*101);
			System.out.print(num + " ");
			arr[i] = num;
		}
		
		System.out.println();
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		int avg = sum / 10;
		System.out.println("平均值為 = " + avg);
	}
	
	
	// 測試
	public static void main(String[] args) {
		
		randAvg();
		
	}
	
}
