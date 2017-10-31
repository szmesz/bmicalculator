package hu.bmicalculator2;

import java.util.List;
import java.util.Scanner;

public class UserInput {
	private UserAttributes userAttributes;

	public UserInput() {
	}

	public UserAttributes getUserInput() {
		Scanner scn = new Scanner(System.in);

		String heightUnit = readUnitFromConsole(scn, "height", HeightUnit.getHeightValues());
		scn.nextLine();
		float height = readAttributeFromConsole(scn, "height");
		System.out.println("Your height is:" + height + heightUnit);
		if (heightUnit.toLowerCase().equals("inch")) {
			height = (height * 2.54f);
			scn.close();
		}
		scn.nextLine();
		String weightUnit = readUnitFromConsole(scn, "weight", WeightUnit.getWeightValues());
		scn.nextLine();
		float weight = readAttributeFromConsole(scn, "weight");
		System.out.println("Your weight is:" + weight + weightUnit);
		if (weightUnit.toLowerCase().equals("lbs")) {
			weight = weight * 0.45359237f;
			scn.close();
		}

		UserAttributes userAttributes = new UserAttributes(weight, height, weightUnit, heightUnit);
		return userAttributes;
	}

	private String readUnitFromConsole(Scanner scn, String attribute, List<String> validValues) {
		String unit = "";
		System.out.println("Please type the unit of " + attribute + "!");

		unit = scn.nextLine();
		if (!validValues.contains(unit.toUpperCase())) {
			System.out.println("Please enter a valid unit!");
			scn.close();
		}
		return unit;

	}

	private float readAttributeFromConsole(Scanner scn, String attribute) {
		float attributeValue = 0f;

		System.out.println("Please type your " + attribute + "!");
		try {
			attributeValue = scn.nextFloat();
			if (attributeValue < 0)
				throw new IllegalArgumentException();
		} catch (Exception exception) {
			System.out.println("Please enter a valid value!");
			scn.close();
		}

		return attributeValue;
	}

}
