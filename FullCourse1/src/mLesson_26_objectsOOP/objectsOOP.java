package mLesson_26_objectsOOP;

public class objectsOOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//object = making a class that has attributes of an object
		
		myObject lvPants = new myObject();
		
		System.out.println(lvPants.make);
		System.out.println(lvPants.price);
		
		lvPants.buy();
		
		lvPants.wear();
	}

}
