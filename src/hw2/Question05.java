package hw2;

public class Question05 {

	public static void main(String[] args) {

		// 可選擇的數字
		for (int i = 1; i <= 49; i++) {
			if (!(i % 10 == 4 || i >= 40)) {
				System.out.print(i + "\t");
			}
		}
		
		System.out.println();
		System.out.println("--------");
		
		// 總共有多少個
		int count = 0;
		
		for (int i = 1; i <= 49; i++) {
			if (!(i % 10 == 4 || i >= 40)) {
				count++;
			}
		}
		System.out.println(count);

	}

}
