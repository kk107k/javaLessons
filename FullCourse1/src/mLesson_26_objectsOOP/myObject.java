package mLesson_26_objectsOOP;

public class myObject {
	
	String item = "Pants ";
	String make = "Louis Vuitton ";
	String color = "brown ";
	int size = 32;
	double price = 800;
	
	void wear() {
		System.out.println("Your are wearing " + color + make + item);
	}
	
	void buy() {
		System.out.println("You bought " + make + item +" for $" + price);
	}

}
