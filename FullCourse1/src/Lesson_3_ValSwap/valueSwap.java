package Lesson_3_ValSwap;

public class valueSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Swapping values
		
		int x = 1;
		int y = 2;
		int z = 0;
		
		System.out.println("x = " +x + "\ny = " +y +"\nnow we swap");
		
		//z will take what is in x
		z = x;
		
		//x will take what is in y
		x = y;
		
		//y will take what is in z
		y = z;
		
		System.out.println("x = " +x + "\ny = " +y);
		
	}

}
