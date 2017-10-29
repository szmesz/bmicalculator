package hu.epam;

import java.util.Scanner;

public class MetricBmiCalculation {

	public MetricBmiCalculation() {
		Scanner scn = new Scanner(System.in);

		System.out.println("" + "please input you height in cm!\n");
		float input1 = scn.nextFloat();
		if (input1 > 0)
			System.out.println("Your height is " + input1 + " cm.\n");
		else
			System.out.println("Please input higher value than 0!\n");

		System.out.println("Please input your weight in kg\n");
		float input2 = scn.nextFloat();
		if (input2 > 0)
			System.out.println("Your weight is " + input2 + " kg.\n");
		else
			System.out.println("Please input higher value than 0!\n");

		float i = (input2 / ((input1 / 100) * (input1 / 100)));
		System.out.println("Your Body Mass Index is : " + i + "\n");
		
		String[] myStringArray;
		myStringArray = new String[8];
		myStringArray = new String[]{"Severe Thinness","Moderate Thinness","Mild Thinness",
				"Normal","Overweight","Obese Class I","Obese CLass II","Obese Class III"};
		
		if (i < 16) {
			System.out.println("Your BMI Category is: "+ myStringArray[0] + "\n");
		} else if (i >= 16 && i <= 17) {
			System.out.println("Your BMI Category is: " + myStringArray[1] + "\n");
		} else if (i >= 17 && i <= 18.5) {
			System.out.println("Your BMI Category is: " + myStringArray[2] + "\n");
		} else if (i >= 18.5 && i <= 25) {
			System.out.println("Your BMI Category is: " + myStringArray[3] + "\n");
		} else if (i >= 25 && i <= 30) {
			System.out.println("Your BMI Category is: " + myStringArray[4] + "\n");
		} else if (i >= 30 && i <= 35) {
			System.out.println("Your BMI Category is: " + myStringArray[5] + "\n");
		} else if (i >= 35 && i <= 40) {
			System.out.println("Your BMI Category is: " + myStringArray[6] + "\n");
		} else if (i > 40) {
			System.out.println("Your BMI Category is: " + myStringArray[7] + "\n");
			scn.close();
		}
	}
}
