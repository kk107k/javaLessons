package mLesson_22_methods;

public class methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Methods
		
		
		String abc = "abcde";
		int numbers = 1234;
		//calling method we made taking giving two parameters
		alphabets(abc,numbers);
		
		
		int x = 3;
		int y = 4;
		
		//calling the add method we made
		int z = add(x,y);
		System.out.println(z);
	}
	
	//a method that takes two parameter and prints them
	static void alphabets(String letters, int integer) {
		System.out.println("alphabets = "+ letters+ "\nnumbers = "+ integer);
	}
	
	//a method that takes two parameters and adds them and returns to result
	static int add(int x, int y) {
	int result = x + y;
	return result;
	}

}
