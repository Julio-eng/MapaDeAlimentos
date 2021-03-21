package vitaminsandmineralspackage;

public class VitaminsAndMinerals {
	
	private String name;
	private String significantSources;
	private String mainFunctions;
	private String diseasesCaused;
	private String deficiencySymptoms;
	
	//toString method override
	public String toString() {
		return name + "\n\nfontesSignificativas:\n" + significantSources
				+ "\n\nprincipaisFuncoes:\n" + mainFunctions + "\n\ndoencasProvocadas:\n" + diseasesCaused
				+ "\n\nsintomasDeficiencia:\n" + deficiencySymptoms;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSignificantSources() {
		return significantSources;
	}

	public void setSignificantSources(String significantSources) {
		this.significantSources = significantSources;
	}

	public String getMainFunctions() {
		return mainFunctions;
	}

	public void setMainFunctions(String mainFunctions) {
		this.mainFunctions = mainFunctions;
	}

	public String getDiseasesCaused() {
		return diseasesCaused;
	}

	public void setDiseasesCaused(String diseasesCaused) {
		this.diseasesCaused = diseasesCaused;
	}

	public String getDeficiencySymptoms() {
		return deficiencySymptoms;
	}

	public void setDeficiencySymptoms(String deficiencySymptoms) {
		this.deficiencySymptoms = deficiencySymptoms;
	}
	
	///getters and setters
	
}
