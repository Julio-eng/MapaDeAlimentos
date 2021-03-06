package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import data.AlimentsData;
import model.NutritionalTable;

/**
 * CRUD of the NutritionalTable type aliments
 * Display of the graphic interface related to the list of aliments
 * Frame, panels, labels, imageIcons, buttons, textArea, textField
 * @author Julio Cesar and Valderson
 * @version 3.0 (apr 2021)
 */

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
	//labels
	private JLabel listOfAlimentsLabel = new JLabel("Lista de Alimentos");
	private JLabel nutritionalTableLabel = new JLabel("Tabela Nutricional");
	private JLabel addANewAliment = new JLabel("Adicionar novo alimento");
	private JLabel nameOfTheAliment = new JLabel();
	private JLabel portionOfAliment = new JLabel("(Porcao: 100 g ou 100 ml)");
	private JLabel portionOfAliment2 = new JLabel("(Porcao: 100 g ou 100 ml)");
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

	/**
	 * Overrided Class Constructor
	 * Setting informations to the frame, panels, labels, imageIcons, buttons, textArea, textField
	 */
	
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
		addPanel.add(portionOfAliment2);
		
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
		informationViewPanel.add(portionOfAliment);

				
		//LIST PANEL----------------------------------------------------------------------------------------------------------------
		alimentListPanel.setBounds(30, 100, 300, 550);
		alimentListPanel.setVisible(true);	
		alimentListPanel.setLayout(null);
		alimentListPanel.add(scroll);
		
		//PORTION LABEL
		portionOfAliment.setBounds(146, 50, 200, 20);
		portionOfAliment.setFont(new Font("Arial", Font.PLAIN, 15));
		
		//PORTION LABEL2
		portionOfAliment2.setBounds(146, 50, 200, 20);
		portionOfAliment2.setFont(new Font("Arial", Font.PLAIN, 15));
		
		
		//LABEL--------------------------------------------------------------------------------------------------------------------
		listOfAlimentsLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		listOfAlimentsLabel.setBounds(30, 50, 300, 30);
		
		//TABELA NUTRICIONAL LABEL--------------------------------------------------------------------------------------------------
		nutritionalTableLabel.setFont(new Font("Arial", Font.PLAIN, 30));
		nutritionalTableLabel.setBounds(110, 20, 300, 30);
		
		//ADD A NEW ALIMENT LABEL--------------------------------------------------------------------------------------------------
		addANewAliment.setFont(new Font("Arial", Font.PLAIN, 30));
		addANewAliment.setBounds(80, 20, 400, 24);
		
		//NAME OF THE ALIMENT UNDER "NUTRITIONAL TABLE------------------------------------------------------------------------------
		nameOfTheAliment.setFont(new Font("Arial", Font.PLAIN, 20));
		nameOfTheAliment.setBounds(44, 83, 400, 30);
		
		
		//JTEXTAREA NUTRITIONAL INFO DISPLAY----------------------------------------------------------------------------------------
		nutritionalTableInformations.setBounds(32, 80, 149, 700);
		nutritionalTableInformations.setEditable(false);
		nutritionalTableInformations.setLineWrap(true);
		nutritionalTableInformations.setWrapStyleWord(true);
		nutritionalTableInformations.setFont(new Font("Arial", Font.PLAIN, 20));
		nutritionalTableInformations.setBackground(new Color(240, 192, 134));
		nutritionalTableInformations.setText("  Nome: "
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
		
		//JTEXTAREA OF ADD BUTTON---------------------------------------------------------------------------------------------------
		nutritionalTableAdd.setBounds(32, 90, 150, 680);
		nutritionalTableAdd.setEditable(false);
		nutritionalTableAdd.setLineWrap(true);
		nutritionalTableAdd.setWrapStyleWord(true);
		nutritionalTableAdd.setFont(new Font("Arial", Font.PLAIN, 20));
		nutritionalTableAdd.setBackground(new Color(240, 192, 134));
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
		
		//BUTTONS------------------------------------------------------------------------------------------------------------------
		standardizeButtons(add, "Adicionar", 30, 670, 100, 50);
		standardizeButtons(edit, "Editar", 370, 600, 100, 50);
		standardizeButtons(save, "Salvar", 370, 670, 100, 50);
		standardizeButtons(delete, "Deletar", 370, 670, 100, 50);
		standardizeButtons(save2, "Salvar", 370, 530, 100, 50);
		save.setVisible(false);
		edit.setVisible(false);
		save2.setVisible(false);
		delete.setVisible(false);
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
		model.addElement(new AlimentsData().getBananaPrataCrua());
		model.addElement(new AlimentsData().getLeiteIntegralDeVaca());
		model.addElement(new AlimentsData().getLeiteDeVacaDesnatado());
		model.addElement(new AlimentsData().getAveia());
		model.addElement(new AlimentsData().getGoiaba());
		model.addElement(new AlimentsData().getMaca());
		model.addElement(new AlimentsData().getLaranja());
		model.addElement(new AlimentsData().getMelancia());
		model.addElement(new AlimentsData().getPepino());
		model.addElement(new AlimentsData().getBeterraba());
		
		//JLIST----------------------------------------------------------------------------------------------------------------------
		alimentsJList.addListSelectionListener(this);
		alimentsJList.setBorder(BorderFactory.createLineBorder(null));
		alimentsJList.setFont(new Font("Arial", Font.PLAIN, 18));
	
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		
		NutritionalTable object = alimentsJList.getSelectedValue();	
		
			if(e.getValueIsAdjusting() && e.getSource() == alimentsJList ) {
		
				addTheFetchedInformationToTheJTextField(object);
				edit.setVisible(true);
				save2.setVisible(true);
				delete.setVisible(true);
				
		}
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == add ) {
			
			addButtonSetInformations();
			

		}
		
		
		if(e.getSource() == save ) {
			
			saveButtonSetInformation();		
			
		}
		
		if(e.getSource() == delete ) {

			deleteButtonSetInformations();
			
		}
		
		if(e.getSource() == edit) {
			
			editButtonSetInformations();
			
			
			
		}
		
		if(e.getSource() == save2) {
			
			save2ButtonSetInformation();
			
		}
		
		if(e.getSource() == regress) {
			
			setVisibility(false, false, false);
			
			alimentFrame.dispose();
			
			new MainView();			
			
		}
		
		if(e.getSource() == menu) {

			setVisibility(false, false, false);
			alimentFrame.dispose();
			
			new MainView();			
			
		}
		
		if(e.getSource() == regress2) {
			
			setVisibility(false, false, true);
			
		}
		
		if(e.getSource() == menu2) {
		
			setVisibility(false, false, false);	
			alimentFrame.dispose();
			new MainView();			
			
		}
		
		if(e.getSource() == regress3) {
			
			setVisibility(false, false, true);

		}
		
		if(e.getSource() == menu3) {
			
			setVisibility(false, false, false);
			alimentFrame.dispose();
			new MainView();			
			
		}

		
	}
	
	/**
	 * Set the addPanel JTextFields characteristics
	 * Set JTextFields similar to each other
	 * @param variable to contain the recived JTextField variable
	 * @param variable to set the locations of the JTextField on the y coordinated
	 */
	public void setJTextFieldValues(JTextField variable, int y) {
		
		variable.setVisible(true);
		variable.setLayout(null);
		variable.setBounds(180, y, 100 , 20);
		variable.setText(null);		
		
	}
	
	/**
	 * Set the JtextField coordinated vertical coordinated (y) with equal space from each other
	 * @param y variable to contain the initial JTextField y location
	 */
	
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
	
	/**
	 * Facilitation to the creation of buttons
	 * @param button contains the JButton object
	 * @param name set a String text to the button
	 * @param x horizontal button position
	 * @param y vertical button position
	 * @param width button width
	 * @param height button height
	 */
	
	public void standardizeButtons(JButton button, String name, int x, int y, int width, int height) {
		
		button.setText(name);
		button.setBounds(x, y, width, height);
		button.setFocusable(false);
		button.addActionListener(this);
		
	}
	
	/**
	 * Facilitate the creation of JTextFields
	 * @param jTextField contains the JTextField variable
	 * @param name set the text on the JTextField box
	 * @param y vertical JTextField position
	 * @param width JTextField width
	 * @param height JTextField height
	 */
	
	public void displayObjectJTextFieldInformation(JTextField jTextField, String name, int y, int width, int height) {
		
		jTextField.setText(name);
		jTextField.setVisible(true);
		jTextField.setLayout(null);
		jTextField.setBounds(185, y, width , height);
		jTextField.setEditable(false);
		
	}
	
	/**
	 * Standardize the minibuttons(return and menu) creation
	 * @param name  contains the JButton object
	 * @param icon contains the image that goes on the button
	 * @param x contains the horizontal button location
	 */
	
	public void setMiniButtons(JButton name, ImageIcon icon, int x) {
		
		name.setBounds(x, 0, 32, 32);
		name.setVisible(true);
		name.setFocusable(false);
		name.addActionListener(this);
		name.setIcon(icon);
		
	}
	
	/**
	 * Get the NutritionalTable object (aliment) and add to the JTextField
	 * Also setting JTextField bounds with the displayObjectJTextFieldInformation method
	 * @param object contains the entered object NutritionalTable type
	 */
	
	public void addTheFetchedInformationToTheJTextField(NutritionalTable object) {
		
		setVisibility(false, true, false);
	  
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
   		displayObjectJTextFieldInformation(iodineSubmit2, object.getIodine(),  8 + 83 + 23*a, 170, 20); a++;
 		displayObjectJTextFieldInformation(magnesiumSubmit2, object.getMagnesium(),  9 +  83 + 23*a, 170, 20); a++;
		displayObjectJTextFieldInformation(potassiumSubmit2, object.getPotassium(),  12 +  83 + 23*a, 170, 20); a++;
		displayObjectJTextFieldInformation(sodiumSubmit2, object.getSodium(),  13 + 83 + 23*a, 170, 20); a++;
		displayObjectJTextFieldInformation(zincSubmit2, object.getZinc(),  13 + 83 + 23*a, 170, 20); a++;
		displayObjectJTextFieldInformation(vitaminASubmit2, object.getVitaminA(),  13 + 83 + 23*a, 170, 20); a++;
	    displayObjectJTextFieldInformation(vitaminB1Submit2, object.getVitaminB1(),  14 + 83 + 23*a, 170, 20); a++;
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
	
	/**
	 * Setting visibility and calling the runSetJTextFieldValues to set the JTextFields
	 */
	public void addButtonSetInformations() {
		
		setVisibility(true, false, false);
		save.setVisible(true);
		runSetJTextFieldValues(93);
		
	}
	
	/**
	 * Saving information to the created NutritionalTable object (aliment) and adding it to the list
	 * JOptionPane to display a message to the user
	 */
	
	public void saveButtonSetInformation() {
		
		setVisibility(false, false, true);
		
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
		JOptionPane.showMessageDialog(null, nameSubmit.getText()+ " adicionado!", null, JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	/**
	 * set Visibility informations and remove a element from the list
	 */
	
	public void deleteButtonSetInformations() {
		
		setVisibility(false, false, true);
		model.removeElement(alimentsJList.getSelectedValue());	
		
	}
	
	/**
	 * Set the JTextfileds information editable
	 */
	
	public void editButtonSetInformations() {
		
		setVisibility(false, true, false);

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
	 
	 /**
	  * Saving information to the created NutritionalTable object (aliment) and adding it to the list
	  * JOptionPane to display a message to the user
	  */
	 
	public void save2ButtonSetInformation() {
	
	setVisibility(false, false, true);	
	
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
	
	JOptionPane.showMessageDialog(null, "Suas informacoes foram salvas!", null, JOptionPane.INFORMATION_MESSAGE);
		
		
	}
	
	/**
	 * Facilitate the set of visibility
	 * @param x variable to contain a boolean information	
	 * @param y variable to contain a boolean information
	 * @param z variable to contain a boolean information
	 */
	public void setVisibility(boolean x, boolean y, boolean z) {
		
		addPanel.setVisible(x);
		informationViewPanel.setVisible(y);
		listOfAlimentsPanel.setVisible(z);
	}
	
}
