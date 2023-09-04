package hw2;

public class Question07 {

	public static void main(String[] args) {

		char i, j;

		for (i = '\u0041'; i <= '\u0046'; i++) {
			for (j = '\u0041'; (i - j) >= 0; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
