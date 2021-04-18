package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import control.MineralsControl;
import model.VitaminsAndMinerals;

public class MineralsView implements ListSelectionListener, ActionListener{
	
	private JFrame frame = new JFrame("Minerais");
	private ImageIcon regressIcon = new ImageIcon("regress.png");
	private ImageIcon menuIcon2 = new ImageIcon("menu.png");
	// List view
	private JPanel listPanel = new JPanel();
	private JLabel minerals = new JLabel();
	private JList<VitaminsAndMinerals>  mineralsList = new JList<>();
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
	
	public MineralsView(){
		// Calling method to set buttons and MiniButtns--------------------------------------------------------------------
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
		
		// Minerals List -------------------------------------------------------------------------------------------------
		mineralsList.setBounds(30, 100, 300, 550);
		mineralsList.setFont(new Font("Arial", Font.PLAIN,20));
		mineralsList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		mineralsList.addListSelectionListener(this);
		mineralsList.setModel(model);
		mineralsList.setBorder(BorderFactory.createLineBorder(null));
		
		// Adding elements to the model ----------------------------------------------------------------------------------
		model.addElement(new MineralsControl().getCalcium());
		model.addElement(new MineralsControl().getIron());
		model.addElement(new MineralsControl().getFibers());
		model.addElement(new MineralsControl().getPhosphorus());
		model.addElement(new MineralsControl().getIodine());
		model.addElement(new MineralsControl().getMagnesium());
		model.addElement(new MineralsControl().getPotassium());
		model.addElement(new MineralsControl().getProtein());
		model.addElement(new MineralsControl().getSodium());
		model.addElement(new MineralsControl().getZinc());
		
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
		
		// setting the minerals label
		minerals.setBounds(30, 50, 300, 30);
		minerals.setText("Minerais");
		minerals.setFont(new Font("Arial", Font.BOLD, 30));
		
		// adding components to the list panel ---------------------------------------------------------------------------
		listPanel.add(minerals);
		listPanel.add(mineralsList);
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
		if(e.getValueIsAdjusting() && e.getSource() == mineralsList) {
			listPanel.setVisible(false);
			infoPanel.setVisible(true);
			addPanel.setVisible(false);
			VitaminsAndMinerals object = mineralsList.getSelectedValue();
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
		
		if(e.getSource() == save) {
			if(addName.getText().isBlank()) {
				JOptionPane.showMessageDialog(null, "Digite pelo menos o nome para que um novo mineral seja "
						+ "adicinado!", null, JOptionPane.INFORMATION_MESSAGE);
			} else {
				addPanel.setVisible(false);
				listPanel.setVisible(true);
				infoPanel.setVisible(false);
				VitaminsAndMinerals mineral = new VitaminsAndMinerals();
				mineral.setName(addName.getText());
				mineral.setSignificantSources(addSources.getText());
				mineral.setMainFunctions(addFunctions.getText());
				mineral.setDiseasesCaused(addDiseases.getText());
				mineral.setDeficiencySymptoms(addSymptoms.getText());
				model.addElement(mineral);
				JOptionPane.showMessageDialog(null, "Mineral adicionado!", null, JOptionPane.INFORMATION_MESSAGE);
			}
		}
		
		if(e.getSource() == delete) {
			listPanel.setVisible(true);
			infoPanel.setVisible(false);
			addPanel.setVisible(false);
			model.removeElement(mineralsList.getSelectedValue());
			JOptionPane.showMessageDialog(null, "Mineral deletado!", null, JOptionPane.INFORMATION_MESSAGE);
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
			VitaminsAndMinerals object = mineralsList.getSelectedValue();
			object.setSignificantSources(sources.getText());
			object.setDiseasesCaused(diseases.getText());
			object.setMainFunctions(functions.getText());
			object.setDeficiencySymptoms(symptoms.getText());
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
		name.setBorder(BorderFactory.createLineBorder(null));
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
