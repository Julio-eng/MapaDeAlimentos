package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import control.AlimentsControl;
import model.NutritionalTable;
import model.VitaminsAndMinerals;

public class AlimentView implements ListSelectionListener, ActionListener {
	
	//--------------------------IMAGES----------------------------------------------------------------------------------------------------------
	private ImageIcon regressIcon = new ImageIcon("regress.png");
	private ImageIcon menuIcon2 = new ImageIcon("menu.png");	
	//--------------------------FRAME-----------------------------------------------------------------------------------------------------------
	private JFrame alimentFrame = new JFrame();
	//--------------------------PANELS----------------------------------------------------------------------------------------------------------
	private JPanel alimentListPanel = new JPanel();
	private JPanel listOfAlimentsPanel = new JPanel();
	private JPanel informationViewPanel = new JPanel();
	private JPanel addPanel = new JPanel();
	private JLabel listOfAlimentsLabel = new JLabel("Lista de Alimentos");
	private JLabel nutritionalTableLabel = new JLabel("Tabela Nutricional");
	private JLabel addANewAliment = new JLabel("Adicionar novo alimento");
	private JLabel nameOfTheAliment = new JLabel();
	//--------------------------BUTTONS---------------------------------------------------------------------------------------------------------
	private JButton add = new JButton();
	private JButton edit = new JButton();
	private JButton delete = new JButton();
	private JButton save = new JButton();
	private JButton save2 = new JButton();
	private JButton regress = new JButton();
	private JButton menu = new JButton();
	private JButton regress2 = new JButton();
	private JButton menu2 = new JButton();
	private JButton regress3 = new JButton();
	private JButton menu3 = new JButton();
	//--------------------------LIST------------------------------------------------------------------------------------------------------------
	private DefaultListModel<NutritionalTable> model = new DefaultListModel<NutritionalTable>();
	private JList<NutritionalTable> alimentsJList = new JList<NutritionalTable>(model);
	//--------------------------BUTTONS---------------------------------------------------------------------------------------------------------
	private JScrollPane scroll = new JScrollPane();
	//--------------------------TEXT-AREA-------------------------------------------------------------------------------------------------------
	private JTextArea nutritionalTableInformations = new JTextArea();
	private JTextArea nutritionalTableAdd = new JTextArea();
	//--------------------------TEXT-FIELD------------------------------------------------------------------------------------------------------
	private JTextField nameSubmit = new JTextField();
	private JTextField calorieSubmit = new JTextField();
	private JTextField proteinsSubmit = new JTextField();
	private JTextField carbohydrateSubmit = new JTextField();
	private JTextField lipidsSubmit = new JTextField();
	private JTextField calciumSubmit = new JTextField();
	private JTextField ironSubmit = new JTextField();
	private JTextField fiberSubmit = new JTextField();
	private JTextField phosphorSubmit = new JTextField();
	private JTextField iodineSubmit = new JTextField();
	private JTextField magnesiumSubmit = new JTextField();
	private JTextField potassiumSubmit = new JTextField();
	private JTextField sodiumSubmit = new JTextField();
	private JTextField zincSubmit = new JTextField();
	private JTextField vitaminASubmit = new JTextField();
	private JTextField vitaminB1Submit = new JTextField();
	private JTextField vitaminB2Submit = new JTextField();
	private JTextField vitaminB3Submit = new JTextField();
	private JTextField vitaminB5Submit = new JTextField();
	private JTextField vitaminB6Submit = new JTextField();
	private JTextField vitaminB9Submit = new JTextField();
	private JTextField vitaminB12Submit = new JTextField();
	private JTextField vitaminCSubmit = new JTextField();
	private JTextField vitaminDSubmit = new JTextField();
	private JTextField vitaminESubmit = new JTextField();
	private JTextField vitaminHSubmit = new JTextField();
	private JTextField vitaminKSubmit = new JTextField();
	private JTextField nameSubmit2 = new JTextField();
	private JTextField calorieSubmit2 = new JTextField();
	private JTextField proteinsSubmit2 = new JTextField();
	private JTextField carbohydrateSubmit2 = new JTextField();
	private JTextField lipidsSubmit2 = new JTextField();
	private JTextField calciumSubmit2 = new JTextField();
	private JTextField ironSubmit2 = new JTextField();
	private JTextField fiberSubmit2 = new JTextField();
	private JTextField phosphorSubmit2 = new JTextField();
	private JTextField iodineSubmit2 = new JTextField();
	private JTextField magnesiumSubmit2 = new JTextField();
	private JTextField potassiumSubmit2 = new JTextField();
	private JTextField sodiumSubmit2 = new JTextField();
	private JTextField zincSubmit2 = new JTextField();
	private JTextField vitaminASubmit2 = new JTextField();
	private JTextField vitaminB1Submit2 = new JTextField();
	private JTextField vitaminB2Submit2 = new JTextField();
	private JTextField vitaminB3Submit2 = new JTextField();
	private JTextField vitaminB5Submit2 = new JTextField();
	private JTextField vitaminB6Submit2 = new JTextField();
	private JTextField vitaminB9Submit2 = new JTextField();
	private JTextField vitaminB12Submit2 = new JTextField();
	private JTextField vitaminCSubmit2 = new JTextField();
	private JTextField vitaminDSubmit2 = new JTextField();
	private JTextField vitaminESubmit2 = new JTextField();
	private JTextField vitaminHSubmit2 = new JTextField();
	private JTextField vitaminKSubmit2 = new JTextField();


	
	AlimentView(){
		
		//FRAME--------------------------------------------------------------------------------------------------------------------
		alimentFrame.setVisible(true);
		alimentFrame.setSize(500, 800); 
		alimentFrame.setTitle("Mapa de Alimentos"); 	
		alimentFrame.setResizable(false);
		alimentFrame.setLayout(null);
		alimentFrame.getContentPane().setBackground(new Color(240, 192, 134)); //background color
		alimentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		alimentFrame.add(listOfAlimentsPanel);
		alimentFrame.add(informationViewPanel);
		alimentFrame.add(add);
		alimentFrame.add(addPanel);		
		
		
		vitaminASubmit.setEditable(true);
		
		//ADD PANEL----------------------------------------------------------------------------------------------------------------
		addPanel.setSize(500, 800);
		addPanel.setBackground(new Color(240, 192, 134));
		addPanel.setLayout(null);
		addPanel.add(nutritionalTableAdd);	
		addPanel.add(addANewAliment);
		addPanel.add(calorieSubmit);
		addPanel.add(proteinsSubmit);
		addPanel.add(carbohydrateSubmit);
		addPanel.add(lipidsSubmit);
		addPanel.add(calciumSubmit);
		addPanel.add(ironSubmit);
		addPanel.add(fiberSubmit);
		addPanel.add(phosphorSubmit);
		addPanel.add(iodineSubmit);
		addPanel.add(magnesiumSubmit);
		addPanel.add(potassiumSubmit);
		addPanel.add(sodiumSubmit);
		addPanel.add(zincSubmit);
		addPanel.add(vitaminASubmit);
		addPanel.add(vitaminB1Submit);
		addPanel.add(vitaminB2Submit);
		addPanel.add(vitaminB3Submit);
		addPanel.add(vitaminB5Submit);
		addPanel.add(vitaminB6Submit);
		addPanel.add(vitaminB9Submit);
		addPanel.add(vitaminB12Submit);
		addPanel.add(vitaminCSubmit);
		addPanel.add(vitaminDSubmit);
		addPanel.add(vitaminESubmit);
		addPanel.add(vitaminHSubmit);
		addPanel.add(vitaminKSubmit);
		addPanel.add(nameSubmit);
		addPanel.add(save);
		addPanel.add(regress2);
		addPanel.add(menu2);
		
		//MAIN PANEL---------------------------------------------------------------------------------------------------------------
		listOfAlimentsPanel.setVisible(true);
		listOfAlimentsPanel.setSize(500, 800); 
		listOfAlimentsPanel.setLayout(null);
		listOfAlimentsPanel.add(alimentListPanel);
		listOfAlimentsPanel.add(add);
		listOfAlimentsPanel.add(listOfAlimentsLabel);
		listOfAlimentsPanel.setBackground(new Color(240, 192, 134));
		listOfAlimentsPanel.add(regress);
		listOfAlimentsPanel.add(menu);
		
		//INFO VIEW PANEL----------------------------------------------------------------------------------------------------------
		informationViewPanel.setVisible(true);
		informationViewPanel.setSize(500, 800); 
		informationViewPanel.setLayout(null);
		informationViewPanel.setBackground(new Color(240, 192, 134));
		informationViewPanel.add(nutritionalTableLabel);
		informationViewPanel.add(nutritionalTableInformations);
		informationViewPanel.add(delete);
		informationViewPanel.add(edit);
		informationViewPanel.add(nameOfTheAliment);
		informationViewPanel.add(save2);
		informationViewPanel.add(nameSubmit2);	
		informationViewPanel.add(calorieSubmit2);
		informationViewPanel.add(proteinsSubmit2);
		informationViewPanel.add(carbohydrateSubmit2);
		informationViewPanel.add(lipidsSubmit2);
		informationViewPanel.add(calciumSubmit2);
		informationViewPanel.add(ironSubmit2);
		informationViewPanel.add(fiberSubmit2);
		informationViewPanel.add(phosphorSubmit2);
		informationViewPanel.add(iodineSubmit2);
		informationViewPanel.add(magnesiumSubmit2);
		informationViewPanel.add(potassiumSubmit2);
		informationViewPanel.add(sodiumSubmit2);
		informationViewPanel.add(zincSubmit2);
		informationViewPanel.add(vitaminASubmit2);
		informationViewPanel.add(vitaminB1Submit2);
		informationViewPanel.add(vitaminB2Submit2);
		informationViewPanel.add(vitaminB3Submit2);
		informationViewPanel.add(vitaminB5Submit2);
		informationViewPanel.add(vitaminB6Submit2);
		informationViewPanel.add(vitaminB9Submit2);
		informationViewPanel.add(vitaminB12Submit2);
		informationViewPanel.add(vitaminCSubmit2);
		informationViewPanel.add(vitaminDSubmit2);
		informationViewPanel.add(vitaminESubmit2);
		informationViewPanel.add(vitaminHSubmit2);
		informationViewPanel.add(vitaminKSubmit2);
		informationViewPanel.add(regress3);
		informationViewPanel.add(menu3);

				
		//LIST PANEL----------------------------------------------------------------------------------------------------------------
		alimentListPanel.setBounds(30, 100, 300, 550);
		alimentListPanel.setVisible(true);	
		alimentListPanel.setLayout(null);
		alimentListPanel.add(scroll);
		
		//LABEL--------------------------------------------------------------------------------------------------------------------
		listOfAlimentsLabel.setFont(new Font("Arial", Font.BOLD, 30));
		listOfAlimentsLabel.setBounds(30, 50, 300, 30);
		
		//TABELA NUTRICIONAL LABEL--------------------------------------------------------------------------------------------------
		nutritionalTableLabel.setFont(new Font("Arial", Font.BOLD, 30));
		nutritionalTableLabel.setBounds(110, 20, 300, 30);
		
		//ADD A NEW ALIMENT LABEL--------------------------------------------------------------------------------------------------
		addANewAliment.setFont(new Font("Arial", Font.BOLD, 30));
		addANewAliment.setBounds(45, 40, 400, 30);
		
		//NAME OF THE ALIMENT UNDER "NUTRITIONAL TABLE------------------------------------------------------------------------------
		nameOfTheAliment.setFont(new Font("Arial", Font.BOLD, 20));
		nameOfTheAliment.setBounds(44, 83, 400, 30);
		
		
		//JTEXTAREA NUTRITIONAL INFO DISPLAY----------------------------------------------------------------------------------------
		nutritionalTableInformations.setBounds(32, 80, 149, 700);
		nutritionalTableInformations.setEditable(false);
		nutritionalTableInformations.setLineWrap(true);
		nutritionalTableInformations.setWrapStyleWord(true);
		nutritionalTableInformations.setFont(new Font("Arial", Font.BOLD, 20));
		nutritionalTableInformations.setBackground(new Color(240, 192, 134));
		
		//JTEXTAREA OF ADD BUTTON---------------------------------------------------------------------------------------------------
		nutritionalTableAdd.setBounds(32, 90, 150, 680);
		nutritionalTableAdd.setEditable(false);
		nutritionalTableAdd.setLineWrap(true);
		nutritionalTableAdd.setWrapStyleWord(true);
		nutritionalTableAdd.setFont(new Font("Arial", Font.BOLD, 20));
		nutritionalTableAdd.setBackground(new Color(240, 192, 134));
		
		//BUTTONS------------------------------------------------------------------------------------------------------------------
		standardizeButtons(add, "Adicionar", 30, 670, 100, 50);
		standardizeButtons(edit, "Editar", 370, 600, 100, 50);
		standardizeButtons(save, "Salvar", 370, 670, 100, 50);
		standardizeButtons(delete, "Deletar", 370, 670, 100, 50);
		standardizeButtons(save2, "Salvar", 370, 530, 100, 50);
		setMiniButtons(regress, regressIcon, 0);
		setMiniButtons(menu, menuIcon2, 32);
		setMiniButtons(regress2, regressIcon, 0);
		setMiniButtons(menu2, menuIcon2, 32);
		setMiniButtons(regress3, regressIcon, 0);
		setMiniButtons(menu3, menuIcon2, 32);
		
			
		//SCROLL---------------------------------------------------------------------------------------------------------------------
		scroll.setVisible(true);
		scroll.setBounds(0, 0, 300, 550);
		scroll.setViewportView(alimentsJList);
		

		//ADD ELEMENTS---------------------------------------------------------------------------------------------------------------
		model.addElement(new AlimentsControl().getBananaPrataCrua());
		model.addElement(new AlimentsControl().getLeiteIntegralDeVaca());
		model.addElement(new AlimentsControl().getLeiteDeVacaDesnatado());
		
		//JLIST----------------------------------------------------------------------------------------------------------------------
		alimentsJList.addListSelectionListener(this);
		
		
	}


