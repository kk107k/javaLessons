package mLesson_23_overloadedMethods;

public class overloadedMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//overloaded methods
		
		//the method is called depending on how many parameters are given to the method add
		int result1 = add(1,1);
		System.out.println(result1);
		int result2 = add(1,1,1);
		System.out.println(result2);
		int result3 = add(1,1,1,1);
		System.out.println(result3);
	}
	//method that takes 2 parameter and adds
	static int add(int x, int y) {
		System.out.println("method 1");
		return x + y;
	}
	//method that takes 3 parameters and adds
	static int add(int x, int y, int z) {
		System.out.println("method 2");
		return x + y + z;
	}
	//method that takes 4 parameters and adds
	static int add(int x, int y, int z, int n) {
		System.out.println("method 3");
		return x + y + z + n;
	}

}
