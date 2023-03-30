package mLesson_13_forLoops;

public class forLoops {

	public static void main(String[] args) {

		// for loops

		// will loop for as long as i is less than or = to 10 starting from i = 1
		for (int i = 1; i <= 10; i++) {

			System.out.println("Counting to " + i);

		}
		
		//can also write like this
		for (int i = 1; i <= 10; ) {

			System.out.println("Counting to " + i);
			i++;

		}
	}

}
