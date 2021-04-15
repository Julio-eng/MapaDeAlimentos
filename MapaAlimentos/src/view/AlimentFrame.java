package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Scrollbar;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import control.AlimentsControl;
import model.NutritionalTable;

public class AlimentFrame {
	
	
	private JFrame alimentFrame = new JFrame();
	private JPanel listOfAliments = new JPanel();
	private JLabel listOfAlimentsLabel = new JLabel("Lista de Alimentos");
	private JButton addButton = new JButton();
	private DefaultListModel<NutritionalTable> model = new DefaultListModel<NutritionalTable>();
	private JList<NutritionalTable> alimentsJList = new JList<NutritionalTable>(model);
	private JScrollPane scroll = new JScrollPane();

	
	AlimentFrame(){
		
		
		alimentFrame.setVisible(true);
		alimentFrame.setSize(500, 800); 
		alimentFrame.setTitle("Mapa de Alimentos"); 	
		alimentFrame.setResizable(false);
		alimentFrame.setLayout(null);
		alimentFrame.getContentPane().setBackground(new Color(240, 192, 134)); //background color
		alimentFrame.add(listOfAlimentsLabel);
		alimentFrame.add(listOfAliments);
		alimentFrame.add(addButton);
		
		//LABEL
		listOfAlimentsLabel.setFont(new Font("Arial", Font.BOLD, 30));
		listOfAlimentsLabel.setBounds(30, 50, 300, 30);
		
		
		//PANEL
		listOfAliments.setBounds(30, 100, 300, 550);
		listOfAliments.setVisible(true);	
		listOfAliments.setLayout(null);
		listOfAliments.add(scroll);
		
		//ADDBUTTON
		addButton.setText("Adicionar");
		addButton.setBounds(30, 670, 100, 50);
		addButton.setVisible(true);
		
		//alimentsJList
		//alimentsJList.setBounds(30, 100, 300, 550);
		
			
		//SCROLL
		scroll.setVisible(true);
		scroll.setBounds(0, 0, 300, 550);
		scroll.setViewportView(alimentsJList);
		

		//ADD ELEMENTS
		model.addElement(new AlimentsControl().getBananaPrataCrua());
		model.addElement(new AlimentsControl().getLeiteIntegralDeVaca());
		model.addElement(new AlimentsControl().getLeiteDeVacaDesnatado());
		
		
	}
	
	

}
