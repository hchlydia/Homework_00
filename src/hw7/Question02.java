package hw7;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.io.*;

public class Question02 {

	public static void main(String[] args) {
		
		try {
			Set<Integer> set = new HashSet<Integer>();
			while(set.size() != 10){
				int r = ((int)(Math.random()*1000) + 1);
				set.add(r);
			}
			
			Iterator<Integer> it = set.iterator();
			while(it.hasNext()) {
				System.out.print(it.next() + " ");
			}
			
			
			FileOutputStream fos = new FileOutputStream("C:\\THA104_Workspace\\Homework_15\\Data.txt", true);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			PrintStream p = new PrintStream(bos);
			
			p.println(set);
			
			p.close();
			bos.close();
			fos.close();
		
		}catch(IOException e) {
			
		}
	}	
	
}
