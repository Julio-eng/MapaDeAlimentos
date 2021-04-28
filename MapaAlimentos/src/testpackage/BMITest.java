package testpackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.BMI;

class BMITest {
	
	BMI objectBMI = new BMI(1.6, 60);

	@Test
	void testBmiCalculation() {
		assertEquals(23.44, Double.parseDouble(objectBMI.bmiCalculation()));
		assertNotEquals(23.4, Double.parseDouble(objectBMI.bmiCalculation()));
	}

}
