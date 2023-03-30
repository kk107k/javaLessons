package mLesson_33_staticKeywords;

public class staticKeywords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//static keyword modifier
		
 		Shirts shirt1 = new Shirts("red");
 		Shirts shirt2 = new Shirts("red");
 		Shirts shirt3 = new Shirts("red");
		
		System.out.println(Shirts.numberOfShirts);
		
		Shirts.Printer();

	}

}
