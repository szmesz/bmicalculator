package hu.bmicalculator2;

import java.util.List;
import java.util.Scanner;

public class UserInput {
	public UserInput() {
	}

	public UserAttributes getUserInput() {
		Scanner scn = new Scanner(System.in);

		String heightUnit = readUnitFromConsole(scn, "height", HeightUnit.getHeightValues());
		// scn.nextLine();
		float height = readAttributeFromConsole(scn, "height");
		System.out.println("Your height is:" + height + heightUnit);
		if (heightUnit.toLowerCase().equals("cm")) {
			height = (height / 100f);
		} else {
			height = (height * 0.0254f);
		}

		scn.nextLine();
		String weightUnit = readUnitFromConsole(scn, "weight", WeightUnit.getWeightValues());
		// scn.nextLine();
		float weight = readAttributeFromConsole(scn, "weight");
		System.out.println("Your weight is:" + weight + weightUnit);
		if (weightUnit.toLowerCase().equals("lbs")) {
			weight = weight * 0.45359237f;
		}

		UserAttributes userAttributes = new UserAttributes(height, weight, heightUnit, weightUnit);
		scn.close();
		return userAttributes;

	}

	private String readUnitFromConsole(Scanner scn, String attribute, List<String> validValues) {
		String unit = "";
		do {

			System.out.println("Please type the unit of " + attribute + "!");
			System.out.println("Valid values are:");
			for (String actualValue : validValues) {
				System.out.println(actualValue);
			}
			unit = scn.nextLine();

		} while (!validValues.contains(unit.toUpperCase()));
		return unit;

	}

	private float readAttributeFromConsole(Scanner scn, String attribute) {
		float attributeValue = 0f;

		System.out.println("Please type your " + attribute + "!");
		while (true) {
			try {

				attributeValue = scn.nextFloat();
				if (attributeValue < 0)
					throw new IllegalArgumentException();
				return attributeValue;
			} catch (Exception exception) {
				System.out.println("Please enter a valid value!");
				scn.next();
			}
		}

	}

}
