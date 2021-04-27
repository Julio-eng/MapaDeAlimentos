package testpackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import view.CalculatorView;

class CalculatorViewTest {

	CalculatorView calculatorViewObject = new CalculatorView();
	
	@Test
	void testtestJTextFieldReturn() {
		
		assertTrue(calculatorViewObject.testJTextFieldReturn("37"));
		assertFalse(calculatorViewObject.testJTextFieldReturn("joao"));
		
	}

}
