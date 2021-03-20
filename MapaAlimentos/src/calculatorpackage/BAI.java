package calculatorpackage;

public final class BAI extends BodyIndexCalculator {
	
	private double hip;
	
	public BAI(Double height, double hip) {
		this.height = height;
		this.hip = hip;
	}
	
	public BAI() {
		
	}
	
	public void print() {
		System.out.printf("IAC: %.2f", baiCalculation());	
	}
	
	public double baiCalculation() {
		return this.hip/(this.height*this.height);
	}
	
	public double gethip() {
		return hip;
	}

	public void sethip(double hip) {
		this.hip = hip;
	}
	
	
}
