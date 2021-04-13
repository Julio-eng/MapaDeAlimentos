package view;

import java.awt.Color;

import javax.swing.JFrame;

public class MineralsFrame {
	
	
	
	JFrame mineralsFrame = new JFrame();
	
	MineralsFrame(){
		
		
		mineralsFrame.setVisible(true);
		mineralsFrame.setSize(500, 800); 
		mineralsFrame.setTitle("Mapa de Alimentos"); 	
		mineralsFrame.setResizable(false);
		mineralsFrame.setLayout(null);
		mineralsFrame.getContentPane().setBackground(new Color(240, 192, 134)); //background color
		
		
	}
	

}
