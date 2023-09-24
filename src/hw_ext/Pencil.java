package hw_ext;

public class Pencil extends Pen {

	public Pencil() {
		
	}
	
	public Pencil(String brand, double price) {
		super(brand, price*0.8);
	}
	
	public void write() {
		System.out.println("削鉛筆再寫");
	}
	
	// override方法
//	public void setPrice(double price) {
//		price = price*0.8;
//	}
	
}
