package model;

/**
 * Extended from BodyIndexCalculator class
 * Related to Body Mass Index (BMI)
 * @author Julio Cesar and Valderson
 * @version 3.0 (apr 2021)
 */

public final class BMI extends BodyIndexCalculator {
	
	private double weight;
	
	/**
	 * Constructor method Override
	 * @param height (double that contains the entered height to the BMI calculation)
	 * @param hip (double that contains the entered hip to the BMI calculation)
	 */
	public BMI(double height, double weight) {
		this.height = height;
		this.weight = weight;
	}
	
	/**
	 * Constructor Method Override
	 */
	public BMI() {
		
	}
	
	/**
	 * Method to calculate BMI
	 * @return return of the BMI calculation rounded up for two decimals
	 */
	public String bmiCalculation() {
		
		double operation = this.weight/(this.height*this.height);
		operation = Math.round(operation*100)/100.0;
		
		return String.valueOf(operation);
	}
	
	//getters and setters
	public double getBoddyMass() {
		return weight;
	}

	public void setBoddyMass(double weight) {
		this.weight = weight;
	}


	
	
}
