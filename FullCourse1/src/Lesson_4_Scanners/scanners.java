package Lesson_4_Scanners;

import java.util.Scanner;

public class scanners {

public static void main(String[] arg) {
		
		//Scanners
		
		//creates scanner called scanner
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("input string");
		
		//scanner.nextLine takes string input and clears scanner
		String stringInput = scanner.nextLine();
		
		System.out.println(stringInput);
		
		System.out.println("input integer");
		
		//scanner.nextInt takes integer input but leave \n in the scanner
		int numberInput = scanner.nextInt();
		//in order to use scanner again before the next line of code runs, use scanner.nextLine() immediately after scanner.nextInt() to clear out scanner
		scanner.nextLine();
		System.out.println(numberInput);
		
		System.out.println("input another integer");
		
		int numberInput2 = scanner.nextInt();
		
		System.out.println(numberInput2);
	}

}
