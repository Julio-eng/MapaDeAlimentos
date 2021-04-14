package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import model.VitaminsAndMinerals;

public class MineralsInformationView implements ActionListener {
	
	private JFrame information = new JFrame();	
	private JTextArea sources = new JTextArea();
	private JTextArea functions = new JTextArea();
	private JTextArea diseases = new JTextArea();
	private JTextArea symptoms = new JTextArea();
	private JLabel name = new JLabel();
	private JLabel title1 = new JLabel();
	private JLabel title2 = new JLabel();
	private JLabel title3 = new JLabel();
	private JLabel title4 = new JLabel();
	private JButton delete = new JButton("Delete");
	private JButton edit = new JButton("edit");
	
	
	public MineralsInformationView(VitaminsAndMinerals pos) {
		
		//delete and edit button
		delete.setBounds(295, 705, 100, 50);
		delete.addActionListener(this);
		edit.setBounds(95, 705, 100, 50);
		edit.addActionListener(this);
		
		// titles and name label
		name.setBounds(0, 0, 485, 40);
		name.setBackground(new Color(255,222,173)); 
		name.setOpaque(true);
		name.setHorizontalAlignment(JLabel.CENTER);
		name.setVerticalAlignment(JLabel.CENTER);
		name.setText(pos.getName());
		name.setFont(new Font("Arial",Font.PLAIN, 20));
		
		setTitle(title1, 40, "Significant Sources");
		setTitle(title2, 215, "Main functions");
		setTitle(title3, 390, "diseases caused by deficiency");
		setTitle(title4, 525, "Symptomes caused by deficiency");
		
		// information TextArea
		setInformation(sources, 75, 140, pos.getSignificantSources());
		setInformation(functions, 250, 140, pos.getMainFunctions());
		setInformation(diseases, 425, 100, pos.getDiseasesCaused());
		setInformation(symptoms, 560, 140, pos.getDeficiencySymptoms());
		
		//adding delete and edit button
		information.add(delete);
		information.add(edit);
		
		// adding labels
		information.add(name);
		information.add(title1);
		information.add(title2);
		information.add(title3);
		information.add(title4);
		//adding TextAreas
		information.add(sources);
		information.add(functions);
		information.add(diseases);
		information.add(symptoms);
		// frame
		information.setSize(500, 800);
		information.getContentPane().setBackground(new Color(255,222,173));
		information.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		information.setLayout(null);
		information.setVisible(true);
		
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
		if(e.getSource() == edit) {
			
		}
		
		if(e.getSource() == delete) {
			
		}
		
	}

}

