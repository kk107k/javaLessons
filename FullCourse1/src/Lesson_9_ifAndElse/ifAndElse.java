package Lesson_9_ifAndElse;

public class ifAndElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//if statement
		
		int x = 5;
		
		if(x < 3) {
			System.out.println("x is less than 3");
		}
		else if(x == 3 ) {
			System.out.println("x is 3");
		}
		
		else if(x != 3 ) {
			System.out.println("x is not 3");
		}
		
		else if(x == 1 || x == 5 ) {
			System.out.println("x is 1 or 5");
		}
		
		else {
			System.out.println("x is more than 3");
		}
		
	}

}
