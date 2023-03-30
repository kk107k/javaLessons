package mLesson_15_arrays;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Arrays
		//used to hold multiple values in a variable
		
		//array with 5 elements, starting from 0 to 4
		String[] array = {"1","2","3","4",""};
		
		//can change the any element with a new element
		array[4] = "5";
		
		System.out.println(array[4]+"\n");
		
		//can also write like this
		String[] newArray = new String[3];
		
		//filling the array
		newArray[0] = "0";
		newArray[1] = "1";
		newArray[2] = "2";
		
		System.out.println(newArray[2]+"\n");
		
		//iterating through array using for loop
		for(int i = 0; i < newArray.length; i++) {
			System.out.println(newArray[i]);
		}
	}

}
