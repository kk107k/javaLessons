package mLesson_36_superKeyword;

public class Details {

	String color;
	double price;
	
	Details (String color, double price) {
	this.color = color;
	this.price = price;
	}
	
	public String toString() {
		return this.color + " " + this.price;
	}
}

