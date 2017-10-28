package hu.epam;

import java.util.Scanner;

public class MetricBmiCalculation {

	public MetricBmiCalculation() {
		Scanner scn = new Scanner(System.in);

		System.out.println("" + "please input you height in cm!");
		float input1 = scn.nextFloat();
		if (input1 > 0)
			System.out.println("Your height is " + input1 + " cm.");
		else
			System.out.println("Please input higher value than 0!");

		System.out.println("Please input your weight in kg");
		float input2 = scn.nextFloat();
		if (input2 > 0)
			System.out.println("Your weight is " + input2 + " kg.");
		else
			System.out.println("Please input higher value than 0!");

		float i = (input2 / ((input1 / 100) * (input1 / 100)));
		System.out.println("Your Body Mass Index is : " + i);
		
		if (i<16) {
			System.out.println("Your BMI Category is: Severe Thinness");
		} else if (i>=16 && i<=17) {
			System.out.println("Your BMI Category is: Moderate Thinness");
		} else if (i>=17 && i<=18.5) {
			System.out.println("Your BMI Category is: Mild Thinness");
		} else if (i>=18.5 && i<=25) {
			System.out.println("Your BMI Category is: Normal");
		}else if (i>=25 && i<=30) {
			System.out.println("Your BMI Category is: Overweight");
		}else if (i>=30 && i<=35) {
			System.out.println("Your BMI Category is: Obese Class I");
		}else if(i>=35&&i<=40){
		System.out.println("Your BMI Category is: Obese CLass II");
		}else if(i>40){
		System.out.println("Your BMI Category is: Obese Class III");
		scn.close();
		}
	}
}
