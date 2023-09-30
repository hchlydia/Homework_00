package hw8;

import java.util.*;

public class Question02 {

	public static void main(String[] args) {
		
		// (1) 請寫一隻程式，能印出不重複的Train物件
		Set set = new HashSet();
		set.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		set.add(new Train(1254, "區間", "屏東", "基隆", 700));
		set.add(new Train(118, "自強", "高雄", "台北", 500));
		set.add(new Train(1288, "區間", "新竹", "基隆", 400));
		set.add(new Train(122, "自強", "台中", "花蓮", 600));
		set.add(new Train(1222, "區間", "樹林", "七堵", 300));
		set.add(new Train(1254, "區間", "屏東", "基隆", 700));
		
		Iterator it = set.iterator();
		while(it.hasNext()) {
			((Train)it.next()).getTrain();
		}
		
		
		// (2) 請寫一隻程式，讓Train物件印出時，能以班次編號由大到小印出
		System.out.println("------");
		List list = new ArrayList();
		list.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		list.add(new Train(1254, "區間", "屏東", "基隆", 700));
		list.add(new Train(118, "自強", "高雄", "台北", 500));
		list.add(new Train(1288, "區間", "新竹", "基隆", 400));
		list.add(new Train(122, "自強", "台中", "花蓮", 600));
		list.add(new Train(1222, "區間", "樹林", "七堵", 300));
		list.add(new Train(1254, "區間", "屏東", "基隆", 700));
		
		Collections.sort(list);
		
		for(int i = 0; i < list.size(); i++) {
			((Train)list.get(i)).getTrain();
		}
		
		
		// (3) 承上，不僅能讓班次編號由大排到小印出， 還可以不重複印出Train物件
		System.out.println("------");
		Set ts = new TreeSet();
		ts.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		ts.add(new Train(1254, "區間", "屏東", "基隆", 700));
		ts.add(new Train(118, "自強", "高雄", "台北", 500));
		ts.add(new Train(1288, "區間", "新竹", "基隆", 400));
		ts.add(new Train(122, "自強", "台中", "花蓮", 600));
		ts.add(new Train(1222, "區間", "樹林", "七堵", 300));
		ts.add(new Train(1254, "區間", "屏東", "基隆", 700));
		
		for(Object obj : ts) {
			Train tr = (Train) obj;
			tr.getTrain();
		}
		
	}
	
}
