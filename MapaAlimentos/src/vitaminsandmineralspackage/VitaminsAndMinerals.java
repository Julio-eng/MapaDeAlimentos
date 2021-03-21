package vitaminsandmineralspackage;

public class VitaminsAndMinerals {
	
	private String nome;
	private String fontesSignificativas;
	private String principaisFuncoes;
	private String doencasProvocadas;
	private String sintomasDeficiencia;
	
	//toString method override
	public String toString() {
		return nome + "\n\nfontesSignificativas:\n" + fontesSignificativas
				+ "\n\nprincipaisFuncoes:\n" + principaisFuncoes + "\n\ndoencasProvocadas:\n" + doencasProvocadas
				+ "\n\nsintomasDeficiencia:\n" + sintomasDeficiencia;
	}
	
	///getters and setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFontesSignificativas() {
		return fontesSignificativas;
	}
	public void setFontesSignificativas(String fontesSignificativas) {
		this.fontesSignificativas = fontesSignificativas;
	}
	public String getPrincipaisFuncoes() {
		return principaisFuncoes;
	}
	public void setPrincipaisFuncoes(String principaisFuncoes) {
		this.principaisFuncoes = principaisFuncoes;
	}
	public String getDoencasProvocadas() {
		return doencasProvocadas;
	}
	public void setDoencasProvocadas(String doencasProvocadas) {
		this.doencasProvocadas = doencasProvocadas;
	}
	public String getSintomasDeficiencia() {
		return sintomasDeficiencia;
	}
	public void setSintomasDeficiencia(String sintomasDeficiencia) {
		this.sintomasDeficiencia = sintomasDeficiencia;
	}
	
	
	
}
