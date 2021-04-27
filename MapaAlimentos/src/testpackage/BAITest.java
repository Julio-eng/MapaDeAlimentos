package testpackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.BAI;

class BAITest {
	
	BAI objectBAI = new BAI(1.6, 90);
	
	@Test
	void testBaiCalculation() {
		
		assertEquals(35.16, Double.parseDouble(objectBAI.baiCalculation()));		

	}

}
