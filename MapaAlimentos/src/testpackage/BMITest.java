package testpackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.BAI;

class BMITest {
	
	BAI objectBMI = new BAI(1.6, 60);

	@Test
	void testBmiCalculation() {
		assertEquals(23.44, Double.parseDouble(objectBMI.baiCalculation()));
	}

}
