package Lesson_7_basicMath;

public class basicMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//basic math
		
		double x = 1.1;
		double y = -1.1;
		
		double z = Math.max(x, y);
		
		System.out.println("Max = " + z);
		
		z = Math.min(x, y);
		
		System.out.println("Mi n= " +z);
		
		z = Math.abs(y);
		
		System.out.println("absolute = " +z);
		
		z = Math.sqrt(x);
		
		System.out.println("square root = " +z);
	
		z = Math.ceil(x);
		
		System.out.println("ceil= " +z);
		
		z = Math.floor(x);
		
		System.out.println("floor= " +z);
		
		
		z = Math.round(x);
		
		System.out.println("rounded= " +z);
		
	
	
	}

}

