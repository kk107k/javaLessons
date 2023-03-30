package mLesson_10_switches;

public class switches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 4;
		
		//for each case of what x could be, there is a different instance
		switch(x) {
			case 5: System.out.println("x = 5");
			//need to break out of every case or else all cases will print
			break;
			case 4: System.out.println("x = 4");
			break;
			case 3: System.out.println("x = 3");
			break;
			case 2: System.out.println("x = 2");
			break;
			case 1: System.out.println("x = 1");
			break;
			//default output if x does not match any of above cases
			default: System.out.println("x is out of range");
		}
	}

}
