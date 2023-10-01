package hw6;

public class Calculator {

	private int x;
	private int y;
	
	public void powerXY(int x, int y) throws CalException {
		
		if(x == 0 && y == 0) {
			// x與y同時為0，(產生自訂的CalException例外物件)
			throw new CalException("0的0次方沒有意義！");
		}else if(y < 0) {
			// y為負值，而導致x的y次方結果不為整數
			throw new CalException("次方為負值，結果回傳不為整數！");
		}else {
			int result = (int) Math.pow(x, y);
			System.out.println(x + "的" + y + "次方等於" + result);
		}
		
	}
	
}
