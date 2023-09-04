package hw1;

public class Question03 {

	public static void main(String[] args) {

		int days = 256559 / (60 * 60 * 24); // (60*60*24)為一天有多少秒之計算
		int daysleft = 256559 % (60 * 60 * 24);

		int hours = daysleft / (60 * 60); // (60*60)為一小時有多少秒之計算
		int hoursleft = daysleft % (60 * 60);

		int min = hoursleft / 60;

		int sec = hoursleft % 60;

		System.out.println(days + "天");
		System.out.println(hours + "小時");
		System.out.println(min + "分");
		System.out.println(sec + "秒");

	}

}
