package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import control.VitaminsControl;
import model.VitaminsAndMinerals;

public class VitaminsView implements ListSelectionListener, ActionListener{
	
	private JFrame frame = new JFrame();
	// List view
	private JPanel listPanel = new JPanel();
	private JList<VitaminsAndMinerals>  vitaminsList = new JList<>();
	private DefaultListModel<VitaminsAndMinerals> model = new DefaultListModel<>();
	private JButton add = new JButton("Adicionar");
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
	
	public VitaminsView(){
		// Buttons -------------------------------------------------------------------------------------------------------
		add.setBounds(325, 5, 100, 50);
		add.setFocusable(true);
		add.addActionListener(this);
		save.setBounds(200, 705, 100, 50);
		save.setFocusable(false);
		save.addActionListener(this);
		delete.setBounds(379, 705, 100, 50);
		delete.setFocusable(false);
		delete.addActionListener(this);
		edit.setBounds(5, 705, 100, 50);
		edit.setFocusable(false);
		edit.addActionListener(this);
		save2.setBounds(115, 705, 100, 50);
		save2.setFocusable(false);
		save2.addActionListener(this);
		
		// Minerals List -------------------------------------------------------------------------------------------------
		vitaminsList.setBounds(5, 5, 200, 400);
		vitaminsList.setFont(new Font("Arial", Font.BOLD,20));
		vitaminsList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		vitaminsList.addListSelectionListener(this);
		vitaminsList.setModel(model);
		
		// Adding elements to the model ----------------------------------------------------------------------------------
		model.addElement(new VitaminsControl().getVitaminA());
		model.addElement(new VitaminsControl().getVitaminB1());
		model.addElement(new VitaminsControl().getVitaminB2());
		model.addElement(new VitaminsControl().getVitaminB3());
		model.addElement(new VitaminsControl().getVitaminB5());
		model.addElement(new VitaminsControl().getVitaminB6());
		model.addElement(new VitaminsControl().getVitaminB9());
		model.addElement(new VitaminsControl().getVitaminB12());
		model.addElement(new VitaminsControl().getVitaminC());
		model.addElement(new VitaminsControl().getVitaminD());
		model.addElement(new VitaminsControl().getVitaminE());
		model.addElement(new VitaminsControl().getVitaminH());
		model.addElement(new VitaminsControl().getVitaminK());
		
		// Adding components to the Add panel ----------------------------------------------------------------------------
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
		
		// adding components to the list panel ---------------------------------------------------------------------------
		listPanel.add(vitaminsList);
		listPanel.add(add);
		// List panel
		listPanel.setSize(500, 800);
		listPanel.setBackground(new Color(255,222,173));
		listPanel.setLayout(null);
		
		// Adding panels to the frame ------------------------------------------------------------------------------------
		frame.add(listPanel);
		frame.add(infoPanel);
		frame.add(addPanel);
		// Frame
		frame.setSize(500, 800);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		if(e.getValueIsAdjusting() && e.getSource() == vitaminsList) {
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
			// method to set the titles part
			setTitle(title1, 40, "Significant Sources");
			setTitle(title2, 215, "Main functions");
			setTitle(title3, 390, "diseases caused by deficiency");
			setTitle(title4, 525, "Symptomes caused by deficiency");
			// method to set the information part
			setInformation(sources, 75, 140, object.getSignificantSources());
			setInformation(functions, 250, 140, object.getMainFunctions());
			setInformation(diseases, 425, 100, object.getDiseasesCaused());
			setInformation(symptoms, 560, 140, object.getDeficiencySymptoms());
		}
		
	}
	
	public void setTitle(JLabel title, int y, String text) {
		title.setBounds(0, y, 485, 35);
		title.setBackground(new Color(222,184,135)); 
		title.setOpaque(true);
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setVerticalAlignment(JLabel.CENTER);
		title.setText(text);
		title.setFont(new Font("Arial",Font.PLAIN, 20));
	}
	
	public void setInformation(JTextArea information, int y, int height, String text) {
		information.setBounds(10, y, 485, height);
		information.setBackground(new Color(255,222,173)); 
		information.setText(text);
		information.setFont(new Font("Arial",Font.PLAIN, 20));
		information.setEditable(false);
		information.setLineWrap(true);
		information.setWrapStyleWord(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == add) {
			listPanel.setVisible(false);
			infoPanel.setVisible(false);
			addPanel.setVisible(true);
			// Labels
			setLabels(name2, 0, "name");
			setLabels(sources2, 75, "Significant Sources");
			setLabels(functions2, 230, "Main functions");
			setLabels(diseases2, 385, "diseases caused by deficiency");
			setLabels(symptoms2, 540, "Symptomes caused by deficiency");
			// TextFields
			setTextArea(addName, 35, 40);
			setTextArea(addSources, 110, 120);
			setTextArea(addFunctions, 265	, 120);
			setTextArea(addDiseases, 420, 120);
			setTextArea(addSymptoms, 575, 120);
		}
		
		if(e.getSource() == save) {
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
		
		if(e.getSource() == delete) {
			listPanel.setVisible(true);
			infoPanel.setVisible(false);
			addPanel.setVisible(false);
			model.removeElement(vitaminsList.getSelectedValue());
			JOptionPane.showMessageDialog(null, "Vitamina deletada!", null, JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(e.getSource() == edit) {
			sources.setEditable(true);
			diseases.setEditable(true);
			functions.setEditable(true);
			symptoms.setEditable(true);
		}
		
		if(e.getSource() == save2) {
			addPanel.setVisible(false);
			listPanel.setVisible(true);
			infoPanel.setVisible(false);
			VitaminsAndMinerals object = vitaminsList.getSelectedValue();
			object.setSignificantSources(sources.getText());
			object.setDiseasesCaused(diseases.getText());
			object.setMainFunctions(functions.getText());
			object.setDeficiencySymptoms(symptoms.getText());
		}
	}
	
public void setLabels(JLabel name, int y, String label) {
		name.setBounds(0, y, 485, 35);
		name.setBackground(new Color(240, 192, 134)); 
		name.setOpaque(true);
		name.setHorizontalAlignment(JLabel.CENTER);
		name.setVerticalAlignment(JLabel.CENTER);
		name.setText(label);
		name.setFont(new Font("Arial",Font.PLAIN, 20));
	}
	
	public void setTextArea(JTextArea name, int y, int height) {
		name.setBounds(10, y, 465, height);
		name.setFont(new Font("Arial",Font.PLAIN, 20));
		name.setLineWrap(true);
		name.setWrapStyleWord(true);
	}

}