package mLesson_28_variableScope;

import java.util.Random;

public class Dice {
	
	Random random = new Random();
	int number = 0;
	
	Dice() {
	
	
	}
	
	void roll() {
		
		number = random.nextInt(6)+1;	
		System.out.println("dice rolled = " + number);
		
		}
	
}
