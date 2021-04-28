package data;

import model.NutritionalTable;

/**
 * Association to NutritionalTable to declare objects
 * @author Julio Cesar and Valderson
 * @version 3.0 (apr 2021)
 */

public class AlimentsData {

	private NutritionalTable leiteDeVacaDesnatado = new NutritionalTable();
	private NutritionalTable leiteIntegralDeVaca = new NutritionalTable();
	private NutritionalTable bananaPrataCrua = new NutritionalTable();
	private NutritionalTable aveia = new NutritionalTable();
	private NutritionalTable goiaba = new NutritionalTable();
	private NutritionalTable maca = new NutritionalTable();
	private NutritionalTable laranja = new NutritionalTable();
	private NutritionalTable melancia = new NutritionalTable();
	private NutritionalTable pepino = new NutritionalTable();
	private NutritionalTable beterraba = new NutritionalTable();
	
	/**
	 * Class constructor
	 * Setting values to the NutritionalTable format objects
	 */
	
	public AlimentsData(){
		
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
		
		aveia.setName("Aveia");
		aveia.setCalorie("-");
		aveia.setProtein("-");
		aveia.setCarbohydrate("-");
		aveia.setLipids("-");
		aveia.setCalcium("-");
		aveia.setIron("-");
		aveia.setFiber("-");
		aveia.setPhosphor("-");
		aveia.setIodine("-");
		aveia.setMagnesium("-");
		aveia.setPotassium("-");
		aveia.setSodium("-");
		aveia.setZinc("-");
		aveia.setVitaminA("-");
		aveia.setVitaminB1("-");
		aveia.setVitaminB2("-");
		aveia.setVitaminB3("-");
		aveia.setVitaminB5("-");
		aveia.setVitaminB6("-");
		aveia.setVitaminB9("-");
		aveia.setVitaminB12("-");
		aveia.setVitaminC("-");
		aveia.setVitaminD("-");
		aveia.setVitaminE("-");
		aveia.setVitaminH("-");
		aveia.setVitaminK("-");
		
		goiaba.setName("Goiaba");
		goiaba.setCalorie("-");
		goiaba.setProtein("-");
		goiaba.setCarbohydrate("-");
		goiaba.setLipids("-");
		goiaba.setCalcium("-");
		goiaba.setIron("-");
		goiaba.setFiber("-");
		goiaba.setPhosphor("-");
		goiaba.setIodine("-");
		goiaba.setMagnesium("-");
		goiaba.setPotassium("-");
		goiaba.setSodium("-");
		goiaba.setZinc("-");
		goiaba.setVitaminA("-");
		goiaba.setVitaminB1("-");
		goiaba.setVitaminB2("-");
		goiaba.setVitaminB3("-");
		goiaba.setVitaminB5("-");
		goiaba.setVitaminB6("-");
		goiaba.setVitaminB9("-");
		goiaba.setVitaminB12("-");
		goiaba.setVitaminC("-");
		goiaba.setVitaminD("-");
		goiaba.setVitaminE("-");
		goiaba.setVitaminH("-");
		goiaba.setVitaminK("-");
		
		maca.setName("Maca");
		maca.setCalorie("-");
		maca.setProtein("-");
		maca.setCarbohydrate("-");
		maca.setLipids("-");
		maca.setCalcium("-");
		maca.setIron("-");
		maca.setFiber("-");
		maca.setPhosphor("-");
		maca.setIodine("-");
		maca.setMagnesium("-");
		maca.setPotassium("-");
		maca.setSodium("-");
		maca.setZinc("-");
		maca.setVitaminA("-");
		maca.setVitaminB1("-");
		maca.setVitaminB2("-");
		maca.setVitaminB3("-");
		maca.setVitaminB5("-");
		maca.setVitaminB6("-");
		maca.setVitaminB9("-");
		maca.setVitaminB12("-");
		maca.setVitaminC("-");
		maca.setVitaminD("-");
		maca.setVitaminE("-");
		maca.setVitaminH("-");
		maca.setVitaminK("-");
		
		laranja.setName("Laranja");
		laranja.setCalorie("-");
		laranja.setProtein("-");
		laranja.setCarbohydrate("-");
		laranja.setLipids("-");
		laranja.setCalcium("-");
		laranja.setIron("-");
		laranja.setFiber("-");
		laranja.setPhosphor("-");
		laranja.setIodine("-");
		laranja.setMagnesium("-");
		laranja.setPotassium("-");
		laranja.setSodium("-");
		laranja.setZinc("-");
		laranja.setVitaminA("-");
		laranja.setVitaminB1("-");
		laranja.setVitaminB2("-");
		laranja.setVitaminB3("-");
		laranja.setVitaminB5("-");
		laranja.setVitaminB6("-");
		laranja.setVitaminB9("-");
		laranja.setVitaminB12("-");
		laranja.setVitaminC("-");
		laranja.setVitaminD("-");
		laranja.setVitaminE("-");
		laranja.setVitaminH("-");
		laranja.setVitaminK("-");
		
		melancia.setName("Melancia");
		melancia.setCalorie("-");
		melancia.setProtein("-");
		melancia.setCarbohydrate("-");
		melancia.setLipids("-");
		melancia.setCalcium("-");
		melancia.setIron("-");
		melancia.setFiber("-");
		melancia.setPhosphor("-");
		melancia.setIodine("-");
		melancia.setMagnesium("-");
		melancia.setPotassium("-");
		melancia.setSodium("-");
		melancia.setZinc("-");
		melancia.setVitaminA("-");
		melancia.setVitaminB1("-");
		melancia.setVitaminB2("-");
		melancia.setVitaminB3("-");
		melancia.setVitaminB5("-");
		melancia.setVitaminB6("-");
		melancia.setVitaminB9("-");
		melancia.setVitaminB12("-");
		melancia.setVitaminC("-");
		melancia.setVitaminD("-");
		melancia.setVitaminE("-");
		melancia.setVitaminH("-");
		melancia.setVitaminK("-");
		
		pepino.setName("Pepino");
		pepino.setCalorie("-");
		pepino.setProtein("-");
		pepino.setCarbohydrate("-");
		pepino.setLipids("-");
		pepino.setCalcium("-");
		pepino.setIron("-");
		pepino.setFiber("-");
		pepino.setPhosphor("-");
		pepino.setIodine("-");
		pepino.setMagnesium("-");
		pepino.setPotassium("-");
		pepino.setSodium("-");
		pepino.setZinc("-");
		pepino.setVitaminA("-");
		pepino.setVitaminB1("-");
		pepino.setVitaminB2("-");
		pepino.setVitaminB3("-");
		pepino.setVitaminB5("-");
		pepino.setVitaminB6("-");
		pepino.setVitaminB9("-");
		pepino.setVitaminB12("-");
		pepino.setVitaminC("-");
		pepino.setVitaminD("-");
		pepino.setVitaminE("-");
		pepino.setVitaminH("-");
		pepino.setVitaminK("-");
		
		beterraba.setName("Beterraba");
		beterraba.setCalorie("-");
		beterraba.setProtein("-");
		beterraba.setCarbohydrate("-");
		beterraba.setLipids("-");
		beterraba.setCalcium("-");
		beterraba.setIron("-");
		beterraba.setFiber("-");
		beterraba.setPhosphor("-");
		beterraba.setIodine("-");
		beterraba.setMagnesium("-");
		beterraba.setPotassium("-");
		beterraba.setSodium("-");
		beterraba.setZinc("-");
		beterraba.setVitaminA("-");
		beterraba.setVitaminB1("-");
		beterraba.setVitaminB2("-");
		beterraba.setVitaminB3("-");
		beterraba.setVitaminB5("-");
		beterraba.setVitaminB6("-");
		beterraba.setVitaminB9("-");
		beterraba.setVitaminB12("-");
		beterraba.setVitaminC("-");
		beterraba.setVitaminD("-");
		beterraba.setVitaminE("-");
		beterraba.setVitaminH("-");
		beterraba.setVitaminK("-");
		
		
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


	public NutritionalTable getAveia() {
		return aveia;
	}


	public void setAveia(NutritionalTable aveia) {
		this.aveia = aveia;
	}


	public NutritionalTable getGoiaba() {
		return goiaba;
	}


	public void setGoiaba(NutritionalTable goiaba) {
		this.goiaba = goiaba;
	}


	public NutritionalTable getMaca() {
		return maca;
	}


	public void setMaca(NutritionalTable maca) {
		this.maca = maca;
	}


	public NutritionalTable getLaranja() {
		return laranja;
	}


	public void setLaranja(NutritionalTable laranja) {
		this.laranja = laranja;
	}


	public NutritionalTable getMelancia() {
		return melancia;
	}


	public void setMelancia(NutritionalTable melancia) {
		this.melancia = melancia;
	}


	public NutritionalTable getPepino() {
		return pepino;
	}


	public void setPepino(NutritionalTable pepino) {
		this.pepino = pepino;
	}


	public NutritionalTable getBeterraba() {
		return beterraba;
	}


	public void setBeterraba(NutritionalTable beterraba) {
		this.beterraba = beterraba;
	}

	
	
}
