package view;

import java.awt.*;

import javax.swing.*;

import model.VitaminsAndMinerals;

public class InformationView {
	
	private JFrame information = new JFrame();	
	private JLabel name = new JLabel();
	private JLabel title1 = new JLabel();
	private JLabel sources = new JLabel();
	private JLabel title2 = new JLabel();
	private JLabel functions = new JLabel();
	private JLabel title3 = new JLabel();
	private JLabel diseases = new JLabel();
	private JLabel title4 = new JLabel();
	private JLabel symptoms = new JLabel();
	
	
	public InformationView(VitaminsAndMinerals pos) {
		
		name.setBounds(0, 0, 785, 75);
		name.setBackground(new Color(255,222,173)); 
		name.setOpaque(true);
		name.setHorizontalAlignment(JLabel.CENTER);
		name.setVerticalAlignment(JLabel.CENTER);
		name.setText(pos.getName());
		name.setFont(new Font("Arial",Font.PLAIN, 20));
		
		title1.setBounds(0, 75, 785, 40);
		title1.setBackground(new Color(222,184,135)); 
		title1.setOpaque(true);
		title1.setHorizontalAlignment(JLabel.CENTER);
		title1.setVerticalAlignment(JLabel.CENTER);
		title1.setText("Significant Sources	");
		title1.setFont(new Font("Arial",Font.PLAIN, 20));
		
		sources.setBounds(0, 115, 785, 150);
		sources.setBackground(new Color(255,222,173)); 
		sources.setOpaque(true);
		sources.setHorizontalAlignment(JLabel.CENTER);
		sources.setVerticalAlignment(JLabel.CENTER);
		sources.setText(pos.getSignificantSources());
		sources.setFont(new Font("Arial",Font.PLAIN, 20));
		
		title2.setBounds(0, 265, 785, 40);
		title2.setBackground(new Color(222,184,135)); 
		title2.setOpaque(true);
		title2.setHorizontalAlignment(JLabel.CENTER);
		title2.setVerticalAlignment(JLabel.CENTER);
		title2.setText("Main functions");
		title2.setFont(new Font("Arial",Font.PLAIN, 20));
		
		functions.setBounds(0, 305, 785, 150);
		functions.setBackground(new Color(255,222,173)); 
		functions.setOpaque(true);
		functions.setHorizontalAlignment(JLabel.CENTER);
		functions.setVerticalAlignment(JLabel.CENTER);
		functions.setText(pos.getMainFunctions());
		functions.setFont(new Font("Arial",Font.PLAIN, 20));
		
		title3.setBounds(0, 455, 785, 40);
		title3.setBackground(new Color(222,184,135)); 
		title3.setOpaque(true);
		title3.setHorizontalAlignment(JLabel.CENTER);
		title3.setVerticalAlignment(JLabel.CENTER);
		title3.setText("diseases caused by deficiency");
		title3.setFont(new Font("Arial",Font.PLAIN, 20));
		
		diseases.setBounds(0, 495, 785, 100);
		diseases.setBackground(new Color(255,222,173)); 
		diseases.setOpaque(true);
		diseases.setHorizontalAlignment(JLabel.CENTER);
		diseases.setVerticalAlignment(JLabel.CENTER);
		diseases.setText(pos.getDiseasesCaused());
		diseases.setFont(new Font("Arial",Font.PLAIN, 20));
		
		title4.setBounds(0, 595, 785, 40);
		title4.setBackground(new Color(222,184,135)); 
		title4.setOpaque(true);
		title4.setHorizontalAlignment(JLabel.CENTER);
		title4.setVerticalAlignment(JLabel.CENTER);
		title4.setText("Symptomes caused by deficiency");
		title4.setFont(new Font("Arial",Font.PLAIN, 20));
		
		symptoms.setBounds(0, 635, 785, 150);
		symptoms.setBackground(new Color(255,222,173)); 
		symptoms.setOpaque(true);
		symptoms.setHorizontalAlignment(JLabel.CENTER);
		symptoms.setVerticalAlignment(JLabel.CENTER);
		symptoms.setText(pos.getDeficiencySymptoms());
		symptoms.setFont(new Font("Arial",Font.PLAIN, 20));
		
		information.setSize(800, 800);
		information.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		information.add(name);
		information.add(title1);
		information.add(sources);
		information.add(title2);
		information.add(functions);
		information.add(title3);
		information.add(diseases);
		information.add(title4);
		information.add(symptoms);
		information.setLayout(null);
		information.setVisible(true);
		
	}

	

}
