package hw4;

public class Question03 {

	public static int vowel(String[] s) {

//		int i = s.length;
//		int j = s[i].length();
		int count = 0;

		// 1. 先算有幾個元素 2. 元素有幾個字元 3. 字元if是母音true，count計數
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length(); j++) {
				if (s[i].charAt(j) == 'a' || s[i].charAt(j) == 'e' || s[i].charAt(j) == 'i' || s[i].charAt(j) == 'o'
						|| s[i].charAt(j) == 'u') {
					count++;
				}
			}
		}

		return count;

	}

	public static void main(String[] args) {

		String[] s = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		System.out.println(vowel(s));
	}

}
