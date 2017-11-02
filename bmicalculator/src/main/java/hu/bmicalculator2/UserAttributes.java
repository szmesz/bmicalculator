package hu.bmicalculator2;

public class UserAttributes {

	private String heightUnit;
	private String weightUnit;
	private float height;
	private float weight;

	public UserAttributes() {
	}

	public UserAttributes(float height, float weight, String heightUnit, String weightUnit) {
		this.heightUnit = heightUnit;
		this.weightUnit = weightUnit;
		this.height = height;
		this.weight = weight;

	}

	public String getHeightUnit() {
		return heightUnit;
	}

	public void setHeightUnit(String heightUnit) {
		this.heightUnit = heightUnit;
	}

	public String getWeightUnit() {
		return weightUnit;
	}

	public void setWeightUnit(String weightUnit) {
		this.weightUnit = weightUnit;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
}
