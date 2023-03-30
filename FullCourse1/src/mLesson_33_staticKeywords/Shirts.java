package mLesson_33_staticKeywords;

public class Shirts {

	String color;
	
	static int numberOfShirts;
	
	Shirts(String color){
		this.color = color;
		numberOfShirts++;
	}
	
	static void Printer() {
		System.out.println("You have "+numberOfShirts+ " shirts");
	}
}
