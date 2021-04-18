package model;

public abstract class BodyIndexCalculator {
	
	//abstract class that contains the height attribute which is shared by BAI and BMI classes
	protected double height;
	
	///getters and setters
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
}
