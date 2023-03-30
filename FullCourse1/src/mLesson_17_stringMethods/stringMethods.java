package mLesson_17_stringMethods;

public class stringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//different methods for the String class
		
		String x = "x";
		
		//if x equals to "x" then returns true but false if "X"
		boolean result = x.equals("x");
		
		System.out.println(result);
		
		//if x equals to "x" or "X" then returns true
		boolean result2 = x.equalsIgnoreCase("X");
				
		System.out.println(result2);
		
		String z = "abcde";
		
		//returns the length of characters in string z
		int result3 = z.length();
		
		System.out.println(result3);
		
		//returns the character at index 2 in string z
		char result4 = z.charAt(2);
		
		System.out.println(result4);
		
		//returns the index of the chat e in string z
		int result5 = z.indexOf("e");
		
		System.out.println(result5);
		
		//returns true if z is absolutely empty
		boolean result6 = z.isEmpty();
		
		System.out.println(result6);
		
		//will make every character in z into uppercase
		String result7 = z.toUpperCase();
		
		System.out.println(result7);
		
		//will make every character in result7 which is now uppercase of z, into lowercase
		String result8 = result7.toLowerCase();
		
		System.out.println(result8);
		
		String y = "       abcdf     ";
		
		//will remove all blank spaces before and after characters in y
		String result9 = y.trim();
		
		System.out.println(result9);
		
		//will replace "a" to "1" in string result9
		String result10 = result9.replace("f", "e");
		
		System.out.println(result10);
		
			
	}

}
