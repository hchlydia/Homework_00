package hw_ext;

public class InkBrush extends Pen {

	public InkBrush() {
		
	}
	
	public InkBrush(String brand, double price) {
		super(brand, price*0.9);
	}
	
	public void write() {
		System.out.println("沾墨汁再寫");
	}
	
	// override方法
//	public void setPrice(double price) {
//		price = price*0.9;
//	}
	
}
