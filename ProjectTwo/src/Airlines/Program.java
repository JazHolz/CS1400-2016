package Airlines;

import javax.swing.JOptionPane;

import java.util.Arrays;

public class Program {

	public static void main(String[] args) {
		int totalSeats = 20;
		int firstClassSeats = 6;
		int economySeats = 14;
		int classChoice = 0;
		boolean continueInput = true;

		boolean[] seatingChart = new boolean[totalSeats];
		Arrays.fill(seatingChart, false);

		while (continueInput == true) {
			classChoice = Integer.parseInt(JOptionPane.showInputDialog(null, null,
					"1: First Class, 2: Economy Class, 3: Next Flight", JOptionPane.QUESTION_MESSAGE));

			switch (classChoice) {
			case 1:
				if (firstClassSeats > 0) {
					seatingChart[firstClassSeats - 1] = true;
					firstClassSeats--;
					printBoardingPass((firstClassSeats + 1), classChoice);
				} else {
					JOptionPane.showMessageDialog(null, "First Class is no longer avaiable", null,
							JOptionPane.INFORMATION_MESSAGE);
					JOptionPane.showMessageDialog(null,
							"If you would like Economy Class select 2, Next Flight select 3. ", null,
							JOptionPane.INFORMATION_MESSAGE);
				}
				break;

			case 2:
				if (economySeats > 0) {
					seatingChart[economySeats + 4] = true;
					economySeats--;
					printBoardingPass((economySeats + 6), classChoice);
				} else {
					JOptionPane.showMessageDialog(null, "Economy Class is no longer avaiable", null,
							JOptionPane.INFORMATION_MESSAGE);
					JOptionPane.showMessageDialog(null,
							"If you would like First Class select 1, Next Flight select 3. ", null,
							JOptionPane.INFORMATION_MESSAGE);
				}
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Next Flight leaves in 3 hours.", null,
						JOptionPane.INFORMATION_MESSAGE);
				continueInput = false;
				break;
			default:
				classChoice = Integer.parseInt(JOptionPane.showInputDialog(null, null,
						"Incorrect input.  Please enter only a 1, 2, or 3.", JOptionPane.QUESTION_MESSAGE));
				break;
			}
		}
	}

	private static void printBoardingPass(int seat, int classChoice) {
		String seatingClass = (classChoice == 1 ? "First" : "Economy");
		JOptionPane.showMessageDialog(null, "\nBoarding Pass:  " + seatingClass + " class, Seat # " + seat + "\n\n",
				null, JOptionPane.INFORMATION_MESSAGE);
	}
}
