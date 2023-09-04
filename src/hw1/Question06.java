package hw1;

public class Question06 {

	public static void main(String[] args) {

		System.out.println(5 + 5);
		// 5與5相加而得10

		System.out.println(5 + '5');
		// 數字5與字元'5'相加總和；字元'5'係因Unicode表示法在Java中可視為int整數，可轉換為'\u0035'
		// 從Unicode十六進位0035轉換成十進位為53，所以5+53=58

		System.out.println(5 + "5");
		// 數字5與字串5文字串接而得55

	}

}
