package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import model.VitaminsAndMinerals;

public class AddMineralsView implements ActionListener{
	
	private JFrame addView = new JFrame();
	private JTextArea addName = new JTextArea();
	private JTextArea addSources = new JTextArea();
	private JTextArea addFunctions = new JTextArea();
	private JTextArea addDiseases = new JTextArea();
	private JTextArea addSymptoms = new JTextArea();
	private JLabel name = new JLabel();
	private JLabel sources = new JLabel();
	private JLabel functions = new JLabel();
	private JLabel diseases = new JLabel();
	private JLabel symptoms = new JLabel();
	private JButton save = new JButton("Save"); 
	
	public AddMineralsView() {
		
		//save button
		save.setBounds(200, 705, 100, 50);
		save.setFocusable(false);
		save.addActionListener(this);
		
		// Labels
		setLabels(name, 0, "name");
		setLabels(sources, 75, "Significant Sources");
		setLabels(functions, 230, "Main functions");
		setLabels(diseases, 385, "diseases caused by deficiency");
		setLabels(symptoms, 540, "Symptomes caused by deficiency");
		
		// TextFields
		setTextArea(addName, 35, 40);
		setTextArea(addSources, 110, 120);
		setTextArea(addFunctions, 265	, 120);
		setTextArea(addDiseases, 420, 120);
		setTextArea(addSymptoms, 575, 120);
		
		// Frame
		addView.setVisible(true);
		addView.setSize(500, 800); 
		addView.setResizable(false);
		addView.setLayout(null);
		addView.getContentPane().setBackground(new Color(240, 192, 134));
		addView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// adding TextFields to the frame
		addView.add(addName);
		addView.add(addSources);
		addView.add(addFunctions);
		addView.add(addDiseases);
		addView.add(addSymptoms);
		// adding Panels to the frame
		addView.add(name);
		addView.add(sources);
		addView.add(functions);
		addView.add(diseases);
		addView.add(symptoms);
		// adding the save button to the frame
		addView.add(save);
		
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

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == save) {
			
			VitaminsAndMinerals mineral = new VitaminsAndMinerals();
			mineral.setName(addName.getText());
			mineral.setSignificantSources(addSources.getText());
			mineral.setMainFunctions(addFunctions.getText());
			mineral.setDiseasesCaused(addDiseases.getText());
			mineral.setDeficiencySymptoms(addSymptoms.getText());
			
			new MineralsView().getModel().addElement(mineral);
			
			JOptionPane.showMessageDialog(null, "Mineral adicionado!", null, JOptionPane.INFORMATION_MESSAGE);
			
			addView.dispose();
		}
		
	}

	public JTextArea getAddName() {
		return addName;
	}

	public void setAddName(JTextArea addName) {
		this.addName = addName;
	}

	public JTextArea getAddSources() {
		return addSources;
	}

	public void setAddSources(JTextArea addSources) {
		this.addSources = addSources;
	}

	public JTextArea getAddFunctions() {
		return addFunctions;
	}

	public void setAddFunctions(JTextArea addFunctions) {
		this.addFunctions = addFunctions;
	}

	public JTextArea getAddDiseases() {
		return addDiseases;
	}

	public void setAddDiseases(JTextArea addDiseases) {
		this.addDiseases = addDiseases;
	}

	public JTextArea getAddSymptoms() {
		return addSymptoms;
	}

	public void setAddSymptoms(JTextArea addSymptoms) {
		this.addSymptoms = addSymptoms;
	}

} 
