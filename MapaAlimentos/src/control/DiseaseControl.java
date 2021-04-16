package control;

import model.Disease;

public class DiseaseControl {
	
	private Disease lactoseIntolerant = new Disease();
	private Disease celiac = new Disease();
	
	public DiseaseControl () {
		
		lactoseIntolerant.setName("Intolerancia a lactose");
		lactoseIntolerant.setDiseaseInformation("");
		lactoseIntolerant.setSymptoms("");
		lactoseIntolerant.setAvoidAliments("");
		
		celiac.setName("Celiaca");
		celiac.setDiseaseInformation("");
		celiac.setSymptoms("");
		celiac.setAvoidAliments("");
		
	}

	public Disease getLactoseIntolerant() {
		return lactoseIntolerant;
	}

	public void setLactoseIntolerant(Disease lactoseIntolerant) {
		this.lactoseIntolerant = lactoseIntolerant;
	}

	public Disease getCeliac() {
		return celiac;
	}

	public void setCeliac(Disease celiac) {
		this.celiac = celiac;
	}
	
	
}
