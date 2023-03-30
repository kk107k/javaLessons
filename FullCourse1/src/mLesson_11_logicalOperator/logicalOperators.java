package mLesson_11_logicalOperator;

public class logicalOperators {
	
	public static void main(String[] args) {
		
		//Logical Operators are
		// && = And = both conditions must be true
		// || = Or  = one of conditions must be true
		// !  = Not = not expression 
		
		//Example for '&&' operator
		int x = 1;
		int y = 2;
		
		if (x == 2) {
			System.out.println("x is 2");
		}
		else if(x == 1 && x > 0) {
			System.out.println("x is 1 and greater than 0");
		}
		else {
			System.out.println("x is out of range");
		}
		
		//Example for '||' operator
		String z = "y";
		
		if(z.equals("Z") || z.equals("z")) {
			System.out.println("z found");
		}
		else {
			System.out.println("z not found");
		}
		
		//Example for '!' operator
		String n = "y";
		
		if(!n.equalsIgnoreCase("n")) {
			System.out.println("n not found");
		}
		else if(n.equalsIgnoreCase("n")){
			System.out.println("n found");
		}
		
		
		
	}

}
