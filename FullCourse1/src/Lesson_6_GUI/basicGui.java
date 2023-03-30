package Lesson_6_GUI;

import javax.swing.JOptionPane;

public class basicGui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//GUI graphical user interface
		
		//showInputDiaglog opens little interface with "Input"
		String stringInput = JOptionPane.showInputDialog("Input something");
		
		//showMessageDialog output your message
		JOptionPane.showMessageDialog(null, "output: " + stringInput);
		
		//Integer.parseInt allows input of integer
		int number = Integer.parseInt(JOptionPane.showInputDialog("input number"));
		
		JOptionPane.showMessageDialog(null, "output: " + number);
		
		//Double.parseDouble allows input of decimal number
		double doubleNumber = Double.parseDouble(JOptionPane.showInputDialog("input decimal number"));
		
		JOptionPane.showMessageDialog(null, "output: " + doubleNumber);
	}

}
