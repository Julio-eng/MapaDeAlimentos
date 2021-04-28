package model;

/**
 * abstract class that contains the height attribute which is shared by BAI and BMI classes
 * @author Julio Cesar and Valderson
 *
 */

public abstract class BodyIndexCalculator {
	
	protected double height;
	
	///getters and setters
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
}
