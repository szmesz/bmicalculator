package hu.bmicalculator2;

import java.util.ArrayList;
import java.util.List;

public enum WeightUnit {
	KG, LBS;
	
	public static List<String> getWeightValues() {
		
		List<String> weightValues = new ArrayList<String>();
		for (WeightUnit weightUnit : values() ) {
			weightValues.add(weightUnit.name());
		}
		
		return weightValues;
	}
	
}
