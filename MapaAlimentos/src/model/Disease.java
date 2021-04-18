package model;

public class Disease {
	
	public String name;
	public String diseaseInformation;
	public String symptoms;
	public String avoidAliments;
	
	//toString method override	
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
