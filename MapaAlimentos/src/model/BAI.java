package model;

public final class BAI extends BodyIndexCalculator {
	
	private double hip;
	
	//constructor method 
	public BAI(double height, double hip) {
		this.height = height;
		this.hip = hip;
	}
	
	//constructor method
	public BAI() {
		
	}
	
	//Method created to print the results
	public void print() {
		System.out.printf("IAC: %.2f\n", baiCalculation());	
	}
	
	//method to calculate BAI
	public String baiCalculation() {
		double operation = this.hip/(this.height*this.height);
		
		operation = Math.round(operation*100)/100.0;
		
		return String.valueOf(operation);

	}
	
	//getters and setters
	public double gethip() {
		return hip;
	}

	public void setHip(double hip) {
		this.hip = hip;
	}
	
	
}
