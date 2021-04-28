package model;

/**
 * Extended from BodyIndexCalculator class
 * Related to Body Adiposity Index (BAI)
 * @author Julio Cesar and Valderson
 * 
 */

public final class BAI extends BodyIndexCalculator {
	
	private double hip;
	
	/**
	 * Constructor method Override
	 * @param height (double that contains the entered height to the BAI calculation)
	 * @param hip (double that contains the entered hip to the BAI calculation)
	 */
	public BAI(double height, double hip) {
		this.height = height;
		this.hip = hip;
	}
	
	/**
	 * Constructor Method Override
	 */
	public BAI() {
		
	}
	
	/**
	 * Method to calculate BAI
	 * @return return of the BAI calculation rounded up for two decimals
	 */
	public String baiCalculation() {
		return String.valueOf(Math.round((this.hip/(this.height*this.height))*100)/100.0);

	}
	
	//getters and setters
	public double gethip() {
		return hip;
	}

	public void setHip(double hip) {
		this.hip = hip;
	}
	
	
}
