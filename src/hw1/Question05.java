package hw1;

public class Question05 {

	public static void main(String[] args) {

		double money = 1_500_000;
		double sum = money * (Math.pow((1.0 + 0.02), 10.0));

		System.out.printf("%.2f", sum);

	}

}
