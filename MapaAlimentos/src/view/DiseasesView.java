package view;

import java.awt.Color;

import javax.swing.JFrame;

public class DiseasesView {
	
	
	
	JFrame diseasesFrame = new JFrame();
	
	DiseasesView(){
		
		
		diseasesFrame.setVisible(true);
		diseasesFrame.setSize(500, 800); 
		diseasesFrame.setTitle("Mapa de Alimentos"); 	
		diseasesFrame.setResizable(false);
		diseasesFrame.setLayout(null);
		diseasesFrame.getContentPane().setBackground(new Color(240, 192, 134)); //background color
		
		
	}
	

}