	@Override
	public void valueChanged(ListSelectionEvent e) {
		
		NutritionalTable object = alimentsJList.getSelectedValue();	
		
			if(e.getValueIsAdjusting() && e.getSource() == alimentsJList ) {
		
				listOfAlimentsPanel.setVisible(false);
				informationViewPanel.setVisible(true);		
				addPanel.setVisible(false);
				
		
				
				nutritionalTableInformations.setText("  Name: "
						+ "\n  Calorias: "
						+ "\n  Proteinas: "
						+ "\n  Carboidratos: "
						+ "\n  Lipidios: "
						+ "\n  Calcio: "
						+ "\n  Ferro: "
						+ "\n  Fibras: "
						+ "\n  Fosforo: "
						+ "\n  Iodo: "
						+ "\n  Magnesio: "
						+ "\n  Potassio: "
						+ "\n  Sodio: "
						+ "\n  Zinco: "
						+ "\n  Vitamina A: "
						+ "\n  Vitamina B1: "
						+ "\n  Vitamina B2: "
						+ "\n  Vitamina B3: "
						+ "\n  Vitamina B5: "
						+ "\n  Vitamina B6: "
						+ "\n  Vitamina B9: "
						+ "\n  Vitamina B12: "
						+ "\n  Vitamina C: "
						+ "\n  Vitamina D: "
						+ "\n  Vitamina E: "
						+ "\n  Vitamina H: "
						+ "\n  Vitamina K: ");	

				
				  
				int a = 1;
				
				displayObjectJTextFieldInformation(nameSubmit2, object.getName(),  83, 170, 20);
				displayObjectJTextFieldInformation(calorieSubmit2, object.getCalorie(),  1 + 83 + 23*a, 170, 20); a++;
			  	displayObjectJTextFieldInformation(proteinsSubmit2, object.getProtein(),  2 + 83 + 23*a, 170, 20); a++;
				displayObjectJTextFieldInformation(carbohydrateSubmit2, object.getCarbohydrate(),  3 + 83 + 23*a, 170, 20); a++;
				displayObjectJTextFieldInformation(lipidsSubmit2, object.getLipids(),  4 + 83 + 23*a, 170, 20); a++;
				displayObjectJTextFieldInformation(calciumSubmit2, object.getCalcium(),  5 + 83 + 23*a, 170, 20); a++;
				displayObjectJTextFieldInformation(ironSubmit2, object.getIron(),  5 + 83 + 23*a, 170, 20); a++;
				displayObjectJTextFieldInformation(fiberSubmit2, object.getFiber(),  5 + 83 + 23*a, 170, 20); a++;
			    displayObjectJTextFieldInformation(phosphorSubmit2, object.getPhosphor(),  6 + 83 + 23*a, 170, 20); a++;
		   		displayObjectJTextFieldInformation(iodineSubmit2, object.getIodine(),  6 + 83 + 23*a, 170, 20); a++;
		 		displayObjectJTextFieldInformation(magnesiumSubmit2, object.getMagnesium(),  9 +  83 + 23*a, 170, 20); a++;
       			displayObjectJTextFieldInformation(potassiumSubmit2, object.getPotassium(),  9 +  83 + 23*a, 170, 20); a++;
				displayObjectJTextFieldInformation(sodiumSubmit2, object.getSodium(),  13 + 83 + 23*a, 170, 20); a++;
				displayObjectJTextFieldInformation(zincSubmit2, object.getZinc(),  13 + 83 + 23*a, 170, 20); a++;
				displayObjectJTextFieldInformation(vitaminASubmit2, object.getVitaminA(),  13 + 83 + 23*a, 170, 20); a++;
			    displayObjectJTextFieldInformation(vitaminB1Submit2, object.getVitaminB1(),  16 + 83 + 23*a, 170, 20); a++;
			    displayObjectJTextFieldInformation(vitaminB2Submit2, object.getVitaminB2(),  16 + 83 + 23*a, 170, 20); a++;
				displayObjectJTextFieldInformation(vitaminB3Submit2, object.getVitaminB3(),  16 + 83 + 23*a, 170, 20); a++;
				displayObjectJTextFieldInformation(vitaminB5Submit2, object.getVitaminB5(),  17 + 83 + 23*a, 170, 20); a++;
				displayObjectJTextFieldInformation(vitaminB6Submit2, object.getVitaminB6(),  19 + 83 + 23*a, 170, 20); a++;
				displayObjectJTextFieldInformation(vitaminB9Submit2, object.getVitaminB9(),  20 + 83 + 23*a, 170, 20); a++;
				displayObjectJTextFieldInformation(vitaminB12Submit2, object.getVitaminB12(),  20 + 83 + 23*a, 170, 20); a++;
				displayObjectJTextFieldInformation(vitaminCSubmit2, object.getVitaminC(),  22 + 83 + 23*a, 170, 20); a++;
				displayObjectJTextFieldInformation(vitaminDSubmit2, object.getVitaminD(),  23 + 83 + 23*a, 170, 20); a++;
				displayObjectJTextFieldInformation(vitaminESubmit2, object.getVitaminE(),  23 + 83 + 23*a, 170, 20); a++;
				displayObjectJTextFieldInformation(vitaminHSubmit2, object.getVitaminH(),  23 + 83 + 23*a, 170, 20); a++;
				displayObjectJTextFieldInformation(vitaminKSubmit2, object.getVitaminK(),  25 + 83 + 23*a, 170, 20); a++;
				

				
				
				
				
		}
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == add ) {
			
			listOfAlimentsPanel.setVisible(false);
			informationViewPanel.setVisible(false);
			addPanel.setVisible(true);
			
			
			nutritionalTableAdd.setText("  Nome: "
					+ "\n  Calorias: " 
			+ "\n  Proteinas: " 
			+ "\n  Carboidratos: " 
			+ "\n  Lipidios: " 
			+ "\n  Calcio: "
			+ "\n  Ferro: " 
			+ "\n  Fibras: "
			+ "\n  Fosforo: " 
			+ "\n  Iodo: " 
			+ "\n  Magnesio: " 
			+ "\n  Potassio: "
			+ "\n  Sodio: " 
			+ "\n  Zinco: "
			+ "\n  Vitamina A: " 
			+ "\n  Vitamina B1: " 
			+ "\n  Vitamina B2: "
			+ "\n  Vitamina B3: "
			+ "\n  Vitamina B5: "
			+ "\n  Vitamina B6: " 
			+ "\n  Vitamina B9: " 
			+ "\n  Vitamina B12: "
			+ "\n  Vitamina C: " 
			+ "\n  Vitamina D: " 
			+ "\n  Vitamina E: "
			+ "\n  Vitamina H: " 
			+ "\n  Vitamina K:");	
			

			runSetJTextFieldValues(93);

			

			
		}
		
		
		if(e.getSource() == save ) {
			
		addPanel.setVisible(false);
		informationViewPanel.setVisible(false);
		listOfAlimentsPanel.setVisible(true);
		
		NutritionalTable addButtonObject = new NutritionalTable();
		
		addButtonObject.setName(nameSubmit.getText());
		addButtonObject.setCalorie(calorieSubmit.getText());
		addButtonObject.setProtein(proteinsSubmit.getText());
		addButtonObject.setCarbohydrate(carbohydrateSubmit.getText());
		addButtonObject.setLipids(lipidsSubmit.getText());
		addButtonObject.setCalcium(calciumSubmit.getText());
		addButtonObject.setIron(ironSubmit.getText());
		addButtonObject.setFiber(fiberSubmit.getText());
		addButtonObject.setPhosphor(phosphorSubmit.getText());
		addButtonObject.setIodine(iodineSubmit.getText());
		addButtonObject.setMagnesium(magnesiumSubmit.getText());
		addButtonObject.setPotassium(potassiumSubmit.getText());
		addButtonObject.setSodium(sodiumSubmit.getText());
		addButtonObject.setZinc(zincSubmit.getText());
		addButtonObject.setVitaminA(vitaminASubmit.getText());
		addButtonObject.setVitaminB1(vitaminB1Submit.getText());
		addButtonObject.setVitaminB2(vitaminB2Submit.getText());
		addButtonObject.setVitaminB3(vitaminB3Submit.getText());
		addButtonObject.setVitaminB5(vitaminB5Submit.getText());
		addButtonObject.setVitaminB6(vitaminB6Submit.getText());
		addButtonObject.setVitaminB9(vitaminB9Submit.getText());
		addButtonObject.setVitaminB12(vitaminB12Submit.getText());
		addButtonObject.setVitaminC(vitaminCSubmit.getText());
		addButtonObject.setVitaminD(vitaminDSubmit.getText());
		addButtonObject.setVitaminE(vitaminESubmit.getText());
		addButtonObject.setVitaminH(vitaminHSubmit.getText());
		addButtonObject.setVitaminK(vitaminKSubmit.getText());
		
		model.addElement(addButtonObject);
		
			
		}
		
