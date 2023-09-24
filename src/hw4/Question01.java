package hw4;

public class Question01 {

	public static void main(String[] args) {

		int[] arr = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };

		// 平均值
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		System.out.println("平均值 = " + (total / arr.length));

		System.out.println("=======");

		// 大於平均值的元素
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] > (total / arr.length)) {
				System.out.println(arr[j]);
			}
		}
	}
}
