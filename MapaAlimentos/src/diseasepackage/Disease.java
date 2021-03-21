package diseasepackage;

public class Disease {
	
	public String name;
	public String avoidAliments;
	public String diseaseInformation;
	public String symptoms;
	
	//toString method override	
	public String toString() {
		return name + "\navoidAliments:\n" + avoidAliments + "\ndiseaseInformation:\n"
				+ diseaseInformation + "\nSymptoms:\n" + symptoms;
	}
	//getters and setter 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAvoidAliments() {
		return avoidAliments;
	}
	public void setAvoidAliments(String avoidAliments) {
		this.avoidAliments = avoidAliments;
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
}
