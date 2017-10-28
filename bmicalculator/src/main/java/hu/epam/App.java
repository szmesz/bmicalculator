package hu.epam;

import java.util.Scanner;

/**
 * BMIcalculator
 *
 */
public class App {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please pick from the two numbers: 1 or 2!\n"
				 + "If you would like to use the BMI Calculator on Metric values input 1\n"
				 + "If you would like to use the BMI Calculator on USC valuse input 2\n"
				 + "Thank you");
		int input = scn.nextInt();
		
		switch (input) { 
				
				case 1: 
					if (input == 1)
					System.out.println("You chose the Metric system");
					new MetricBmiCalculation();
					break;
				case 2: 
					if (input == 2)
					System.out.println("You chose the USC system");
					new UscBmiCalculator();
					break;
				default:
					System.out.println("You should pick from 1 or 2...");
		}
	}
}