package hw4;

public class Question06 {
	
	static int[][] scores = {
			{10, 35, 40 , 100, 90, 85, 75, 70},
			{37, 75, 77, 89, 64, 75, 70, 95},
			{100, 70, 79, 90, 75, 70, 79, 90},
			{77, 95, 70, 89, 60, 75, 85, 89},
			{98, 70, 89, 90, 75, 90, 89, 90},
			{90, 80, 100, 75, 50, 20, 99, 75}
		};
	
	
	
	public static void main(String[] args) {
		
		int[] countHighestTimes = new int[8]; // 計算8位同學最高分次數
		
		for(int i = 0; i < scores.length; i++) {
			int maxScore = 0;
			int maxStudent = 0;
			for(int j = 0; j < scores[i].length; j++) {
				if(scores[i][j] > maxScore) {
					maxScore = scores[i][j];
					maxStudent = j;
				}
			}
			countHighestTimes[maxStudent]++;
		}
		
		for(int k = 0; k < countHighestTimes.length; k++) {
			System.out.println("第" + (k+1) + "位同學考最高分的次數是" + countHighestTimes[k] + "次");
		}
		
		
	}
}
