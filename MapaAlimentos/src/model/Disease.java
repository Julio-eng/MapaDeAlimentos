package model;

/**
 * This class was created as a model to instance disease objects, the objects will contain informations about a disease related
 * to aliments
 * @author Julio Cesar and Valderson
 *
 */

public class Disease {
	
	public String name;
	public String diseaseInformation;
	public String symptoms;
	public String avoidAliments;
	
	/**
	 * the to string method return just the name to display just the name when it is added to the list
	 */
	public String toString() {
		return name;
	}
	//getters and setter 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDiseaseInformation() {
		return diseaseInformation;
	}

	public void setDiseaseInformation(String diseaseInformation) {
		this.diseaseInformation = diseaseInformation;
	}

	public String getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}

	public String getAvoidAliments() {
		return avoidAliments;
	}

	public void setAvoidAliments(String avoidAliments) {
		this.avoidAliments = avoidAliments;
	}
	
}
