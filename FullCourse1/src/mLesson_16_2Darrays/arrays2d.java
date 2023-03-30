package mLesson_16_2Darrays;

public class arrays2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//2D array
		
		//an array with rows and columbs
		
		
		String[][] array2D = {{"a","b","c"},
							  {"d","e","f"},
							  {"g","h","i"}};
		//nested for loop to print the contents of array2D
		for(int i = 0; i < array2D.length; i++) {
			System.out.println();
			for(int j = 0; j < array2D[i].length; j++) {
				System.out.print(array2D[i][j]);
			}
		}
		
		System.out.println();
		
		//another way to do it is this way
		String[][] array2d = new String[3][3];
		
		array2d[0][0] = "a";
		array2d[0][1] = "b";
		array2d[0][2] = "c";
		
		array2d[1][0] = "d";
		array2d[1][1] = "e";
		array2d[1][2] = "f";
		
		array2d[2][0] = "g";
		array2d[2][1] = "h";
		array2d[2][2] = "i";
		
		for(int k = 0; k < array2d.length; k++) {
			System.out.println();
			for(int l = 0; l < array2d[k].length; l++) {
				System.out.print(array2d[k][l]);
			}
		
	}

	}
}
