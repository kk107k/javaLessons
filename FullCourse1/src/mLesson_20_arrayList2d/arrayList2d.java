package mLesson_20_arrayList2d;

import java.util.*;

public class arrayList2d {
	
	public static void main(String[] args) {
		
		//2D array list
		
		//making a full array list to add all the lists to it
		ArrayList<ArrayList<String>> fullList = new ArrayList();
		
		//making array list for abc
		ArrayList<String> abc = new ArrayList<String>();
		
		//adding elements to list
		abc.add("a");
		abc.add("b");
		abc.add("c");
		
		//making array list for numbers
		ArrayList<String> numbers = new ArrayList<String>();
		
		//adding numbers to it
		numbers.add("1");
		numbers.add("2");
		numbers.add("3");
		
		//making array list for characters
		ArrayList<String> characters = new ArrayList<String>();
		
		//adding characters to it
		characters.add("$");
		characters.add("#");
		characters.add("@");
		
		//adding all the lists to the full list to make a 2d array list
		fullList.add(abc);
		fullList.add(numbers);
		fullList.add(characters);
		
		//the first .get takes the index of the list, the second .get is the index within that list
		System.out.println(fullList.get(2).get(1));
		
		
		
		
		
		
	}

}
