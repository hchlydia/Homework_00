package hw7;

import java.io.*;

public class Question01 {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\THA104_Workspace\\Sample.txt");
		FileReader fr = new FileReader(f);
		BufferedReader bis = new BufferedReader(fr);
		int i;
		int count = 0;
		while((i = bis.read()) != -1) {
			bis.readLine();
			count++;
		}
		
		int xxx = (int)f.length();
		int yyy = (int)(f.length()/2);
		int zzz = count;
		
		
		System.out.println("共有" + xxx + "個位元組");
		System.out.println(yyy + "個字元");
		System.out.println(zzz + "列資料");
		
			
		bis.close();
		fr.close();

	}
}
