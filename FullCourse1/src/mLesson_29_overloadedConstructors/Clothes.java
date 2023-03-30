package mLesson_29_overloadedConstructors;

public class Clothes {
	

		
		String hat;
		String shirt;
		String pants;
		String shoes;
		double shoeSize;
		
	Clothes(String hat,String shirt,String pants,String shoes, Double shoeSize){
		this.hat = hat;
		this.shirt = shirt;
		this.pants = pants;
		this.shoes = shoes;
		this.shoeSize = shoeSize;
	}
	
	Clothes(String hat,String shirt,String pants,String shoes){
		this.hat = hat;
		this.shirt = shirt;
		this.pants = pants;
		this.shoes = shoes;

	}
	
	Clothes(String hat,String shirt,String pants){
		this.hat = hat;
		this.shirt = shirt;
		this.pants = pants;

	}
	
	Clothes(String hat,String shirt){
		this.hat = hat;
		this.shirt = shirt;

	}
	
	Clothes(String hat){
		this.hat = hat;

	}
	
}
