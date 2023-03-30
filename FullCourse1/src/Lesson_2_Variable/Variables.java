package Lesson_2_Variable;

public class Variables {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Variables
		
	int x;
	
	x = 1;
	
	int y = 2;
	
	System.out.println(x + y);
	
	//maximum size for long
	long l = 1111111111111111111L;
	
	//maximum size for int
	int i = 1111111111;
	
	//maximum size for short
	short s = 11111;
		
	//will print rounded up to 7th digit
	float f = 1.11111111f;
	
	System.out.println(f);
	
	//will print rounded up to 15th digit 
	double d = 1.11111111111111111;
	
	System.out.println(d);
	
	//can hold string of any size depending on your JVM
	String str = "string";
	
	//can hold single character
	char c = 'c';
	
	System.out.println(str + c);
	
	//can be either true or false
	boolean b = true;
	
	System.out.println(b);
	}

}