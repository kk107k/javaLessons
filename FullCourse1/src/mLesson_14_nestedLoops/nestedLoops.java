package mLesson_14_nestedLoops;

public class nestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//nested for loops = loop inside loop
		
		//declaring x and y
		int x = 5;
		int y = 5;
		String z = "z";
		
		//nested for loop
		for(int i = 1; i <= x; i++) {
			System.out.println();
			for(int j = 1; j <= y; j++) {
				System.out.print(z);
			}
		}

	}

}
