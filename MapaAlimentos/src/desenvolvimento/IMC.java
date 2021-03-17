package desenvolvimento;

public final class IMC extends Calculadora {
	
	private double peso;
	
	public IMC(Double altura, double peso) {
		this.altura = altura;
		this.peso = peso;
	}
	
	public IMC() {
		
	}
	
	public double realizarCalculo() {
		return this.peso/(this.altura*this.altura);
	}
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
}
