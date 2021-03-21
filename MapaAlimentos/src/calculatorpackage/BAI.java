package calculatorpackage;

public final class BAI extends BodyIndexCalculator {
	
	private double hip;
	
	//constructor method 
	public BAI(Double height, double hip) {
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
	public double baiCalculation() {
		return this.hip/(this.height*this.height);
	}
	
	//getters and setters
	public double gethip() {
		return hip;
	}

	public void sethip(double hip) {
		this.hip = hip;
	}
	
	
}
