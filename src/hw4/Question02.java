package hw4;

public class Question02 {

	public static char[] reverse(String s) {

		char[] a1 = new char[s.length()];
		for (int i = s.length() - 1; i >= 0; i--) {
			a1[(s.length() - 1) - i] = s.charAt(i);
		}

		return a1;

	}

	public static void main(String[] args) {
		String s = "Today is Tuesday";
		char[] a = new char[s.length()];
		a = reverse(s);
		for (int k = 0; k < s.length(); k++) {
			System.out.print(a[k]);
		}
	}

}
