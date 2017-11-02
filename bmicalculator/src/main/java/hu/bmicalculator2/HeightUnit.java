package hu.bmicalculator2;

import java.util.ArrayList;
import java.util.List;

public enum HeightUnit {
	CM, INCH;
	
public static List<String> getHeightValues() {
		List<String> heightValues = new ArrayList<String>();
		for (HeightUnit heightUnit : values() ) {
			heightValues.add(heightUnit.name());
		}
		
		return heightValues;
	}	
}
