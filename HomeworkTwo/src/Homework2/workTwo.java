package Homework2;

import javax.swing.JOptionPane;

public class workTwo {

	public static void main(String[] args) {

		// obtain user input from JOptionPane input dialogs

		String firstNumber = JOptionPane.showInputDialog("Enter an integer");

		int number1 = Integer.parseInt(firstNumber);

		String content = "";
		
		for (int x = 0; x <= number1; x++) {

			content +=(x + " \t" + (x * x) + " \t" + (x * x * x)+" \n");
		}
		System.out.println(content);
		String title = "Number "+ "Square "+ "Cube";

		JOptionPane.showMessageDialog(null, content, title, JOptionPane.PLAIN_MESSAGE);

	}
}