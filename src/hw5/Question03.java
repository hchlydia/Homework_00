package hw5;

public class Question03 {

	public int maxElement(int[][] x) {
		int maxNum = 0;
		for(int i = 0; i < x.length; i++) {
			for(int j = 0; j < x[i].length; j++) {
				if(x[i][j] > maxNum) {
					maxNum = x[i][j];
				}
			}
		}
		return maxNum;
	}
	
	public double maxElement(double[][] x) {
		double maxNum = 0;
		for(int i = 0; i < x.length; i++) {
			for(int j = 0; j < x[i].length; j++) {
				if(x[i][j] > maxNum) {
					maxNum = x[i][j];
				}
			}
		}
		return maxNum;
	}
	

	// 測試
	public static void main(String[] args) {
		int[][] intArr = {
							{1, 6, 3},
							{9, 5, 2}
						 };
		double[][] doubleArr = {
								{1.2, 3.5, 2.2},
								{7.4, 2.1, 8.2}
							   };
		
		Question03 q3 = new Question03();
		System.out.println(q3.maxElement(intArr));
		System.out.println(q3.maxElement(doubleArr));
		
	}
	
}
