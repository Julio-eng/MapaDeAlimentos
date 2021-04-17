package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
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
	
	
	private JFrame alimentFrame = new JFrame();
	private JPanel alimentListPanel = new JPanel();
	private JPanel listOfAlimentsPanel = new JPanel();
	private JPanel informationViewPanel = new JPanel();
	private JPanel addPanel = new JPanel();
	private JLabel listOfAlimentsLabel = new JLabel("Lista de Alimentos");
	private JLabel nutritionalTableLabel = new JLabel("Tabela Nutricional");
	private JLabel addANewAliment = new JLabel("Adicionar novo alimento");
	private JLabel nameOfTheAliment = new JLabel();
	private JButton add = new JButton();
	private JButton edit = new JButton();
	private JButton delete = new JButton();
	private JButton save = new JButton();
	private DefaultListModel<NutritionalTable> model = new DefaultListModel<NutritionalTable>();
	private JList<NutritionalTable> alimentsJList = new JList<NutritionalTable>(model);
	private JScrollPane scroll = new JScrollPane();
	private JTextArea nutritionalTableInformations = new JTextArea();
	private JTextArea nutritionalTableAdd = new JTextArea();
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


	
	AlimentView(){
		
		//FRAME--------------------------------------------------------------------------------------------------------------------
		alimentFrame.setVisible(true);
		alimentFrame.setSize(500, 800); 
		alimentFrame.setTitle("Mapa de Alimentos"); 	
		alimentFrame.setResizable(false);
		alimentFrame.setLayout(null);
		alimentFrame.getContentPane().setBackground(new Color(240, 192, 134)); //background color
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
		
		
		//MAIN PANEL---------------------------------------------------------------------------------------------------------------
		listOfAlimentsPanel.setVisible(true);
		listOfAlimentsPanel.setSize(500, 800); 
		listOfAlimentsPanel.setLayout(null);
		listOfAlimentsPanel.add(alimentListPanel);
		listOfAlimentsPanel.add(add);
		listOfAlimentsPanel.add(listOfAlimentsLabel);
		listOfAlimentsPanel.setBackground(new Color(240, 192, 134));
		
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
		nutritionalTableInformations.setBounds(32, 110, 300, 630);
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
		
		//ADDBUTTON------------------------------------------------------------------------------------------------------------------
		add.setText("Adicionar");
		add.setBounds(30, 670, 100, 50);
		add.setVisible(true);
		add.setFocusable(false);
		add.addActionListener(this);
		
		//EDIT-----------------------------------------------------------------------------------------------------------------------
		edit.setText("Edit");
		edit.setBounds(350, 600, 100, 50);
		edit.setVisible(true);
		edit.setFocusable(false);
		
		//SAVE BUTTON----------------------------------------------------------------------------------------------------------------
		save.setText("Salvar");
		save.setBounds(350, 670, 100, 50);
		save.setVisible(true);
		save.setFocusable(false);
		save.addActionListener(this);
		
		//DELETE BUTTON--------------------------------------------------------------------------------------------------------------
		delete.setText("Delete");
		delete.setBounds(350, 670, 100, 50);
		delete.setVisible(true);
		delete.setFocusable(false);
			
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
				
				nameOfTheAliment.setText("Nome: "+object.getName());
				
				nutritionalTableInformations.setText("  Calorias: " + object.getCalorie()
						+ "\n  Proteinas: " + object.getProtein()
						+ "\n  Carboidratos: " + object.getCarbohydrate()
						+ "\n  Lipidios: " + object.getLipids()
						+ "\n  Calcio: " + object.getCalcium()
						+ "\n  Ferro: " + object.getIron()
						+ "\n  Fibras: " + object.getFiber()
						+ "\n  Fosforo: " + object.getPhosphor()
						+ "\n  Iodo: " + object.getIodine()
						+ "\n  Magnesio: " + object.getMagnesium()
						+ "\n  Potassio: " + object.getPotassium()
						+ "\n  Sodio: " + object.getSodium()
						+ "\n  Zinco: " + object.getZinc()
						+ "\n  Vitamina A: " + object.getVitaminA()
						+ "\n  Vitamina B1: " + object.getVitaminB1()
						+ "\n  Vitamina B2: " + object.getVitaminB2()
						+ "\n  Vitamina B3: " + object.getVitaminB3()
						+ "\n  Vitamina B5: " + object.getVitaminB5()
						+ "\n  Vitamina B6: " + object.getVitaminB6()
						+ "\n  Vitamina B9: " + object.getVitaminB9()
						+ "\n  Vitamina B12: " + object.getVitaminB12()
						+ "\n  Vitamina C: " + object.getVitaminC()
						+ "\n  Vitamina D: " + object.getVitaminD()
						+ "\n  Vitamina E: " + object.getVitaminE()
						+ "\n  Vitamina H: " + object.getVitaminH()
						+ "\n  Vitamina K: " + object.getVitaminK());		
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
			
			
		//model.addElement(addButtonObject);
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

		
	}
	
	public void setJTextFieldValues(JTextField variable, int y) {
		
		variable.setVisible(true);
		variable.setLayout(null);
		variable.setBounds(180, y, 100 , 20);
		
		
	}
	
	public void runSetJTextFieldValues(int x) {
		
		int a = 1;
		
		setJTextFieldValues(nameSubmit, x); 
		setJTextFieldValues(calorieSubmit, x + 24*a);					a++;
		setJTextFieldValues(proteinsSubmit, x + 24*a);                  a++;
		setJTextFieldValues(carbohydrateSubmit, x + 24*a);              a++;
		setJTextFieldValues(lipidsSubmit,x + 24*a);                     a++;
		setJTextFieldValues(calciumSubmit, x + 24*a);                   a++;
		setJTextFieldValues(ironSubmit, x + 24*a);			            a++;
		setJTextFieldValues(fiberSubmit, x + 24*a);                  	a++;
		setJTextFieldValues(phosphorSubmit, x + 24*a);                  a++;
		setJTextFieldValues(iodineSubmit, x + 24*a);                    a++;
		setJTextFieldValues(magnesiumSubmit, x + 24*a);                 a++;
		setJTextFieldValues(potassiumSubmit, x + 24*a);                 a++;
		setJTextFieldValues(sodiumSubmit, x + 24*a);              	    a++;
		setJTextFieldValues(zincSubmit, x + 24*a);               	    a++;
		setJTextFieldValues(vitaminASubmit, x + 24*a);	                a++;
		setJTextFieldValues(vitaminB1Submit, x + 24*a);                 a++;
		setJTextFieldValues(vitaminB2Submit, x + 24*a);                 a++;
		setJTextFieldValues(vitaminB3Submit, x + 24*a);                 a++;
		setJTextFieldValues(vitaminB5Submit, x + 24*a);                 a++;
		setJTextFieldValues(vitaminB6Submit, x + 24*a);                 a++;
		setJTextFieldValues(vitaminB9Submit, x + 24*a);                 a++;
		setJTextFieldValues(vitaminB12Submit, x + 24*a);                a++;
		setJTextFieldValues(vitaminCSubmit, x + 24*a);                  a++;
		setJTextFieldValues(vitaminDSubmit, x + 24*a);                  a++;
		setJTextFieldValues(vitaminESubmit, x + 24*a);                  a++;
		setJTextFieldValues(vitaminHSubmit, x + 24*a);                  a++;
		setJTextFieldValues(vitaminKSubmit, x + 24*a);                  
		
	}

}
