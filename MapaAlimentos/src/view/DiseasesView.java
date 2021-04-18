package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import control.DiseaseControl;
import model.Disease;

public class DiseasesView implements ListSelectionListener, ActionListener{
	
	private JFrame frame = new JFrame("Doencas");
	private ImageIcon regressIcon = new ImageIcon("regress.png");
	private ImageIcon menuIcon2 = new ImageIcon("menu.png");
	// List view
	private JPanel listPanel = new JPanel();
	private JLabel diseases = new JLabel();
	private JList<Disease>  diseasesList = new JList<>();
	private DefaultListModel<Disease> model = new DefaultListModel<>();
	private JButton add = new JButton("Adicionar");
	private JButton regress = new JButton();
	private JButton menu = new JButton();
	// info view ---------------------------------------------------------------------------------------------------------
	private JPanel infoPanel = new JPanel();
	private JTextArea diseaseInfo = new JTextArea();
	private JTextArea symptoms = new JTextArea();
	private JTextArea avoidAliments = new JTextArea();
	private JLabel name = new JLabel();
	private JLabel title1 = new JLabel();
	private JLabel title2 = new JLabel();
	private JLabel title3 = new JLabel();
	private JButton delete = new JButton("Deletar");
	private JButton edit = new JButton("Editar");
	private JButton save2 = new JButton("Salvar");
	private JButton regress2 = new JButton();
	private JButton menu2 = new JButton();
	// add view ----------------------------------------------------------------------------------------------------------
	private JPanel addPanel = new JPanel();
	private JTextArea addName = new JTextArea();
	private JTextArea addInfo = new JTextArea();
	private JTextArea addSymptoms = new JTextArea();
	private JTextArea addAvoidAliments = new JTextArea();
	private JLabel name2 = new JLabel();
	private JLabel diseaseInfo2 = new JLabel();
	private JLabel symptoms2 = new JLabel();
	private JLabel avoidAliments2 = new JLabel();
	private JButton save = new JButton("Salvar");
	private JButton regress3 = new JButton();
	private JButton menu3 = new JButton();
	
