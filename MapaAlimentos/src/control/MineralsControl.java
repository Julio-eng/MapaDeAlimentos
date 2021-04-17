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
		
		calcium.setName("Calcio");
		calcium.setSignificantSources("Tofu, brocolis, sardinha, espinafre, leite e Semente de gergelim");
		calcium.setMainFunctions("O calcio e essencial para a transmissao nervosa, coagulacao do sangue e "
				+ "contracao muscular; atua tambem na respiração celular, alem de garantir uma boa formacao "
				+ "e manutencao de ossos e dentes");
		calcium.setDiseasesCaused("A deficiencia de calcio pode levar a osteopenia e osteoporose, na qual "
				+ "os ossos se deterioram e ha um aumento no risco de fraturas, especialmente nos ossos "
				+ "mais porosos");
		calcium.setDeficiencySymptoms("agitacao, unhas quebradicas, propensao a caries, depressao, "
				+ "hipertensao, insonia, irritabilidade, dormencia no corpo e palpitacoes.");
		
		iron.setName("Ferro");
		iron.setSignificantSources("Espinafre, leguminosas, semente de abobora, quinoa e brocolis");
		iron.setMainFunctions("participacao na composicao da hemoglobina, um pigmento encontrado nas hemacias"
				+ " e responsavel pelo transporte de oxigenio. Esse mineral tambem e importante para a "
				+ "sintese de DNA e para o metabolismo energetico");
		iron.setDiseasesCaused("Anemia por carencia de ferro");
		iron.setDeficiencySymptoms("cansaco extremo, fraqueza, indisposicao diversa, dores de cabeca, "
				+ "sonolencia e lentidao muscular");
		
		fibers.setName("Fibras");
		fibers.setSignificantSources("Leguminosas (feijao, ervilha, lentilha, grao de bico, soja em grao), "
				+ "graos, farelos e farinhas integrais (arroz, linhaca, aveia, cevada, milho, trigo), "
				+ "paes e biscoitos integrais (centeio, farinha integral, milho)");
		fibers.setMainFunctions("ajudam a diminuir a quantidade de colesterol absorvido pelo corpo, reduzem a"
				+ " absorção da glicose no intestino delgado, mantem os níveis adequados de minerais, "
				+ "aumentam o tempo de absorcao dos nutrientes no intestino delgado");
		fibers.setDiseasesCaused("Constipacao intestinal (prisao de ventre)");
		fibers.setDeficiencySymptoms("Instestino nao funcional");
		
		phosphorus.setName("Fosforo");
		phosphorus.setSignificantSources("Todos os tecidos animais(carne, peixe, aves, ovos e leite");
		phosphorus.setMainFunctions("Mineralização de ossos e dentes; componente de todas as celulas;"
	    +" importante no material genético, utilizado para a transferência de energia");
		phosphorus.setDiseasesCaused("Fraqueza muscular e dores nos ossos");
		phosphorus.setDeficiencySymptoms("Fraqueza e dores. Raramente ocorre deficiência de fósforo");
		
		iodine.setName("Iodo");
		iodine.setSignificantSources("Alimentos de origem marinha (ostras, moluscos, mariscos e peixes"
				+ " de agua salgada)");
		iodine.setMainFunctions("Mineral que se faz necessario para a producao da síntese de hormonios"
				+ " da tireoide, os quais são responsáveis pela correta regulações das funcoes do organismo");
		iodine.setDiseasesCaused("Hipotireoidismo e bocio endemico");
		iodine.setDeficiencySymptoms("Desenvolvimento do bocio, metabolismo lento, pele Seca");
		
		magnesium.setName("Magnesio");
		magnesium.setSignificantSources("frutas como uva, banana e abacate; grãos e derivados como a granola,"
				+ " gérmen de trigo e aveia; sementes e nozes como gergelim, amendoim, girassol castanha e "
				+ "amendoim, além de leite, soja, grão de bico, pão, peixes, batata, beterraba, couve e "
				+ "espinafre");
		magnesium.setMainFunctions("O magnésio é necessário para a formação dos ossos e dentes e para o "
				+ "funcionamento normal dos nervos e dos músculos. Muitas enzimas do corpo dependem do "
				+ "magnésio para funcionar normalmente");
		magnesium.setDiseasesCaused("Anemia, anorexia e ansiedade");
		magnesium.setDeficiencySymptoms("Agitacao, maos e pes gelados e insonia");
		
		potassium.setName("Potassio");
		potassium.setSignificantSources("Abacate, banana, Batata-doce, Folhas de coloração verde escura,"
				+ "Iogurte, Molho de tomate e Peixes");
		potassium.setMainFunctions("");
		potassium.setDiseasesCaused("");
		potassium.setDeficiencySymptoms("");
		
		protein.setName("Proteina");
		protein.setSignificantSources("Alimentos de origem animal, como a carne, o peixe, ovo, leite, queijo"
				+ " e iogurte e de origem vegetal, como as leguminosas (ervilhas, soja e grãos)");
		protein.setMainFunctions("");
		protein.setDiseasesCaused("");
		protein.setDeficiencySymptoms("");
		
		sodium.setName("Sodio");
		sodium.setSignificantSources("alimentos de origem animal como carne, peixe, ovos ou leite");
		sodium.setMainFunctions("");
		sodium.setDiseasesCaused("");
		sodium.setDeficiencySymptoms("");
		
		zinc.setName("Zinco");
		zinc.setSignificantSources("Amendoim, Amêndoa, Camarão, Carne vermelha, Castanhas, Chocolate amargo,"
				+ " Feijão e Grão-de-bico");
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