		if(e.getSource() == delete ) {

		addPanel.setVisible(false);
		informationViewPanel.setVisible(false);
		listOfAlimentsPanel.setVisible(true);
		
		model.removeElement(alimentsJList.getSelectedValue());
		
		
		
					
			
		}
		
		if(e.getSource() == edit) {
			
			addPanel.setVisible(false);
			informationViewPanel.setVisible(true);
			listOfAlimentsPanel.setVisible(false);
		
			
			
			
			nameSubmit2.setEditable(false);
			calorieSubmit2.setEditable(true);
			proteinsSubmit2.setEditable(true);
			carbohydrateSubmit2.setEditable(true);
			lipidsSubmit2.setEditable(true);
			calciumSubmit2.setEditable(true);
			ironSubmit2.setEditable(true);
			fiberSubmit2.setEditable(true);
			phosphorSubmit2.setEditable(true);
			iodineSubmit2.setEditable(true);
			magnesiumSubmit2.setEditable(true);
			potassiumSubmit2.setEditable(true);
			sodiumSubmit2.setEditable(true);
			zincSubmit2.setEditable(true);
			vitaminASubmit2.setEditable(true);
			vitaminB1Submit2.setEditable(true);
			vitaminB2Submit2.setEditable(true);
			vitaminB3Submit2.setEditable(true);
			vitaminB5Submit2.setEditable(true);
			vitaminB6Submit2.setEditable(true);
			vitaminB9Submit2.setEditable(true);
			vitaminB12Submit2.setEditable(true);
			vitaminCSubmit2.setEditable(true);
			vitaminDSubmit2.setEditable(true);
			vitaminESubmit2.setEditable(true);
			vitaminHSubmit2.setEditable(true);
			vitaminKSubmit2.setEditable(true);
			
			
		}
		
