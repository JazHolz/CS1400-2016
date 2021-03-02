package midTerm;

import javax.swing.JOptionPane;

public class GrowthCalculator {
	public static void main(String[] args) {

		double currentPop;
		String inputCurrent;
		double growthRate;
		String inputGrowth;
		
		inputCurrent = JOptionPane.showInputDialog("Enter the Current World Population: ");
		currentPop = Double.parseDouble(inputCurrent);
		inputGrowth = JOptionPane.showInputDialog("Enter the Population Growth Rate: " + "\n");
		growthRate = Double.parseDouble(inputGrowth);

		double e = 2.7182818285;
		JOptionPane.showMessageDialog(null, "In 30 years the population will be at:  "
				+ Math.round(currentPop * Math.pow(e, (growthRate / 100) * 30)));
		JOptionPane.showMessageDialog(null, "The population is estimated to double in ~63 years at:  "
				+ Math.round(currentPop * Math.pow(e, (growthRate / 100) * 63)));
	}
}
