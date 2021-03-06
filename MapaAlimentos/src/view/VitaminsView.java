package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import data.VitaminsData;
import model.VitaminsAndMinerals;

/**
 * Used to set the minerals frame and all the other panels used to switch between the other frame's 
 * functionalities
 * @author Julio Cesar and Valderson 
 * @version 3.0 (apr 2021)
 */

public class VitaminsView implements ListSelectionListener, ActionListener{
	
	private JFrame frame = new JFrame("Vitaminas");
	private ImageIcon regressIcon = new ImageIcon("regress.png");
	private ImageIcon menuIcon2 = new ImageIcon("menu.png");
	// List view
	private JPanel listPanel = new JPanel();
	private JLabel vitamins = new JLabel();
	private JList<VitaminsAndMinerals>  vitaminsList = new JList<>();
	private DefaultListModel<VitaminsAndMinerals> model = new DefaultListModel<>();
	private JButton add = new JButton("Adicionar");
	private JButton regress = new JButton();
	private JButton menu = new JButton();
	// info view ---------------------------------------------------------------------------------------------------------
	private JPanel infoPanel = new JPanel();
	private JTextArea sources = new JTextArea();
	private JTextArea functions = new JTextArea();
	private JTextArea diseases = new JTextArea();
	private JTextArea symptoms = new JTextArea();
	private JLabel name = new JLabel();
	private JLabel title1 = new JLabel();
	private JLabel title2 = new JLabel();
	private JLabel title3 = new JLabel();
	private JLabel title4 = new JLabel();
	private JButton delete = new JButton("Deletar");
	private JButton edit = new JButton("Editar");
	private JButton save2 = new JButton("Salvar");
	private JButton regress2 = new JButton();
	private JButton menu2 = new JButton();
	// add view ----------------------------------------------------------------------------------------------------------
	private JPanel addPanel = new JPanel();
	private JTextArea addName = new JTextArea();
	private JTextArea addSources = new JTextArea();
	private JTextArea addFunctions = new JTextArea();
	private JTextArea addDiseases = new JTextArea();
	private JTextArea addSymptoms = new JTextArea();
	private JLabel name2 = new JLabel();
	private JLabel sources2 = new JLabel();
	private JLabel functions2 = new JLabel();
	private JLabel diseases2 = new JLabel();
	private JLabel symptoms2 = new JLabel();
	private JButton save = new JButton("Salvar");
	private JButton regress3 = new JButton();
	private JButton menu3 = new JButton();
	
	/**
	 * Constructor method used to set most of the components and build the frame along whit it's panels
	 */
	
