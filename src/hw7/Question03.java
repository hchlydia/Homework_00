package hw7;

import java.io.*;

public class Question03 {

	public static void copyFile(String f1, String f2) {
		
		File in = new File(f1);
		File out = new File(f2);
		
		try {
			FileInputStream fis = new FileInputStream(in);
			FileOutputStream fos = new FileOutputStream(out);
			int i;
			
			while((i = fis.read()) != -1) {
				fos.write(i);
				System.out.print((char)i);
				System.out.flush();
			}
			
			fos.close();
			fis.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	// 測試
	public static void main(String[] args) {
		
		String f1 = "C:\\THA104_Workspace\\Homework_15\\Test1.txt";
		String f2 = "C:\\THA104_Workspace\\Homework_15\\Test2.txt";
		copyFile(f1, f2);
		
	}
	
}
