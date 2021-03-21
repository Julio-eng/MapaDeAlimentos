package calculatorpackage;

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
		System.out.printf("IMC: %.2f", bmiCalculation());	
	}
	
	//method to calculate BMI
	public double bmiCalculation() {
		return this.weight/(this.height*this.height);
	}
	
	//getters and setters
	public double getPeso() {
		return weight;
	}

	public void setPeso(double weight) {
		this.weight = weight;
	}
	
	
}
