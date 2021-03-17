package desenvolvimento;

public abstract class Calculadora {
	protected double altura;
	
	public abstract double realizarCalculo();
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
}
