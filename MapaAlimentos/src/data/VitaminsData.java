package data;

import model.VitaminsAndMinerals;

/**
 * Class created to instance VitaminsAndMinerals objects used to fill the vitamins list 
 * @author Julio Cesar and Valderson
 * 
 */

public class VitaminsData {

	private VitaminsAndMinerals vitaminA = new VitaminsAndMinerals();
	private VitaminsAndMinerals vitaminB1 = new VitaminsAndMinerals();
	private VitaminsAndMinerals vitaminB2 = new VitaminsAndMinerals();
	private VitaminsAndMinerals vitaminB3 = new VitaminsAndMinerals();
	private VitaminsAndMinerals vitaminB5 = new VitaminsAndMinerals();
	private VitaminsAndMinerals vitaminB6 = new VitaminsAndMinerals();
	private VitaminsAndMinerals vitaminB9 = new VitaminsAndMinerals();
	private VitaminsAndMinerals vitaminB12 = new VitaminsAndMinerals();
	private VitaminsAndMinerals vitaminC = new VitaminsAndMinerals();
	private VitaminsAndMinerals vitaminD = new VitaminsAndMinerals();
	private VitaminsAndMinerals vitaminE = new VitaminsAndMinerals();
	private VitaminsAndMinerals vitaminH = new VitaminsAndMinerals();
	private VitaminsAndMinerals vitaminK = new VitaminsAndMinerals();
	
	/**
	 * Constructor method used to set the VitaminsAndMinerals objects attributes, more specifically to set the Vitamins 
	 * information
	 */
	
