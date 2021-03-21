package calculatorpackage;

public final class BMI extends BodyIndexCalculator {
	
	private double weight;
	
	//metodo contrutuor
	public BMI(Double height, double weight) {
		this.height = height;
		this.weight = weight;
	}
	
	//metodo contrutuor
	public BMI() {
		
	}
	
	//metodo para printar o resultado do calculo do IMC
	public void print() {
		System.out.printf("IMC: %.2f", bmiCalculation());	
	}
	
	//metodo para calcular o IMC
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
