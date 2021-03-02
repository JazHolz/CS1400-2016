//CSIS 1400
//Final Project
//Jazmine Lavasani
//Made in Eclipse, Java, Version?

package final1400;

import java.util.*;
import javax.swing.*;

public class DiceSim {

	public static void main(String[] args) {
		
//introduction
		
		JOptionPane.showMessageDialog(null, "Let's play a game, \n"
				+ "We are going to roll a pair of dice 10,000 times.\n"
				+ "Lets get started!");
//images
		
		Icon icon1 = new ImageIcon("src/imgs/dice1.png");
		Icon icon2 = new ImageIcon("src/imgs/dice2.png");
		Icon icon3 = new ImageIcon("src/imgs/dice3.png");
		
//graphic displays of rolls
		
		JOptionPane.showMessageDialog(null, "Roll number one!", "Dice Roller", JOptionPane.INFORMATION_MESSAGE, icon1);

		JOptionPane.showMessageDialog(null, "Roll number two!", "Dice Roller", JOptionPane.INFORMATION_MESSAGE, icon2);

		JOptionPane.showMessageDialog(null, "Roll number three!", "Dice Roller", JOptionPane.INFORMATION_MESSAGE, icon3);

		final int num = 10000;
		Dice die1 = new Dice();
		Dice die2 = new Dice();
		
//variables
		
		int die1Val;
		int die2Val;
		int count;
		int snakeEyes = 0;
		int twos = 0;
		int threes = 0;
		int fours = 0;
		int fives = 0;
		int sixes = 0;
		
//for loop for 'rolling' dice
		
		for (count = 0; count < num; count++) {
			die1.roll();
			die1Val = die1.getSpots();
			die2.roll();
			die2Val = die2.getSpots();
			if (die1Val == die2Val) {
				if (die1Val == 1) {
					snakeEyes = snakeEyes + 1;
				} else if (die1Val == 2) {
					twos = twos + 1;
				} else if (die1Val == 3) {
					threes = threes + 1;
				} else if (die1Val == 4) {
					fours = fours + 1;
				} else if (die1Val == 5) {
					fives = fives + 1;
				} else if (die1Val == 6) {
					sixes = sixes + 1;
				}
			}
		}
		
//moves forward from graphic rolls
		
		JOptionPane.showMessageDialog(null, 
				"Now, after seeing those first three rolls, lets fast forward to rolling the dice 9,997 more times.\n"
				+ "It will show how many Snake Eyes, Doubles of Two's, Three's, Four's, Five's, and Six's.\n"
				+ "Lets see what we've got!");
		
//gives information on the 10,000 rolls
		
		JOptionPane.showMessageDialog(null,
				"Snake Eyes was rolled:\n" + "\t\t\t\t\t\t\t\t\t\t\t\t"+ snakeEyes + " out of " + count + " times.\n" + "\n" + 
				"Double Two's was rolled:\n" + "\t\t\t\t\t\t\t\t\t\t\t\t" + twos + " out of " + count + " times.\n" + "\n"+ 
				"Double Three's was rolled:\n" + "\t\t\t\t\t\t\t\t\t\t\t\t" + threes + " out of " + count + " times.\n"+ "\n" + 
				"Double Four's was rolled:\n" + "\t\t\t\t\t\t\t\t\t\t\t\t" + fours + " out of " + count + " times.\n" + "\n"+ 
				"Double Five's was rolled:\n" + "\t\t\t\t\t\t\t\t\t\t\t\t" + fives + " out of " + count + " times.\n" + "\n"+ 
				"Double Six's was rolled:\n " + "\t\t\t\t\t\t\t\t\t\t\t\t" + sixes + " out of " + count + " times.\n");
		
		JOptionPane.showMessageDialog(null, "Thanks for playing! Goodbye!");

	}

}