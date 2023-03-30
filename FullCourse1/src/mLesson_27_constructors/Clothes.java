package mLesson_27_constructors;

public class Clothes {
	
	String item;
	String brand;
	double price;
	
	Clothes(String item, String brand, double price) {
		
		this.item = item;
		this.brand = brand;
		this.price = price;
		
	}
	
	void buy() {
		System.out.println("Thank you for buying "+brand+item+" for $"+price);
	}
	
	void noBuy() {
		System.out.println("No problem, come again later");
	}
	

}
