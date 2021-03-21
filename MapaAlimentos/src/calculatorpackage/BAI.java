package calculatorpackage;

public final class BAI extends BodyIndexCalculator {
	
	private double hip;
	
	//metodo contrutuor 
	public BAI(Double height, double hip) {
		this.height = height;
		this.hip = hip;
	}
	
	//metodo construtor
	public BAI() {
		
	}
	
	//metodo para printar o resultado do calculo do IAC
	public void print() {
		System.out.printf("IAC: %.2f", baiCalculation());	
	}
	
	//metodo para calcular o IAC
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
