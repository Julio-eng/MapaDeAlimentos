package view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

public class AlimentFrame {
	
	
	JFrame alimentFrame = new JFrame();
	JList list = new JList();
	
	AlimentFrame(){
		
		
		alimentFrame.setVisible(true);
		alimentFrame.setSize(500, 800); 
		alimentFrame.setTitle("Mapa de Alimentos"); 	
		alimentFrame.setResizable(false);
		alimentFrame.setLayout(null);
		alimentFrame.getContentPane().setBackground(new Color(240, 192, 134)); //background color
		
		
	}
	
	

}
