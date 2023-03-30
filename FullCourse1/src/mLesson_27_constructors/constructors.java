package mLesson_27_constructors;

public class constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//constructors
		
		Clothes clothes = new Clothes("Shirt ","H&M ",800);
		
		clothes.buy();
		
		clothes.noBuy();
		
		System.out.println(clothes.brand);
	}

}