	public VitaminsData() {
		
		vitaminA.setName("Vitamina A");
		vitaminA.setSignificantSources("Alimentos de origem animal: visceras (principalmente figado), gemas de ovos e"
				+ " leite integral e seus derivados (manteiga e queijo)");
		vitaminA.setMainFunctions("Atua principalmente na visao, mas tambem possui papel importante como antioxidante "
				+ "e no funcionamento do sistema imunologico");
		vitaminA.setDiseasesCaused("Xeroftalmia");
		vitaminA.setDeficiencySymptoms("Cegueira noturna, Pele grossa e seca, Atraso no crescimento, Problemas de "
				+ "fertilidade, Enfraquecimento do sistema imune");
		
		vitaminB1.setName("Vitamina B1");
		vitaminB1.setSignificantSources("Variedade de fontes animais e vegetais como carnes, visceras (especialmente o "
				+ "figado, coracao e rins), gema de ovo e graos integrais");
		vitaminB1.setMainFunctions("Metabolismo dos carboidratos, lipidios e proteinas e a estimulacao de nervos "
				+ "perifericos");
		vitaminB1.setDiseasesCaused("Beriberi");
		vitaminB1.setDeficiencySymptoms("Perda de apetite, cansaco, inapetencia, perda de sono, irritabilidade, insonia"
				+ " e formigamento");
		
		vitaminB2.setName("Vitamina B2");
		vitaminB2.setSignificantSources("Vegetais folhosos (couve, brocolis, espinafre, repolho, agriao, "
				+ "entre outros), ovos, carne, semente de girassol, ervilha, e em maior quantidade, na soja,"
				+ " no leite e em frutos do mar");
		vitaminB2.setMainFunctions("Participa de funcoes como estimular a producao de sangue e a manter o metabolismo"
				+ " adequado");
		vitaminB2.setDiseasesCaused("Deficiencia de riboflavina");
		vitaminB2.setDeficiencySymptoms("Inflamacoes e feridas nos cantos da boca, Lingua vermelha e inchada, "
				+ "Visao cansada e sensivel a luz, Cansaco e falta de energia");
		
		vitaminB3.setName("Vitamina B3");
		vitaminB3.setSignificantSources("Carnes, frango, peixes, amendoim, vegetais verdes e extrato de tomate, sendo "
				+ "tambem adicionada em produtos como a farinha de trigo e a farinha de milho");
		vitaminB3.setMainFunctions("Auxiliar no processo metabolico, que transforma os nutrientes dos alimentos em "
				+ "energia fisica e tambem ajuda a diminuir o colesterol presente no sangue");
		vitaminB3.setDiseasesCaused("Deficiencia de niacina");
		vitaminB3.setDeficiencySymptoms("Ma digestao, aparecimento de aftas na boca, Cansaco frequente, Vomitos e "
				+ "Depressao");
		
		vitaminB5.setName("Vitamina B5");
		vitaminB5.setSignificantSources("Gema de ovo, leveduras, rim e figado de animais, brocolis, batata, germen de "
				+ "trigo, abacate, tomate, carne bovina magra, leite desnatado, batata doce e melaco");
		vitaminB5.setMainFunctions("Sintetizador de muitos componentes importantes necessarios pelo corpo humano. Por "
				+ "exemplo, e essencial para a formacao de gorduras, proteinas, hidratos de carbono, aminoacidos e "
				+ "antibioticos, ao mesmo tempo que estimula hormonas adrenais");
		vitaminB5.setDiseasesCaused("Deficiencia de acido Pantotenico");
		vitaminB5.setDeficiencySymptoms("alergia na pele, formigamento e ardor nos pes, mal estar, enjoos, dor de cabeca,"
				+ " sonolencia e caibras no abdomen e gases");
		
		vitaminB6.setName("Vitamina B6");
		vitaminB6.setSignificantSources("Alimentos de origem animal,como carnes, de porco, principalmente, leite e ovos"
				+ "e alimentos de origem vegetal como batata inglesa, aveia, banana, germen de trigo, abacate, levedo de"
				+ "cerveja, cereais, sementes e nozes");
		vitaminB6.setMainFunctions("Atua como coenzima em diversas reacoes metabolicas do organismo, participando da "
				+ "producao de energia por atuar no metabolismo dos aminoacidos, gorduras e proteinas. Alem disso, tambem"
				+ " participa da producao de neurotransmissores");
		vitaminB6.setDiseasesCaused("Anemia");
		vitaminB6.setDeficiencySymptoms("Cansaco e sonolencia, Disturbios no sistema nervoso, como confusao mental e "
				+ "depressao, Dermatite e rachaduras nos cantos da boca e Falta de apetite");
		
		vitaminB9.setName("Vitamina B9");
		vitaminB9.setSignificantSources("Todas as folhas verdes escuras, com destaque para espinafre, brocolis, couve, "
				+ "alface e salsa. Os cereais integrais, feijoes, cogumelos, figado de galinha, ovo, levedura de cerveja"
				+ " e germen de trigo");
		vitaminB9.setMainFunctions("Responsavel pela formacao de proteinas e hemoglobina. e necessario para o crescimento"
				+ " e divisao celular, recuperacao de doencas e funcionamento perfeito do trato intestinal");
		vitaminB9.setDiseasesCaused("Insonia, anorexia e anemia");
		vitaminB9.setDeficiencySymptoms("Insonia, ulceracoes na cavidade oral, dificuldade de memorizacao, falta de ar"
				+ " e cansaco");
		
		vitaminB12.setName("Vitamina B12");
		vitaminB12.setSignificantSources("Salmao vermelho, Levedura nutricional, Mexilhao, Bife de figado Leite e "
				+ "Cereal");
		vitaminB12.setMainFunctions("Importante para, entre outras coisas, manter o metabolismo em funcionamento e "
				+ "producao de globulos vermelhos no sangue");
		vitaminB12.setDiseasesCaused("Anemia e trombose e Hipocobalaminemia");
		vitaminB12.setDeficiencySymptoms("Palidez, fraqueza, fadiga,  fraqueza muscular, perda de reflexos, dificuldade"
				+ " em andar, confusao e demencia");
		
		vitaminC.setName("Vitamina C");
		vitaminC.setSignificantSources("Brocolis, Couve, Pimentao amarelo, Caju, Goiaba, Mamao e Acerola");
		vitaminC.setMainFunctions("Esta relacionada com a producao de colageno, absorcao de ferro e melhora do "
				+ "sistema imune");
		vitaminC.setDiseasesCaused("Anemia");
		vitaminC.setDeficiencySymptoms("Sangramento nas gengivas, hematomas, cicatrizacao, cansaco e comprometer o "
				+ "humor");
		
		vitaminD.setName("Vitamina D");
		vitaminD.setSignificantSources("Carnes, peixes e frutos do mar, como salmao, sardinha e mariscos, e alimentos"
				+ " como ovo, leite, figado, queijos e cogumelos");
		vitaminD.setMainFunctions("Hormonio que regula a quantidade de calcio e fosforo em nosso organismo, aumentando"
				+ " a absorcao desses sais minerais no intestino. e responsavel pela saude de nossos ossos, e tem um "
				+ "papel importante na forca muscular");
		vitaminD.setDiseasesCaused("Diabetes mellitus insulino-dependente, esclerose, multipla doenca inflamatoria "
				+ "intestinal");
		vitaminD.setDeficiencySymptoms("Retardo do crescimento nas criancas, Arqueamento das pernas na crianca, "
				+ "Alargamento das extremidades dos ossos da perna e dos bracos e Atraso no nascimento dos dentes do"
				+ " bebe e caries desde muito cedo");
		
		vitaminE.setName("Vitamina E");
		vitaminE.setSignificantSources("Germen de trigo, carnes, ovos, algodao, oleos (algodao, milho, soja, azeite de "
				+ "dende), amendoas, nozes, manteiga, castanha-do-para, nozes, pistache, gema de ovo, amendoim, semente "
				+ "de girassol, gergilim, vegetais folhosos (espinafre, couve e agriao), linhaca, soja, banana, e "
				+ "legumes");
		vitaminE.setMainFunctions("Acao antioxidante, sendo o alfa-tocoferol o mais potente nesse quesito. Ela e "
				+ "importante no retardo do envelhecimento e ate mesmo na prevencao de doencas serias, como cancer, "
				+ "problemas cardiovasculares, diabetes, catarata e Parkinson");
		vitaminE.setDiseasesCaused("Aterosclerose, Anemia hemolitica, Doencas cardiacas, Mal de Alzheimer e Doencas"
				+ " da retina");
		vitaminE.setDeficiencySymptoms("Diminuicao dos reflexos, dificuldades visuais");
		
		vitaminH.setName("Vitamina H");
		vitaminH.setSignificantSources("Nozes, amendoins, cereais, leite, e gemas. Outros alimentos que contem esta "
				+ "vitamina sao pao de refeicao inteira, salmoes, carne de porco, sardinhas, cogumelo e couve-flor");
		vitaminH.setMainFunctions("Atua no metabolismo das proteinas, carboidratos e lipideos. Age diretamente na "
				+ "formacao da pele, unhas e cabelos, neutraliza o colesterol e tem funcao calmante por atuar no "
				+ "sistema nervoso");
		vitaminH.setDiseasesCaused("Dermatite seca e alopecia");
		vitaminH.setDeficiencySymptoms("Dores musculares, palidez, falta de apetite e flacidez");
		
		vitaminK.setName("Vitamina K");
		vitaminK.setSignificantSources("Vegetais verde-escuros e folhosos (espinafre, couve, alface, salsa, agriao e "
				+ "mostarda), brocolis, nabo, couve-de-bruxelas, repolho, pepino com casca, cebolinha verde, nabo, "
				+ "aspargo, abacate, ervilhas, quiabo e figado (boi, frango e porco)");
		vitaminK.setMainFunctions("Importante na ativacao de proteinas que atuam na coagulacao sanguinea e na fixacao"
				+ " do calcio no organismo, a vitamina K e um nutriente lipossoluvel que contribui para a saude "
				+ "cardiovascular e dos ossos");
		vitaminK.setDiseasesCaused("Osteoporose, calcificacao de arterias e outros tecidos moles");
		vitaminK.setDeficiencySymptoms("Sangramento (hemorragia) sob a pele, nasal e do estomago ou do intestino");

	}
	//getters and setters
	public VitaminsAndMinerals getVitaminA() {
		return vitaminA;
	}

