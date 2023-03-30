package mLesson_32_objectPassing;

public class objectPassing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//object passing
		
		
		Closet closet = new Closet();
		Clothes clothes = new Clothes("shirt");

		Clothes clothes2 = new Clothes("pants");
		
		closet.fill(clothes);
		
		closet.fill(clothes2);
	}

}
