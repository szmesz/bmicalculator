package hu.bmicalculator2;

public class Main {

	public static void main(String[] args) {

		UserInput userInput = new UserInput();
		UserAttributes userAttributes = userInput.getUserInput();

		BMICalculator bmiCalculator = new BMICalculator();
		float BMIIndex = bmiCalculator.calculateBMIIndex(userAttributes);
		System.out.println("Your BMI Index is :" + BMIIndex);
		
		String BMICategory = bmiCalculator.getBMICategory(BMIIndex);
		System.out.println("Your BMI Category is: " + BMICategory);
	}
}