		if(e.getSource() == save2) {
			
			addPanel.setVisible(false);
			informationViewPanel.setVisible(false);
			listOfAlimentsPanel.setVisible(true);
			
			
			NutritionalTable object = alimentsJList.getSelectedValue();	
			
			object.setCalorie(calorieSubmit2.getText());
			object.setProtein(proteinsSubmit2.getText());
			object.setCarbohydrate(carbohydrateSubmit2.getText());
			object.setLipids(lipidsSubmit2.getText());
			object.setCalcium(calciumSubmit2.getText());
			object.setIron(ironSubmit2.getText());
			object.setFiber(fiberSubmit2.getText());
			object.setPhosphor(phosphorSubmit2.getText());
			object.setIodine(iodineSubmit2.getText());
			object.setMagnesium(magnesiumSubmit2.getText());
			object.setPotassium(potassiumSubmit2.getText());
			object.setSodium(sodiumSubmit2.getText());
			object.setZinc(zincSubmit2.getText());
			object.setVitaminA(vitaminASubmit2.getText());
			object.setVitaminB1(vitaminB1Submit2.getText());
			object.setVitaminB2(vitaminB2Submit2.getText());
			object.setVitaminB3(vitaminB3Submit2.getText());
			object.setVitaminB5(vitaminB5Submit2.getText());
			object.setVitaminB6(vitaminB6Submit2.getText());
			object.setVitaminB9(vitaminB9Submit2.getText());
			object.setVitaminB12(vitaminB12Submit2.getText());
			object.setVitaminC(vitaminCSubmit2.getText());
			object.setVitaminD(vitaminDSubmit2.getText());
			object.setVitaminE(vitaminESubmit2.getText());
			object.setVitaminH(vitaminHSubmit2.getText());
			object.setVitaminK(vitaminKSubmit2.getText());
			
			
		}
		
