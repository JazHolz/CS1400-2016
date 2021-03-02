package project1;

import javax.swing.JOptionPane;

import java.util.Random;

public class GuessGame {

	public static void main(String[] args) {

		int random, numGuessed = 0, attemptsMade;

		Random generator = new Random();

		random = generator.nextInt(1000);

		attemptsMade = 1;

		while (numGuessed != random) {

			numGuessed = Integer.parseInt(JOptionPane.showInputDialog(null, null, "Guess a number between 1 and 1000",
					JOptionPane.QUESTION_MESSAGE));

			attemptsMade++;

			if (numGuessed > random) {

				JOptionPane.showMessageDialog(null, "Too high, try again", null, JOptionPane.INFORMATION_MESSAGE);

			} else if (numGuessed < random) {

				JOptionPane.showMessageDialog(null, "Too low, try again", null, JOptionPane.INFORMATION_MESSAGE);

			} else {

				JOptionPane.showMessageDialog(null, random + " is the correct answer, it took you " + attemptsMade
						+ " attempts to guess the correct answer. ", null, JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
}
