package Homework3;

import javax.swing.JOptionPane;

public class workThree {

	
	public static double singleTaxCount(double income){
		double result = 0;
		if (income <= 8350){ 
			 result = income * 0.10;
		} else if (income <= 33950)
			result = 8350 * 0.10 + (income - 8350) * 0.15;
		else if (income <= 82250)
			result = 8350 * 0.10 + (33950 - 8350) * 0.15 + 
			(income - 33950) * 0.25;
		else if (income <= 171550)
			result = 8350 * 0.10 + (33950 - 8350) * 0.15 + 
			(82250 - 33950) * 0.25 + (income - 82250) * 0.28;
		else if (income <= 372950)
			result = 8350 * 0.10 + (33950 - 8350) * 0.15 + 
			(82250 - 33950) * 0.25 + (171550 - 82250) * 0.28
			+ (income - 171550) * 0.33;
		else
			result = 8350 * 0.10 + (33950 - 8350) * 0.15 + 
			(82250 - 33950) * 0.25 + (171550 - 82250) * 0.28
			+ (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
		return result;
	}
	
	public static double marriedTaxCount(double income){
		double result = 0;		
		if (income <= 16700)
			result = income * 0.10;
		else if (income <= 67900)
			result = 16700 * 0.10 + (income - 16700) * 0.15;
		else if (income <= 137050)
			result = 16700 * 0.10 + (67900 - 16700) * 0.15 + 
			(income - 16700) * 0.25;
		else if (income <= 208850)
			result = 16700 * 0.10 + (67900 - 16700) * 0.15 + 
			(137050 - 67900) * 0.25 + (income - 137050) * 0.28;
		else if (income <= 372950)
			result = 16700 * 0.10 + (67900 - 16700) * 0.15 + 
			(137050 - 67900) * 0.25 + (208850 - 137050) * 0.28
			+ (income - 208850) * 0.33;
		else
			result = 16700 * 0.10 + (67900 - 16700) * 0.15 + 
			(137050 - 67900) * 0.25 + (208850 - 137050) * 0.28
			+ (372950 - 208850) * 0.33 + (income - 372950) * 0.35;
		return result;
		} 
	
	public static double marriedSepTaxCount(double income){
		double result = 0;
		if (income <= 8350)
			result = income * 0.10;
		else if (income <= 33950)
			result = 8350 * 0.10 + (income - 8350) * 0.15;
		else if (income <= 68525)
			result = 8350 * 0.10 + (33950 - 8350) * 0.15 + 
			(income - 33950) * 0.25;
		else if (income <= 104425)
			result = 8350 * 0.10 + (33950 - 8350) * 0.15 + 
			(68525 - 33950) * 0.25 + (income - 68525) * 0.28;
		else if (income <= 186475)
			result = 8350 * 0.10 + (33950 - 8350) * 0.15 + 
			(68525 - 33950) * 0.25 + (104425 - 68525) * 0.28
			+ (income - 104425) * 0.33;
		else
			result = 8350 * 0.10 + (33950 - 8350) * 0.15 + 
			(68525 - 33950) * 0.25 + (104425 - 68525) * 0.28
			+ (186475 - 104425) * 0.33 + (income - 186475) * 0.35;
		return result;
	}
	
	public static double headOfHouseholdTaxCount(double income){
		double result = 0;
		if (income <= 11950)
			result = income * 0.10;
		else if (income <= 45500)
			result = 11950 * 0.10 + (income - 11950) * 0.15;
		else if (income <= 117450)
			result = 11950 * 0.10 + (45500 - 11950) * 0.15 + 
			(income - 45500) * 0.25;
		else if (income <= 190200)
			result = 11950 * 0.10 + (45500 - 11950) * 0.15 + 
			(117450 - 45500) * 0.25 + (income - 117450) * 0.28;
		else if (income <= 372950)
			result = 11950 * 0.10 + (45500 - 11950) * 0.15 + 
			(117450 - 45500) * 0.25 + (190200 - 117450) * 0.28
			+ (income - 190200) * 0.33;
		else
			result = 11950 * 0.10 + (45500 - 11950) * 0.15 + 
			(117450 - 45500) * 0.25 + (190200 - 117450) * 0.28
			+ (372950 - 190200) * 0.33 + (income - 372950) * 0.35;
		return result;
	}
	
	public static void main(String[] args) {

		String result = JOptionPane.showInputDialog("Enter the filing status:\n");
		int status = Integer.parseInt(result);

		String incomeInput = JOptionPane.showInputDialog("Enter the taxable income:");
		double income = Double.parseDouble(incomeInput);

		switch (status){
		case 0:
			JOptionPane.showMessageDialog(null,"Tax is " + singleTaxCount(income));
			break;
		case 1:
			JOptionPane.showMessageDialog(null,"Tax is " + marriedTaxCount(income));
			break;
		case 2:
			JOptionPane.showMessageDialog(null,"Tax is " + marriedSepTaxCount(income));
			break;
		case 3:
			JOptionPane.showMessageDialog(null,"Tax is " + headOfHouseholdTaxCount(income));
			break;
		default:
			JOptionPane.showMessageDialog(null,"Error: Invalid Status");
			break;
		}
	}
}
