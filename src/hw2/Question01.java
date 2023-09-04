package hw2;

public class Question01 {

	public static void main(String[] args) {

		// 1~1000的偶數
		for (int i = 1; i <= 1000; i++) {
			if (i % 2 == 0) {
				System.out.print(i + "\t");
			}
		}

		System.out.println();
		System.out.println("------------");

		// (2+4+6+8+...+1000)的總和
		int sum = 0;

		for (int i = 1; i <= 1000; i++) {
			if (i % 2 == 0) {
				sum += i;
				continue;
			}
		}
		System.out.println(sum);

	}

}
