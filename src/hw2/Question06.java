package hw2;

public class Question06 {

	public static void main(String[] args) {

		int i, j;

		for (i = 11; i >= 1; i--) {
			for (j = 1; j <= (i - 1); j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
