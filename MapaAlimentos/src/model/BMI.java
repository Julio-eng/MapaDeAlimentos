package model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public final class BMI extends BodyIndexCalculator {
	
	private double weight;
	
	//constructor method
	public BMI(Double height, double weight) {
		this.height = height;
		this.weight = weight;
	}
	
	//constructor method
	public BMI() {
		
	}
	
	//Method created to print the results
	public void print() {
		System.out.printf("IMC: %.2f\n", bmiCalculation());	
	}
	
	//method to calculate BMI
	public String bmiCalculation() {
		
		double operation = this.weight/(this.height*this.height);
		operation = Math.round(operation*1000)/1000.0;
		
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
