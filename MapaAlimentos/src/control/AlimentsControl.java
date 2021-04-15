package control;

import model.NutritionalTable;

public class AlimentsControl {

	private NutritionalTable leiteDeVacaDesnatado = new NutritionalTable();
	private NutritionalTable leiteIntegralDeVaca = new NutritionalTable();
	private NutritionalTable bananaPrataCrua = new NutritionalTable();
	
	public AlimentsControl(){
		
		bananaPrataCrua.setName("Banana Prata Crua");
		bananaPrataCrua.setCalorie("98,3 kcal");
		bananaPrataCrua.setProtein("1,3 g");
		bananaPrataCrua.setCarbohydrate("26 g");
		bananaPrataCrua.setLipids("0,1 g");
		bananaPrataCrua.setCalcium("7,6");
		bananaPrataCrua.setIron("0,4");
		bananaPrataCrua.setFiber("2,0 g");
		bananaPrataCrua.setPhosphor("22,2 g");
		bananaPrataCrua.setIodine("-");
		bananaPrataCrua.setMagnesium("26,3 g");
		bananaPrataCrua.setPotassium("357,7 g");
		bananaPrataCrua.setSodium("-");
		bananaPrataCrua.setZinc("0,2 g");
		bananaPrataCrua.setVitaminA("-");
		bananaPrataCrua.setVitaminB1("-");
		bananaPrataCrua.setVitaminB2("0,02 g");
		bananaPrataCrua.setVitaminB3("-");
		bananaPrataCrua.setVitaminB5("-");
		bananaPrataCrua.setVitaminB6("0,1 g");
		bananaPrataCrua.setVitaminB9("-");
		bananaPrataCrua.setVitaminB12("-");
		bananaPrataCrua.setVitaminC("21,6 g");
		bananaPrataCrua.setVitaminD("-");
		bananaPrataCrua.setVitaminE("-");
		bananaPrataCrua.setVitaminH("-");
		bananaPrataCrua.setVitaminK("-");

		leiteIntegralDeVaca.setName("Leite de Vaca (Integral)");
		leiteIntegralDeVaca.setCalorie("60 kcal");
		leiteIntegralDeVaca.setProtein("3 g");
		leiteIntegralDeVaca.setCarbohydrate("5 g");
		leiteIntegralDeVaca.setLipids("3 g");
		leiteIntegralDeVaca.setCalcium("120 mg");
		leiteIntegralDeVaca.setIron("-");
		leiteIntegralDeVaca.setFiber("2,0 g");
		leiteIntegralDeVaca.setPhosphor("93 mg");
		leiteIntegralDeVaca.setIodine("-");
		leiteIntegralDeVaca.setMagnesium("26,3 g");
		leiteIntegralDeVaca.setPotassium("152 mg");
		leiteIntegralDeVaca.setSodium("-");
		leiteIntegralDeVaca.setZinc("-");
		leiteIntegralDeVaca.setVitaminA("31 mcg");
		leiteIntegralDeVaca.setVitaminB1("0,04 mg");
		leiteIntegralDeVaca.setVitaminB2("0,36 mg");
		leiteIntegralDeVaca.setVitaminB3("-");
		leiteIntegralDeVaca.setVitaminB5("-");
		leiteIntegralDeVaca.setVitaminB6("0,1 g");
		leiteIntegralDeVaca.setVitaminB9("-");
		leiteIntegralDeVaca.setVitaminB12("-");
		leiteIntegralDeVaca.setVitaminC("-");
		leiteIntegralDeVaca.setVitaminD("-");
		leiteIntegralDeVaca.setVitaminE("-");
		leiteIntegralDeVaca.setVitaminH("-");
		leiteIntegralDeVaca.setVitaminK("-");
		
		leiteDeVacaDesnatado.setName("Leite de Vaca (Desnatado)");
		leiteDeVacaDesnatado.setCalorie("42 kcal");
		leiteDeVacaDesnatado.setProtein("3 g");
		leiteDeVacaDesnatado.setCarbohydrate("5 g");
		leiteDeVacaDesnatado.setLipids("1 g");
		leiteDeVacaDesnatado.setCalcium("223 mg");
		leiteDeVacaDesnatado.setIron("-");
		leiteDeVacaDesnatado.setFiber("-");
		leiteDeVacaDesnatado.setPhosphor("96 mg");
		leiteDeVacaDesnatado.setIodine("-");
		leiteDeVacaDesnatado.setMagnesium("-");
		leiteDeVacaDesnatado.setPotassium("156 mg");
		leiteDeVacaDesnatado.setSodium("50 mg");
		leiteDeVacaDesnatado.setZinc("-");
		leiteDeVacaDesnatado.setVitaminA("59 mcg");
		leiteDeVacaDesnatado.setVitaminB1("0,04 mg");
		leiteDeVacaDesnatado.setVitaminB2("0,17 mg");
		leiteDeVacaDesnatado.setVitaminB3("-");
		leiteDeVacaDesnatado.setVitaminB5("-");
		leiteDeVacaDesnatado.setVitaminB6("-");
		leiteDeVacaDesnatado.setVitaminB9("-");
		leiteDeVacaDesnatado.setVitaminB12("-");
		leiteDeVacaDesnatado.setVitaminC("-");
		leiteDeVacaDesnatado.setVitaminD("-");
		leiteDeVacaDesnatado.setVitaminE("-");
		leiteDeVacaDesnatado.setVitaminH("-");
		leiteDeVacaDesnatado.setVitaminK("-");
		
	}

	public NutritionalTable getLeiteDeVacaDesnatado() {
		return leiteDeVacaDesnatado;
	}

	public void setLeiteDeVacaDesnatado(NutritionalTable leiteDeVacaDesnatado) {
		this.leiteDeVacaDesnatado = leiteDeVacaDesnatado;
	}

	public NutritionalTable getLeiteIntegralDeVaca() {
		return leiteIntegralDeVaca;
	}

	public void setLeiteIntegralDeVaca(NutritionalTable leiteIntegralDeVaca) {
		this.leiteIntegralDeVaca = leiteIntegralDeVaca;
	}

	public NutritionalTable getBananaPrataCrua() {
		return bananaPrataCrua;
	}

	public void setBananaPrataCrua(NutritionalTable bananaPrataCrua) {
		this.bananaPrataCrua = bananaPrataCrua;
	}

	
	
}
