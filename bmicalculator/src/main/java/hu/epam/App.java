package hu.epam;

import java.util.Scanner;

/**
 * BMIcalculator
 *
 */
public class App {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		new UserInput();

		int input = scn.nextInt();

		switch (input) {

		case 1:
			if (input == 1)
				System.out.println("You chose the Metric system\n");
			new MetricBmiCalculation();
			System.out.println("Thank you for using the BMI Calculator!");
			break;
		case 2:
			if (input == 2)
				System.out.println("You chose the USC system\n");
			new UscBmiCalculator();
			System.out.println("Thank you for using the BMI Calculator!");
			break;
		default:
			System.out.println("You should pick from 1 or 2...\n");
			new ReturnUserInput();
			scn.close();
		}
	}
}