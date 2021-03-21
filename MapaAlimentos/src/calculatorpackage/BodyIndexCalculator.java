package calculatorpackage;

public abstract class BodyIndexCalculator {
	
	//classe abstrata com o atributo height, compartilhado com a classe BMI e BAI
	protected double height;
	
	///getters and setters
	public double getheight() {
		return height;
	}

	public void setAltura(double height) {
		this.height = height;
	}
}