	public DiseasesView(){
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
		
		// Disease List --------------------------------------------------------------------------------------------------
		diseasesList.setBounds(30, 100, 300, 550);
		diseasesList.setFont(new Font("Arial", Font.PLAIN,20));
		diseasesList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		diseasesList.addListSelectionListener(this);
		diseasesList.setModel(model);
		diseasesList.setBorder(BorderFactory.createLineBorder(null));
		
		// Adding elements to the model ----------------------------------------------------------------------------------
		model.addElement(new DiseaseControl().getLactoseIntolerant());
		model.addElement(new DiseaseControl().getCeliac());
		
		// Adding components to the Add panel ----------------------------------------------------------------------------
		addPanel.add(regress3);
		addPanel.add(menu3);
		addPanel.add(addName);
		addPanel.add(addInfo);
		addPanel.add(addSymptoms);
		addPanel.add(addAvoidAliments);
		addPanel.add(name2);
		addPanel.add(diseaseInfo2);
		addPanel.add(symptoms2);
		addPanel.add(avoidAliments2);
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
		infoPanel.add(avoidAliments);
		infoPanel.add(diseaseInfo);
		infoPanel.add(symptoms);
		infoPanel.add(delete);
		infoPanel.add(edit);
		infoPanel.add(save2);
		// InfoPanel
		infoPanel.setSize(500, 800);
		infoPanel.setBackground(new Color(255,222,173));
		infoPanel.setLayout(null);
		
		// setting the diseases label
		diseases.setBounds(10, 42, 200, 30);
		diseases.setText("Doencas");
		diseases.setFont(new Font("Arial", Font.PLAIN, 30));
		
		// adding components to the list panel ---------------------------------------------------------------------------
		listPanel.add(diseases);
		listPanel.add(diseasesList);
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
		if(e.getValueIsAdjusting() && e.getSource() == diseasesList) {
			listPanel.setVisible(false);
			infoPanel.setVisible(true);
			addPanel.setVisible(false);
			Disease object = diseasesList.getSelectedValue();
			// Setting the name label
			name.setBounds(0, 0, 485, 40);
			name.setBackground(new Color(255,222,173)); 
			name.setOpaque(true);
			name.setHorizontalAlignment(JLabel.CENTER);
			name.setVerticalAlignment(JLabel.CENTER);
			name.setText(object.getName());
			name.setFont(new Font("Arial",Font.PLAIN, 20));
			// Calling the method to set the titles part
			setTitle(title1, 40, "Informacoes gerais");
			setTitle(title2, 215, "Sintomas");
			setTitle(title3, 390, "Alimentos que devem ser evitados");
			// Calling the method to set the information part
			setInformation(diseaseInfo, 75, 140, object.getDiseaseInformation());
			setInformation(symptoms, 250, 140, object.getSymptoms());
			setInformation(avoidAliments, 425, 100, object.getAvoidAliments());
			delete.setVisible(true);
			edit.setVisible(true);
			save2.setVisible(true);
			
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
		information.setBounds(10, y, 475, height);
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
			// Calling the method to set Labels
			setLabels(name2, 0, "Nome");
			setLabels(diseaseInfo2, 75, "Informacoes gerais");
			setLabels(symptoms2, 230, "Sintomas");
			setLabels(avoidAliments2, 385, "Alimentos que devem ser evitados");
			// Calling the method to set TextFields
			setTextArea(addName, 35, 40);
			setTextArea(addInfo, 110, 120);
			setTextArea(addSymptoms, 265	, 120);
			setTextArea(addAvoidAliments, 420, 120);
			save.setVisible(true);
		}
		
		if(e.getSource() == save) {
			if(addName.getText().isBlank()) {
				JOptionPane.showMessageDialog(null, "Digite pelo menos o nome para que uma nova doenca seja "
						+ "adicinada!", null, JOptionPane.INFORMATION_MESSAGE);
			} else {
				addPanel.setVisible(false);
				listPanel.setVisible(true);
				infoPanel.setVisible(false);
				Disease disease = new Disease();
				disease.setName(addName.getText());
				disease.setDiseaseInformation(addInfo.getText());
				disease.setSymptoms(addSymptoms.getText());
				disease.setAvoidAliments(addAvoidAliments.getText());
				model.addElement(disease);
				JOptionPane.showMessageDialog(null, "Doenca adicionada!", null, JOptionPane.INFORMATION_MESSAGE);
			}
		}
		
		if(e.getSource() == delete) {
			listPanel.setVisible(true);
			infoPanel.setVisible(false);
			addPanel.setVisible(false);
			model.removeElement(diseasesList.getSelectedValue());
			JOptionPane.showMessageDialog(null, "Doenca deletada!", null, JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(e.getSource() == edit) {
			diseaseInfo.setEditable(true);
			symptoms.setEditable(true);
			avoidAliments.setEditable(true);
			
		}
		
		if(e.getSource() == save2) {
			addPanel.setVisible(false);
			listPanel.setVisible(true);
			infoPanel.setVisible(false);
			Disease object = diseasesList.getSelectedValue();
			object.setDiseaseInformation(diseaseInfo.getText());
			object.setSymptoms(symptoms.getText());
			object.setAvoidAliments(avoidAliments.getText());
			JOptionPane.showMessageDialog(null, "Suas informacoes foram salvas!", null, JOptionPane.INFORMATION_MESSAGE);
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
		name.setText(null);
	}
	
	public void setButtons(JButton name, int x, int y) {
		name.setBounds(x, y, 100, 50);
		name.setFocusable(false);
		name.addActionListener(this);
		name.setVisible(false);
	}
	
	public void setMiniButtons(JButton name, ImageIcon icon, int x) {
		name.setBounds(x, 0, 32, 32);
		name.setFocusable(false);
		name.addActionListener(this);
		name.setIcon(icon);
		
	}
	
}
