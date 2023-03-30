package mLesson_19_arrayList;

import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array lists = resizable array
		
		
		//creating the array list
		ArrayList<String> abc = new ArrayList<String>();
		
		//adding elements to the list
		abc.add("a ");
		abc.add("b ");
		abc.add("c ");
		
		//setting the element at index 2 of the list to d
		abc.set(2, "d");
		
		//removing the element at index 2
		abc.remove(2);
		
		//clearing the array list
		abc.clear();
		
		//use .size to get the size of array list
		for(int i=0; i<abc.size(); i++) {
			//use .get to get an element from array list
			System.out.println(abc.get(i));
		}
		
	}

}
 