package hw5;

public class Question05 {

	public void genAuthCode() {
		
		char[] arr = new char[8];
		String UpperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String LowerCase = "abcdefghijklmnopqrstuvwxyz";
		
		for(int i = 0; i < arr.length; i++) {
			// 先判斷要放大寫、小寫字母或數字(隨機code 1, 2, 3)
			int code = (int)(Math.random()*3)+1;
			// if code = 1, 放入隨機大寫字母
			if(code == 1) {
				int j = (int)(Math.random()*26);
				arr[i] = UpperCase.charAt(j);
			// if code = 2, 放入隨機小寫字母
			}else if(code == 2) {
				int j = (int)(Math.random()*26);
				arr[i] = LowerCase.charAt(j);
			// if code = 3, 放入隨機數字0~9
			}else if(code == 3) {
				arr[i] = (char)(((int)(Math.random()*10))+48); // int轉型成char
			}
		}
		
		System.out.println("本次隨機產生的驗證碼為：");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
	
	
	// 測試
	public static void main(String[] args) {
		
		Question05 test = new Question05();
		test.genAuthCode();
		
	}
	
}
