package model;

/**
 * This class was created as a model to instance vitamins and minerals objects, as they share the same attributes 
 * @author Julio Cesar and Valderson
 * @version 3.0 (apr 2021)
 */

public class VitaminsAndMinerals {
	
	private String name;
	private String significantSources;
	private String mainFunctions;
	private String diseasesCaused;
	private String deficiencySymptoms;
	
	/**
	 * the to string method return just the name to display just the name when it is added to the list
	 */
	public String toString() {
		return name ;
	}
	
	//getters and setters
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
	
}
