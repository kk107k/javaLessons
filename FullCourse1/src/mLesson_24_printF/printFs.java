package mLesson_24_printF;

public class printFs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//printf() method
		
		System.out.printf("  a %d b  c  ",123);
		
		boolean myBoolean = true;
		char myChar = '#';
		int myInt = 2000000;
		double myDouble = 2.2;
		String myString = "hello";
		
		System.out.printf("\na %b b c d e",myBoolean);
		System.out.printf("\na b %c c d e",myChar);
		System.out.printf("\na b c %,d d e",myInt);
		System.out.printf("\na b c d %.2f e",myDouble);
		System.out.printf("\na b c d e %s",myString);
		
		System.out.printf("\na %10s b c d e",myString);
	}

}
