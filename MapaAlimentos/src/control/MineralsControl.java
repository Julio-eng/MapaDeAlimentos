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
				+ "contracao muscular; atua tambem na respiracao celular, alem de garantir uma boa formacao "
				+ "e manutencao de ossos e dentes");
		calcium.setDiseasesCaused("A deficiencia de calcio pode levar a osteopenia e osteoporose, na qual "
				+ "os ossos se deterioram e ha um aumento no risco de fraturas, especialmente nos ossos "
				+ "mais porosos");
		calcium.setDeficiencySymptoms("Agitacao, unhas quebradicas, propensao a caries, depressao, "
				+ "hipertensao, insonia, irritabilidade, dormencia no corpo e palpitacoes.");
		
		iron.setName("Ferro");
		iron.setSignificantSources("Espinafre, leguminosas, semente de abobora, quinoa e brocolis");
		iron.setMainFunctions("Participacao na composicao da hemoglobina, um pigmento encontrado nas hemacias"
				+ " e responsavel pelo transporte de oxigenio. Esse mineral tambem e importante para a "
				+ "sintese de DNA e para o metabolismo energetico");
		iron.setDiseasesCaused("Anemia por carencia de ferro");
		iron.setDeficiencySymptoms("Cansaco extremo, fraqueza, indisposicao diversa, dores de cabeca, "
				+ "sonolencia e lentidao muscular");
		
		fibers.setName("Fibras");
		fibers.setSignificantSources("Leguminosas (feijao, ervilha, lentilha, grao de bico, soja em grao), "
				+ "graos, farelos e farinhas integrais (arroz, linhaca, aveia, cevada, milho, trigo), "
				+ "paes e biscoitos integrais (centeio, farinha integral, milho)");
		fibers.setMainFunctions("Ajudam a diminuir a quantidade de colesterol absorvido pelo corpo, reduzem a"
				+ " absorcao da glicose no intestino delgado, mantem os niveis adequados de minerais, "
				+ "aumentam o tempo de absorcao dos nutrientes no intestino delgado");
		fibers.setDiseasesCaused("Constipacao intestinal (prisao de ventre)");
		fibers.setDeficiencySymptoms("Instestino nao funcional");
		
		phosphorus.setName("Fosforo");
		phosphorus.setSignificantSources("Todos os tecidos animais(carne, peixe, aves, ovos e leite");
		phosphorus.setMainFunctions("Mineralizacao de ossos e dentes; componente de todas as celulas;"
	    +" importante no material genetico, utilizado para a transferencia de energia");
		phosphorus.setDiseasesCaused("Fraqueza muscular e dores nos ossos");
		phosphorus.setDeficiencySymptoms("Fraqueza e dores. Raramente ocorre deficiencia de fosforo");
		
		iodine.setName("Iodo");
		iodine.setSignificantSources("Alimentos de origem marinha (ostras, moluscos, mariscos e peixes"
				+ " de agua salgada)");
		iodine.setMainFunctions("Mineral que se faz necessario para a producao da sintese de hormonios"
				+ " da tireoide, os quais sao responsaveis pela correta regulacoes das funcoes do organismo");
		iodine.setDiseasesCaused("Hipotireoidismo e bocio endemico");
		iodine.setDeficiencySymptoms("Desenvolvimento do bocio, metabolismo lento, pele Seca");
		
		magnesium.setName("Magnesio");
		magnesium.setSignificantSources("Frutas como uva, banana e abacate; graos e derivados como a granola,"
				+ " germen de trigo e aveia; sementes e nozes como gergelim, amendoim, girassol castanha e "
				+ "amendoim, alem de leite, soja, grao de bico, pao, peixes, batata, beterraba, couve e "
				+ "espinafre");
		magnesium.setMainFunctions("O magnesio e necessario para a formacao dos ossos e dentes e para o "
				+ "funcionamento normal dos nervos e dos musculos. Muitas enzimas do corpo dependem do "
				+ "magnesio para funcionar normalmente");
		magnesium.setDiseasesCaused("Anemia, anorexia e ansiedade");
		magnesium.setDeficiencySymptoms("Agitacao, maos e pes gelados e insonia");
		
		potassium.setName("Potassio");
		potassium.setSignificantSources("Abacate, banana, Batata-doce, Folhas de coloracao verde escura,"
				+ "Iogurte, Molho de tomate e Peixes");
		potassium.setMainFunctions("O potassio e crucial para a funcao cardiaca e desempenha um papel fundamental"
				+ " na contracao do musculo esqueletico, o que beneficia uma digestao normal e as funcoes musculares.");
		potassium.setDiseasesCaused("Hipocalemia (quantidade baixa de potassio presente na corrente sanguinea)");
		potassium.setDeficiencySymptoms("Vomitos, diarreia, disturbios da glandula adrenal ou do uso de diureticos");
		
		protein.setName("Proteina");
		protein.setSignificantSources("Alimentos de origem animal, como a carne, o peixe, ovo, leite, queijo"
				+ " e iogurte e de origem vegetal, como as leguminosas (ervilhas, soja e graos)");
		protein.setMainFunctions("Transporte de oxigenio (hemoglobina), protecao do corpo contra organismos patogenicos"
				+ " (anticorpos), catalizadora de reacoes quimicas (enzimas), receptora de membrana, contracao muscular"
				+ " (actina e miosina), fundamentais para o crescimento e formacao dos hormonios");
		protein.setDiseasesCaused("Desnutricao seca (comum em criancas menores de 18 meses que substituem o leite "
				+ "materno por dieta)");
		protein.setDeficiencySymptoms("Flacidez muscular, Esgotamento fisico e mental, Queda de cabelos e unhas fracas, "
				+ "Cicatrizacao lenta");
		
		sodium.setName("Sodio");
		sodium.setSignificantSources("Alimentos de origem animal como carne, peixe, ovos ou leite");
		sodium.setMainFunctions("ajuda o organismo a manter um equilibrio hidrico normal e desempenha um papel importante"
				+ " na funcao normal de nervos e musculos");
		sodium.setDiseasesCaused("Hiponatremia (niveis baixos de sodio no sangue)");
		sodium.setDeficiencySymptoms("Nauseas e vomitos, Dor de cabeca, Confusao mental, Perda de energia e fadiga");
		
		zinc.setName("Zinco");
		zinc.setSignificantSources("Amendoim, Amendoa, Camarao, Carne vermelha, Castanhas, Chocolate amargo,"
				+ " Feijao e Grao-de-bico");
		zinc.setMainFunctions("Necessario para o funcionamento adequado do sistema imunologico, intervem no funcionamento"
				+ " de certos hormonios e e indispensavel a sintese de proteinas");
		zinc.setDiseasesCaused("Deficiencia de Zinco");
		zinc.setDeficiencySymptoms("Mais vulneravel a doencas como viroses e resfriados, diarreia cronica, queda de "
				+ "cabelo e paladar alterado");
		
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
