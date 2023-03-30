package Lesson_8_randGen;

import java.util.Random;

public class randGen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Random generator
		
		//random generation
		Random random = new Random();
		
		//generating random number between 0-9
		int x = random.nextInt(10);
		
		System.out.println(x);
		
		//double gives value between 0 and 1
		double y = random.nextDouble();
		
		System.out.println(y);
		
		//generates true or false randomly
		boolean z = random.nextBoolean();
		
		System.out.println(z);
	}

}
