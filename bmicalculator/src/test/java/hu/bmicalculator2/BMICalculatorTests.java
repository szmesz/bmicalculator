package hu.bmicalculator2;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
public class BMICalculatorTests {
	
	private BMICalculator bMICalculator;
	
	@Before
	public void setUp() {
		bMICalculator = new BMICalculator();	
	}
	
	@Test
	public void shouldCalculateBMIIndexCorrectly() {
		
		UserAttributes userAttributes = new UserAttributes(1.68f, 83, "CM", "KG");
		float actual = bMICalculator.calculateBMIIndex(userAttributes);
		float expected = 29.41f;
		float delta = 0.1f;
		assertEquals(expected, actual, delta );
	} 
	
	@Test
	public void shouldSortCategoriesToBMIIndexValues() {
		
		float bMIIndex = 15.5f;
		String actual = bMICalculator.getBMICategory(bMIIndex);
		String expected = "Severe Thinness";
		assertEquals(expected, actual);
		
	}
}
