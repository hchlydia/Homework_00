package hw8;

import java.math.BigInteger;
import java.util.*;

public class Question01 {

	public static void main(String[] args) {
		
		 ArrayList c = new ArrayList();
		 Object obj = new Object();
		 
		 c.add(new Integer(100));
		 c.add(new Double(3.14));
		 c.add(new Long(21L));
		 c.add(new Short("100"));
		 c.add(new Double(5.1));
		 c.add("Kitty");
		 c.add(new Integer(100));
		 c.add(obj);
		 c.add("Snoopy");
		 c.add(new BigInteger("1000"));
		
		 
		 // 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
		 Iterator it1 = c.iterator();
		 while(it1.hasNext()) {
			 System.out.println(it1.next());
		 }
		 
		 System.out.println("--------");
		 
		 for(int i = 0; i < c.size(); i++) {
			 System.out.println(c.get(i));
		 }
		 
		 System.out.println("--------");
		 
		 for(Object objs : c) {
			 System.out.println(objs);
		 }
		 
		 
		 // 移除不是java.lang.Number相關的物件
		 c.remove("Kitty");
		 c.remove(obj);
		 c.remove("Snoopy");
		 
		 
		 // 再次印出這個集合物件的所有元素，觀察是否已將非Number相關的物件移除成功
		 System.out.println("--------");
		 Iterator it2 = c.iterator();
		 while(it2.hasNext()) {
			 System.out.println(it2.next());
		 }
		 
	}
	
}
