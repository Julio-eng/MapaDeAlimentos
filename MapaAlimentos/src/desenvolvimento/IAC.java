package desenvolvimento;

public final class IAC extends Calculadora {
	private double quadril;
	
	public IAC(Double altura, double quadril) {
		this.altura = altura;
		this.quadril = quadril;
	}
	
	public IAC() {
		
	}
	
	public double realizarCalculo() {
		return this.quadril/(this.altura*this.altura);
	}
	
	public void imprimir() {
		System.out.println("Escolha seu sexo:");
		
	}

	public double getQuadril() {
		return quadril;
	}

	public void setQuadril(double quadril) {
		this.quadril = quadril;
	}
	
	
}