	public void setVitaminA(VitaminsAndMinerals vitaminA) {
		this.vitaminA = vitaminA;
	}

	public VitaminsAndMinerals getVitaminB1() {
		return vitaminB1;
	}

	public void setVitaminB1(VitaminsAndMinerals vitaminB1) {
		this.vitaminB1 = vitaminB1;
	}

	public VitaminsAndMinerals getVitaminB2() {
		return vitaminB2;
	}

	public void setVitaminB2(VitaminsAndMinerals vitaminB2) {
		this.vitaminB2 = vitaminB2;
	}

	public VitaminsAndMinerals getVitaminB3() {
		return vitaminB3;
	}

	public void setVitaminB3(VitaminsAndMinerals vitaminB3) {
		this.vitaminB3 = vitaminB3;
	}

	public VitaminsAndMinerals getVitaminB5() {
		return vitaminB5;
	}

	public void setVitaminB5(VitaminsAndMinerals vitaminB5) {
		this.vitaminB5 = vitaminB5;
	}

	public VitaminsAndMinerals getVitaminB6() {
		return vitaminB6;
	}

	public void setVitaminB6(VitaminsAndMinerals vitaminB6) {
		this.vitaminB6 = vitaminB6;
	}

	public VitaminsAndMinerals getVitaminB9() {
		return vitaminB9;
	}

	public void setVitaminB9(VitaminsAndMinerals vitaminB9) {
		this.vitaminB9 = vitaminB9;
	}

	public VitaminsAndMinerals getVitaminB12() {
		return vitaminB12;
	}

	public void setVitaminB12(VitaminsAndMinerals vitaminB12) {
		this.vitaminB12 = vitaminB12;
	}

	public VitaminsAndMinerals getVitaminC() {
		return vitaminC;
	}

	public void setVitaminC(VitaminsAndMinerals vitaminC) {
		this.vitaminC = vitaminC;
	}

	public VitaminsAndMinerals getVitaminD() {
		return vitaminD;
	}

	public void setVitaminD(VitaminsAndMinerals vitaminD) {
		this.vitaminD = vitaminD;
	}

	public VitaminsAndMinerals getVitaminE() {
		return vitaminE;
	}

	public void setVitaminE(VitaminsAndMinerals vitaminE) {
		this.vitaminE = vitaminE;
	}

	public VitaminsAndMinerals getVitaminH() {
		return vitaminH;
	}

	public void setVitaminH(VitaminsAndMinerals vitaminH) {
		this.vitaminH = vitaminH;
	}

	public VitaminsAndMinerals getVitaminK() {
		return vitaminK;
	}

	public void setVitaminK(VitaminsAndMinerals vitaminK) {
		this.vitaminK = vitaminK;
	}
	
}
