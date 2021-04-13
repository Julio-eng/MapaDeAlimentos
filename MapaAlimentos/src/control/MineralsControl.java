package control;

import model.VitaminsAndMinerals;

public class MineralsControl {
	
	private VitaminsAndMinerals calcium = new VitaminsAndMinerals();
	private VitaminsAndMinerals iron = new VitaminsAndMinerals();
	private VitaminsAndMinerals fibers = new VitaminsAndMinerals();
	private VitaminsAndMinerals phosphorus = new VitaminsAndMinerals();
	private VitaminsAndMinerals iodine = new VitaminsAndMinerals();
	private VitaminsAndMinerals magnesium = new VitaminsAndMinerals();
	private VitaminsAndMinerals potassium = new VitaminsAndMinerals();
	private VitaminsAndMinerals protein = new VitaminsAndMinerals();
	private VitaminsAndMinerals sodium = new VitaminsAndMinerals();
	private VitaminsAndMinerals zinc = new VitaminsAndMinerals();
	
	public MineralsControl(){
		
		calcium.setName("Calcium");
		calcium.setSignificantSources("");
		calcium.setMainFunctions("");
		calcium.setDiseasesCaused("");
		calcium.setDeficiencySymptoms("");
		
		iron.setName("Iron");
		iron.setSignificantSources("");
		iron.setMainFunctions("");
		iron.setDiseasesCaused("");
		iron.setDeficiencySymptoms("");
		
		fibers.setName("Fibers");
		fibers.setSignificantSources("");
		fibers.setMainFunctions("");
		fibers.setDiseasesCaused("");
		fibers.setDeficiencySymptoms("");
		
		phosphorus.setName("Phosphorus");
		phosphorus.setSignificantSources("Todos os tecidos animais(carne, peixe, aves, ovos e leite");
		phosphorus.setMainFunctions("<html>Mineralização de ossos e dentes; componente de todas as celulas;"
	    + "<br/>" + " importante no material genético, utilizado para a transferência de energia</html>");
		phosphorus.setDiseasesCaused("Fraqueza muscular e dores nos ossos");
		phosphorus.setDeficiencySymptoms("Fraqueza e dores. Raramente ocorre deficiência de fósforo");
		
		iodine.setName("Iodine");
		iodine.setSignificantSources("");
		iodine.setMainFunctions("");
		iodine.setDiseasesCaused("");
		iodine.setDeficiencySymptoms("");
		
		magnesium.setName("Magnesium");
		magnesium.setSignificantSources("");
		magnesium.setMainFunctions("");
		magnesium.setDiseasesCaused("");
		magnesium.setDeficiencySymptoms("");
		
		potassium.setName("Potassium");
		potassium.setSignificantSources("");
		potassium.setMainFunctions("");
		potassium.setDiseasesCaused("");
		potassium.setDeficiencySymptoms("");
		
		protein.setName("Protein");
		protein.setSignificantSources("");
		protein.setMainFunctions("");
		protein.setDiseasesCaused("");
		protein.setDeficiencySymptoms("");
		
		sodium.setName("Sodium");
		sodium.setSignificantSources("");
		sodium.setMainFunctions("");
		sodium.setDiseasesCaused("");
		sodium.setDeficiencySymptoms("");
		
		zinc.setName("Zinc");
		zinc.setSignificantSources("");
		zinc.setMainFunctions("");
		zinc.setDiseasesCaused("");
		zinc.setDeficiencySymptoms("");
		
	}

	public VitaminsAndMinerals getCalcium() {
		return calcium;
	}

	public void setCalcium(VitaminsAndMinerals calcium) {
		this.calcium = calcium;
	}

	public VitaminsAndMinerals getIron() {
		return iron;
	}

	public void setIron(VitaminsAndMinerals iron) {
		this.iron = iron;
	}

	public VitaminsAndMinerals getFibers() {
		return fibers;
	}

	public void setFibers(VitaminsAndMinerals fibers) {
		this.fibers = fibers;
	}

	public VitaminsAndMinerals getPhosphorus() {
		return phosphorus;
	}

	public void setPhosphorus(VitaminsAndMinerals phosphorus) {
		this.phosphorus = phosphorus;
	}

	public VitaminsAndMinerals getIodine() {
		return iodine;
	}

	public void setIodine(VitaminsAndMinerals iodine) {
		this.iodine = iodine;
	}

	public VitaminsAndMinerals getMagnesium() {
		return magnesium;
	}

	public void setMagnesium(VitaminsAndMinerals magnesium) {
		this.magnesium = magnesium;
	}

	public VitaminsAndMinerals getPotassium() {
		return potassium;
	}

	public void setPotassium(VitaminsAndMinerals potassium) {
		this.potassium = potassium;
	}

	public VitaminsAndMinerals getProtein() {
		return protein;
	}

	public void setProtein(VitaminsAndMinerals protein) {
		this.protein = protein;
	}

	public VitaminsAndMinerals getSodium() {
		return sodium;
	}

	public void setSodium(VitaminsAndMinerals sodium) {
		this.sodium = sodium;
	}

	public VitaminsAndMinerals getZinc() {
		return zinc;
	}

	public void setZinc(VitaminsAndMinerals zinc) {
		this.zinc = zinc;
	}

}
