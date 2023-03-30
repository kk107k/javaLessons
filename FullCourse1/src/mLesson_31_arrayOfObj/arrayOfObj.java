package mLesson_31_arrayOfObj;

public class arrayOfObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Closet shirts = new Closet("shirts");
		Closet pants = new Closet("pants");
		Closet shoes = new Closet("shoes");
		
		Closet[] clothes = {shirts,pants,shoes};
		/*
		 * Closet[] clothes = new Closet[shirts,pants,shoes];
		 * 
		 * clothes[0] = shirts; clothes[1] = pants; clothes[2] = shoes;
		 */
		
		System.out.println(clothes[0].name);
		
		
		
	}

}
