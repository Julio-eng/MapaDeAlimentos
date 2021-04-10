package model;

public abstract class BodyIndexCalculator {
	
	//abstract class that contains the height attribute which is shared by BAI and BMI classes
	protected double height;
	
	///getters and setters
	public double getheight() {
		return height;
	}

	public void setAltura(double height) {
		this.height = height;
	}
}
