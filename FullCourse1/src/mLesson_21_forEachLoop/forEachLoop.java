package mLesson_21_forEachLoop;

import java.util.ArrayList;

public class forEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for loop
		
		String[] abc = {"a","b","c","d"};
		
		//for each i in abc, print i
		for(String i : abc) {
			System.out.println(i);
		}
		
		ArrayList<String> numbers = new ArrayList<String>();
		
		numbers.add("1");
		numbers.add("2");
		numbers.add("3");
		numbers.add("4");
		
		for(String i : numbers) {
			System.out.println(i);
		}
		
	}

}