		if(e.getSource() == regress) {
			
			addPanel.setVisible(false);
			informationViewPanel.setVisible(false);
			listOfAlimentsPanel.setVisible(false);
			alimentFrame.dispose();
			
			new MainView();			
			
		}
		
		if(e.getSource() == menu) {
			
			addPanel.setVisible(false);
			informationViewPanel.setVisible(false);
			listOfAlimentsPanel.setVisible(false);
			alimentFrame.dispose();
			
			new MainView();			
			
		}
		
		if(e.getSource() == regress2) {
			
			addPanel.setVisible(false);
			informationViewPanel.setVisible(false);
			listOfAlimentsPanel.setVisible(true);
			
		
			
		}
		
		if(e.getSource() == menu2) {
			
			addPanel.setVisible(false);
			informationViewPanel.setVisible(false);
			listOfAlimentsPanel.setVisible(false);
			alimentFrame.dispose();
			
			new MainView();			
			
		}
		
		if(e.getSource() == regress3) {
			
			addPanel.setVisible(false);
			informationViewPanel.setVisible(false);
			listOfAlimentsPanel.setVisible(true);
			
		
			
		}
		
		if(e.getSource() == menu3) {
			
			addPanel.setVisible(false);
			informationViewPanel.setVisible(false);
			listOfAlimentsPanel.setVisible(false);
			alimentFrame.dispose();
			
			new MainView();			
			
		}

		
	}
	
	public void setJTextFieldValues(JTextField variable, int y) {
		
		variable.setVisible(true);
		variable.setLayout(null);
		variable.setBounds(180, y, 100 , 20);
		
		
	}
	
	public void runSetJTextFieldValues(int y) {
		
		int a = 1;
		
		setJTextFieldValues(nameSubmit, y); 
		setJTextFieldValues(calorieSubmit, y + 24*a);					a++;
		setJTextFieldValues(proteinsSubmit, y + 24*a);                  a++;
		setJTextFieldValues(carbohydrateSubmit, y + 24*a);              a++;
		setJTextFieldValues(lipidsSubmit,y + 24*a);                     a++;
		setJTextFieldValues(calciumSubmit, y + 24*a);                   a++;
		setJTextFieldValues(ironSubmit, y + 24*a);			            a++;
		setJTextFieldValues(fiberSubmit, y + 24*a);                  	a++;
		setJTextFieldValues(phosphorSubmit, y + 24*a);                  a++;
		setJTextFieldValues(iodineSubmit, y + 24*a);                    a++;
		setJTextFieldValues(magnesiumSubmit, y + 24*a);                 a++;
		setJTextFieldValues(potassiumSubmit, y + 24*a);                 a++;
		setJTextFieldValues(sodiumSubmit, y + 24*a);              	    a++;
		setJTextFieldValues(zincSubmit, y + 24*a);               	    a++;
		setJTextFieldValues(vitaminASubmit, y + 24*a);	                a++;
		setJTextFieldValues(vitaminB1Submit, y + 24*a);                 a++;
		setJTextFieldValues(vitaminB2Submit, y + 24*a);                 a++;
		setJTextFieldValues(vitaminB3Submit, y + 24*a);                 a++;
		setJTextFieldValues(vitaminB5Submit, y + 24*a);                 a++;
		setJTextFieldValues(vitaminB6Submit, y + 24*a);                 a++;
		setJTextFieldValues(vitaminB9Submit, y + 24*a);                 a++;
		setJTextFieldValues(vitaminB12Submit, y + 24*a);                a++;
		setJTextFieldValues(vitaminCSubmit, y + 24*a);                  a++;
		setJTextFieldValues(vitaminDSubmit, y + 24*a);                  a++;
		setJTextFieldValues(vitaminESubmit, y + 24*a);                  a++;
		setJTextFieldValues(vitaminHSubmit, y + 24*a);                  a++;
		setJTextFieldValues(vitaminKSubmit, y + 24*a);                  
		
	}
	
	public void standardizeButtons(JButton button, String name, int x, int y, int width, int height) {
		
		button.setText(name);
		button.setBounds(x, y, width, height);
		button.setVisible(true);
		button.setFocusable(false);
		button.addActionListener(this);
		
	}
	
	public void displayObjectJTextFieldInformation(JTextField jTextField, String name, int y, int width, int height) {
		
		jTextField.setText(name);
		jTextField.setVisible(true);
		jTextField.setLayout(null);
		jTextField.setBounds(185, y, width , height);
		jTextField.setEditable(false);
		
	}
	
	public void setMiniButtons(JButton name, ImageIcon icon, int x) {
		name.setBounds(x, 0, 32, 32);
		name.setVisible(true);
		name.setFocusable(false);
		name.addActionListener(this);
		name.setIcon(icon);
		
	}

}
