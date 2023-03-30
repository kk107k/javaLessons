package mLesson_12_whileLoop;

import java.util.Scanner;

public class whileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//While loops
		
		Scanner scanner = new Scanner(System.in);
		
		
		String k = "";
		
		while(!k.equalsIgnoreCase("k")) {
			System.out.println("Input the letter k");
			k = scanner.nextLine();
			
		}
		
		System.out.println("k inputted");
		
		//Do loop same as while, but performs block at least once before checking if condition is met
		
		int x = 5;
		
		do{
			System.out.println("Input the number 5");
			x = scanner.nextInt();
		}while(x != 5 );
		
		System.out.println("5 inputted");
	}

}
