package view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JList;

public class VitaminsFrame {
	
	
	JFrame vitaminsFrame = new JFrame();
	
	VitaminsFrame(){
		
		
		vitaminsFrame.setVisible(true);
		vitaminsFrame.setSize(500, 800); 
		vitaminsFrame.setTitle("Mapa de Alimentos"); 	
		vitaminsFrame.setResizable(false);
		vitaminsFrame.setLayout(null);
		vitaminsFrame.getContentPane().setBackground(new Color(240, 192, 134)); //background color
		
		
	}
	
	

}