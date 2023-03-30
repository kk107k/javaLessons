package mLesson_36_superKeyword;

public class Clothes extends Details {
	
	String name;
	
	Clothes(String name, String color, double price) {
		super(color,price);
		this.name = name;
	}
	
	public String toString() {
		return super.toString()+" " + name;
		
	}

}
