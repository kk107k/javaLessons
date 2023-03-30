package mLesson_29_overloadedConstructors;

public class overloadedConstructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//overloaded constructors
		
		Clothes clothes = new Clothes(null,null,"blue");
		
		System.out.println("You are wearing");
		System.out.println(clothes.hat + " hat");
		System.out.println(clothes.shirt + " shirt");
		System.out.println(clothes.pants + " pants");
		System.out.println("Size " + clothes.shoeSize + " " + clothes.shoes + " shoes");
	}

}
