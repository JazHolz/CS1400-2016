//CSIS 1400
//Final Project
//Jazmine Lavasani
//Made in Eclipse, Java, Version?

package final1400;

import java.util.Random;

public class Dice {

//variable 
	
	private int spots;

	private static Random generator;

// method for the random generator
	
	public Dice() {
		generator = new Random();
		spots = 0;
	}

//method for roll
	
	public void roll() {

		spots = generator.nextInt(6) + 1;
	}

//method to return what spot both dice are in
	
		public int getSpots() {
			return spots;
		}
	}
