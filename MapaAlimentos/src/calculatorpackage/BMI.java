package calculatorpackage;

public final class BMI extends BodyIndexCalculator {
	
	private double weight;
	
	public BMI(Double height, double weight) {
		this.height = height;
		this.weight = weight;
	}
	
	public BMI() {
		
	}
	
	public void print() {
		System.out.printf("IMC: %.2f", bmiCalculation());	
	}
	
	public double bmiCalculation() {
		return this.weight/(this.height*this.height);
	}
	
	public double getPeso() {
		return weight;
	}

	public void setPeso(double weight) {
		this.weight = weight;
	}
	
	
}