	public VitaminsView(){
		// Buttons -------------------------------------------------------------------------------------------------------
		add.setBounds(30, 670, 100, 50);
		add.setFocusable(false);
		add.addActionListener(this);
		setButtons(save, 200, 705);
		setButtons(delete, 379, 705);
		setButtons(edit, 5, 705);
		setButtons(save2, 115, 705);
		setMiniButtons(regress, regressIcon, 0);
		setMiniButtons(menu, menuIcon2, 32);
		setMiniButtons(regress2, regressIcon, 0);
		setMiniButtons(menu2, menuIcon2, 32);
		setMiniButtons(regress3, regressIcon, 0);
		setMiniButtons(menu3, menuIcon2, 32);
		
		// Vitamins List -------------------------------------------------------------------------------------------------
		vitaminsList.setBounds(30, 100, 300, 550);
		vitaminsList.setFont(new Font("Arial", Font.PLAIN, 18));
		vitaminsList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		vitaminsList.addListSelectionListener(this);
		vitaminsList.setModel(model);
		vitaminsList.setBorder(BorderFactory.createLineBorder(null));
		
		// Adding elements to the model ----------------------------------------------------------------------------------
		model.addElement(new VitaminsData().getVitaminA());
		model.addElement(new VitaminsData().getVitaminB1());
		model.addElement(new VitaminsData().getVitaminB2());
		model.addElement(new VitaminsData().getVitaminB3());
		model.addElement(new VitaminsData().getVitaminB5());
		model.addElement(new VitaminsData().getVitaminB6());
		model.addElement(new VitaminsData().getVitaminB9());
		model.addElement(new VitaminsData().getVitaminB12());
		model.addElement(new VitaminsData().getVitaminC());
		model.addElement(new VitaminsData().getVitaminD());
		model.addElement(new VitaminsData().getVitaminE());
		model.addElement(new VitaminsData().getVitaminH());
		model.addElement(new VitaminsData().getVitaminK());
		
		// Adding components to the Add panel ----------------------------------------------------------------------------
		addPanel.add(regress3);
		addPanel.add(menu3);
		addPanel.add(addName);
		addPanel.add(addSources);
		addPanel.add(addFunctions);
		addPanel.add(addDiseases);
		addPanel.add(addSymptoms);
		addPanel.add(name2);
		addPanel.add(sources2);
		addPanel.add(functions2);
		addPanel.add(diseases2);
		addPanel.add(symptoms2);
		addPanel.add(save);
		// Add panel
		addPanel.setSize(500, 800); 
		addPanel.setLayout(null);
		addPanel.setBackground(new Color(240, 192, 134));
		
		// Adding components to the information panel --------------------------------------------------------------------
		infoPanel.add(regress2);
		infoPanel.add(menu2);
		infoPanel.add(name);
		infoPanel.add(title1);
		infoPanel.add(title2);
		infoPanel.add(title3);
		infoPanel.add(title4);
		infoPanel.add(sources);
		infoPanel.add(functions);
		infoPanel.add(diseases);
		infoPanel.add(symptoms);
		infoPanel.add(delete);
		infoPanel.add(edit);
		infoPanel.add(save2);
		// InfoPanel
		infoPanel.setSize(500, 800);
		infoPanel.setBackground(new Color(255,222,173));
		infoPanel.setLayout(null);
		
		// setting the vitamins label
		vitamins.setBounds(30, 50, 300, 30);
		vitamins.setText("Vitaminas");
		vitamins.setFont(new Font("Arial", Font.PLAIN, 30));
		
		// adding components to the list panel ---------------------------------------------------------------------------
		listPanel.add(vitamins);
		listPanel.add(vitaminsList);
		listPanel.add(add);
		listPanel.add(regress);
		listPanel.add(menu);
		// List panel
		listPanel.setSize(500, 800);
		listPanel.setBackground(new Color(240, 192, 134));
		listPanel.setLayout(null);
		
		// Adding panels to the frame ------------------------------------------------------------------------------------
		frame.add(listPanel);
		frame.add(infoPanel);
		frame.add(addPanel);
		// Frame
		frame.setSize(500, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setVisible(true);
		
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		if(e.getValueIsAdjusting() && e.getSource() == vitaminsList) {
			infoPanel();
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == add) {
			addButton();
		}
		if(e.getSource() == save) {
			saveButton();
		}
		if(e.getSource() == delete) {
			deleteButton();
		}
		if(e.getSource() == edit) {
			editButton();
		}
		if(e.getSource() == save2) {
			save2Button();
		}
		
		if(e.getSource() == regress) {
			addPanel.setVisible(false);
			listPanel.setVisible(false);
			infoPanel.setVisible(false);
			new MainView();
			frame.dispose();
		}
		
		if(e.getSource() == regress2 || e.getSource() == regress3) {
			addPanel.setVisible(false);
			listPanel.setVisible(true);
			infoPanel.setVisible(false);
		}
		
		if(e.getSource() == menu || e.getSource() == menu2 || e.getSource() == menu3) {
			addPanel.setVisible(false);
			listPanel.setVisible(false);
			infoPanel.setVisible(false);
			frame.dispose();
			new MainView();
		}
	}
	
	/**
	 * Used to create and display the information panel of a object, more specifically a vitamins object
	 */
	public void infoPanel() {
		listPanel.setVisible(false);
		infoPanel.setVisible(true);
		addPanel.setVisible(false);
		VitaminsAndMinerals object = vitaminsList.getSelectedValue();
		// Setting the name label
		name.setBounds(0, 0, 485, 40);
		name.setBackground(new Color(255,222,173)); 
		name.setOpaque(true);
		name.setHorizontalAlignment(JLabel.CENTER);
		name.setVerticalAlignment(JLabel.CENTER);
		name.setText(object.getName());
		name.setFont(new Font("Arial",Font.PLAIN, 20));
		// Calling the method to set the titles part
		setTitle(title1, 40, "Fontes significativas");
		setTitle(title2, 215, "Principais funcoes");
		setTitle(title3, 390, "Doencas causadas pela deficiencia");
		setTitle(title4, 525, "Sintomas causados pela deficiencia");
		// Calling the method to set the information part
		setInformation(sources, 75, 140, object.getSignificantSources());
		setInformation(functions, 250, 140, object.getMainFunctions());
		setInformation(diseases, 425, 100, object.getDiseasesCaused());
		setInformation(symptoms, 560, 140, object.getDeficiencySymptoms());
		delete.setVisible(true);
		edit.setVisible(true);
		save2.setVisible(true);
	}
	
	/**
	 * Used to create a panel containing areas where you can write something, more specifically write
	 * informations about a vitamin
	 * 
	 */
	
	public void addButton() {
		listPanel.setVisible(false);
		infoPanel.setVisible(false);
		addPanel.setVisible(true);
		// Calling the method to set Labels
		setLabels(name2, 0, "Nome");
		setLabels(sources2, 75, "Fontes significativas");
		setLabels(functions2, 230, "Principais funcoes");
		setLabels(diseases2, 385, "Doencas causadas pela deficiencia");
		setLabels(symptoms2, 540, "Sintomas causados pela deficiencia");
		// Calling the method to set TextFields
		setTextArea(addName, 35, 40);
		setTextArea(addSources, 110, 120);
		setTextArea(addFunctions, 265	, 120);
		setTextArea(addDiseases, 420, 120);
		setTextArea(addSymptoms, 575, 120);
		save.setVisible(true);
	}
	
	/**
	 * Save the information of the new object instanced on the addButton method
	 * 
	 */
	public void saveButton() {
		if(addName.getText().isBlank()) {
			JOptionPane.showMessageDialog(null, "Digite pelo menos o nome para que uma nova vitamina seja "
					+ "adicinada!", null, JOptionPane.INFORMATION_MESSAGE);
		} else {
			addPanel.setVisible(false);
			listPanel.setVisible(true);
			infoPanel.setVisible(false);
			VitaminsAndMinerals vitamins = new VitaminsAndMinerals();
			vitamins.setName(addName.getText());
			vitamins.setSignificantSources(addSources.getText());
			vitamins.setMainFunctions(addFunctions.getText());
			vitamins.setDiseasesCaused(addDiseases.getText());
			vitamins.setDeficiencySymptoms(addSymptoms.getText());
			model.addElement(vitamins);
			JOptionPane.showMessageDialog(null, "Vitamina adicionada!", null, JOptionPane.INFORMATION_MESSAGE);
		}
	}

	/**
	 * Delete a object of the list
	 * 
	 */
	public void deleteButton() {
		listPanel.setVisible(true);
		infoPanel.setVisible(false);
		addPanel.setVisible(false);
		model.removeElement(vitaminsList.getSelectedValue());
		JOptionPane.showMessageDialog(null, "Vitamina deletada!", null, JOptionPane.INFORMATION_MESSAGE);
	}

	/**
	 * Turns the JTextAreas's editable so you can edit the information of an object 
	 * 
	 */
	public void editButton() {
		sources.setEditable(true);
		diseases.setEditable(true);
		functions.setEditable(true);
		symptoms.setEditable(true);
	}
	
	/**
	 * Save the changes you made when you clicked the edit button
	 * 
	 */
	public void save2Button() {
		addPanel.setVisible(false);
		listPanel.setVisible(true);
		infoPanel.setVisible(false);
		VitaminsAndMinerals object = vitaminsList.getSelectedValue();
		object.setSignificantSources(sources.getText());
		object.setDiseasesCaused(diseases.getText());
		object.setMainFunctions(functions.getText());
		object.setDeficiencySymptoms(symptoms.getText());
		JOptionPane.showMessageDialog(null, "Suas informacoes foram salvas!", null, JOptionPane.INFORMATION_MESSAGE);
	}
	
	/**
	 * standardizes the creation of most labels used to display information visible in the panels
	 * @param title name of the label that will be set 
	 * @param y its position on the y axis
	 * @param text the text that the label will display
	 */
	public void setTitle(JLabel title, int y, String text) {
		title.setBounds(0, y, 485, 35);
		title.setBackground(new Color(222,184,135)); 
		title.setOpaque(true);
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setVerticalAlignment(JLabel.CENTER);
		title.setText(text);
		title.setFont(new Font("Arial",Font.PLAIN, 20));
	}
	
	/**
	 * standardizes the creation of most JTextAreas used to display the information visible in the panels
	 * @param information name of the text area that will be set
	 * @param y its position on the y axis
	 * @param height the height of the text area
	 * @param text the text that the text area will display
	 */
	public void setInformation(JTextArea information, int y, int height, String text) {
		information.setBounds(10, y, 475, height);
		information.setBackground(new Color(255,222,173)); 
		information.setText(text);
		information.setFont(new Font("Arial",Font.PLAIN, 20));
		information.setEditable(false);
		information.setLineWrap(true);
		information.setWrapStyleWord(true);
	}
	
	/**
	 * standardizes the creation of most labels used to create new objects visible in the panels
	 * @param name name of the label that will be set
	 * @param y its position on the y axis
	 * @param text the text that the label will display
	 */
	public void setLabels(JLabel name, int y, String text) {
		name.setBounds(0, y, 485, 35);
		name.setBackground(new Color(240, 192, 134)); 
		name.setOpaque(true);
		name.setHorizontalAlignment(JLabel.CENTER);
		name.setVerticalAlignment(JLabel.CENTER);
		name.setText(text);
		name.setFont(new Font("Arial",Font.PLAIN, 20));
	}
	
	/**
	 * standardizes the creation of most JTextAreas used to create a new object visible in the panels
	 * @param name name of the text area that will be set
	 * @param y its position on the y axis
	 * @param height the height of the text area
	 */
	public void setTextArea(JTextArea name, int y, int height) {
		name.setBounds(10, y, 465, height);
		name.setFont(new Font("Arial",Font.PLAIN, 20));
		name.setLineWrap(true);
		name.setWrapStyleWord(true);
	}
	
	/**
	 * standardizes the creation of most buttons used in the panels
	 * @param name name of the button that will be set
	 * @param x its position on the x axis
	 * @param y its position on the y axis
	 */
	public void setButtons(JButton name, int x, int y) {
		name.setBounds(x, y, 100, 50);
		name.setFocusable(false);
		name.addActionListener(this);
		name.setVisible(false);
	}
	
	/**
	 * standardizes the mini buttons(return and menu) creation 
	 * @param name name of the mini button that will be set
	 * @param icon the image the buttons will receive
	 * @param x its position on the x axis
	 */
	public void setMiniButtons(JButton name, ImageIcon icon, int x) {
		name.setBounds(x, 0, 32, 32);
		name.setFocusable(false);
		name.addActionListener(this);
		name.setIcon(icon);
		
	}

}