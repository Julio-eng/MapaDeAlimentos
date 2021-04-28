package data;

import model.Disease;

/**
 * Class created to instance Disease objects used to fill the diseases list 
 * @author Julio Cesar and Valderson
 * @version 3.0 (apr 2021)
 */

public class DiseaseData {
	
	private Disease lactoseIntolerant = new Disease();
	private Disease celiac = new Disease();
	
	/**
	 * Constructor method used to set the disease objects attributes 
	 */
	
	public DiseaseData () {
		
		lactoseIntolerant.setName("Intolerancia a lactose");
		lactoseIntolerant.setDiseaseInformation("incapacidade total ou parcial do organismo de produzir a lactase, uma"
				+ " enzima que quebra a lactose, o acucar dos produtos lacteos. Com isso, o composto se acumula no"
				+ " intestino e e fermentado pelas bacterias que vivem ali, provocando mal-estar");
		lactoseIntolerant.setSymptoms("Dor e inchaço abdominal,  diarreia,  gases,  azia,  nausea e dor de cabeça ");
		lactoseIntolerant.setAvoidAliments("Alimentos industrializados, embutidos e processados e leite de origem animal"
				+ " e todos os seus derivados");
		
		celiac.setName("Celiaca");
		celiac.setDiseaseInformation("A doença celiaca ocorre quando as celulas de defesa imunologica agridem as celulas"
				+ " do organismo, causando um processo inflamatorio. E uma inflamacao e provocada pelo gluten, proteina"
				+ " presente no trigo, cevada e centeio");
		celiac.setSymptoms("Diarreia, prisao de ventre, perda de peso, anemia, sensacao de estufamento, colica e "
				+ "desconforto abdominal");
		celiac.setAvoidAliments("Alimentos que possuem glutem, uma proteina presente nos graos de trigo, cevada, centeio "
				+ "e espelta");
		
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
