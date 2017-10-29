package hu.epam;

import java.util.Scanner;

public class ReturnUserInput {

	public ReturnUserInput() {

		Scanner scn = new Scanner(System.in);

		new UserInput();

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
			new ReturnUserInput();
			scn.close();
		}

	}

}
