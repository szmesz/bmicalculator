package hu.bmicalculator2;

public class BMICalculator {

	public float calculateBMIIndex(UserAttributes userAttributes) {
		float BMIIndex = (float) (userAttributes.getWeight() / ((Math.pow(userAttributes.getHeight(), 2)) / 1000));
		return BMIIndex;
	}

	public String getBMICategory(float BMIIndex) {

		String[] myStringArray;
		{
			myStringArray = new String[8];
			myStringArray = new String[] { "Severe Thinness", "Moderate Thinness", "Mild Thinness", "Normal",
					"Overweight", "Obese Class I", "Obese CLass II", "Obese Class III" };
			String BMICategory = "";
			
			if (BMIIndex < 16) {
				BMICategory = myStringArray[0];
			} else if (BMIIndex >= 16 && BMIIndex <= 17) {
				BMICategory = myStringArray[1];
			} else if (BMIIndex >= 17 && BMIIndex <= 18.5) {
				BMICategory = myStringArray[2];
			} else if (BMIIndex >= 18.5 && BMIIndex <= 25) {
				BMICategory = myStringArray[3];
			} else if (BMIIndex >= 25 && BMIIndex <= 30) {
				BMICategory = myStringArray[4];
			} else if (BMIIndex >= 30 && BMIIndex <= 35) {
				BMICategory = myStringArray[5];
			} else if (BMIIndex >= 35 && BMIIndex <= 40) {
				BMICategory = myStringArray[6];
			} else if (BMIIndex > 40) {
				BMICategory = myStringArray[7];
			}
			return BMICategory;
		}
	}
}
