package view;

import java.awt.Color;

import javax.swing.JFrame;

public class CalculatorFrame {
	
	
	
	JFrame calculatorFrame = new JFrame();
	
	CalculatorFrame(){
		
		
		calculatorFrame.setVisible(true);
		calculatorFrame.setSize(500, 800); 
		calculatorFrame.setTitle("Mapa de Alimentos"); 	
		calculatorFrame.setResizable(false);
		calculatorFrame.setLayout(null);
		calculatorFrame.getContentPane().setBackground(new Color(240, 192, 134)); //background color
		
		
	}
	
	


}
