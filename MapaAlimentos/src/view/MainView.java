package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainView extends JFrame implements ActionListener {
	
	private JButton alimentButton = new JButton();
	private JButton vitaminsButton = new JButton();
	private JButton mineralsButton = new JButton();
	private JButton diseasesButton = new JButton();
	private JButton calculatorButton = new JButton();
	
	private JLabel programName = new JLabel("Menu Principal");
	
	
	public MainView() {
		
		//working with fundamental GUI things
		this.setVisible(true);
		this.setSize(500, 800); 
		this.setTitle("Mapa de Alimentos"); 	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // default = hide on close = keep running on background
		this.setResizable(false);
		this.setLayout(null);
		this.getContentPane().setBackground(new Color(240, 192, 134)); //background color		
		
		this.add(alimentButton);
		alimentButton.setBounds(150, 200, 200, 50);
		alimentButton.addActionListener(this);
		alimentButton.setText("Alimentos");
		alimentButton.setFocusable(false);
		
		this.add(vitaminsButton);
		vitaminsButton.setBounds(150, 300, 200, 50);
		vitaminsButton.addActionListener(this);
		vitaminsButton.setText("Vitaminas");
		vitaminsButton.setFocusable(false);
		
		this.add(mineralsButton);
		mineralsButton.setBounds(150, 400, 200, 50);
		mineralsButton.addActionListener(this);
		mineralsButton.setText("Minerais");
		mineralsButton.setFocusable(false);
		
		this.add(diseasesButton);
		diseasesButton.setBounds(150, 500, 200, 50);
		diseasesButton.addActionListener(this);
		diseasesButton.setText("Doencas");
		diseasesButton.setFocusable(false);
		
		this.add(calculatorButton);
		calculatorButton.setBounds(150, 600, 200, 50);
		calculatorButton.addActionListener(this);
		calculatorButton.setText("Calculadora");
		calculatorButton.setFocusable(false);
		
		this.add(programName);
		programName.setFont(new Font("Arial", Font.BOLD, 30));
		programName.setBounds(140, 80, 300, 30);
		
	
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == alimentButton) {
			
			 new AlimentView();
			
		}
		
		if(e.getSource() == vitaminsButton) {
			
			 new VitaminsView();
			
		}
		
		if(e.getSource() == mineralsButton) {
			
			 new MineralsView();
			
		}
		
		if(e.getSource() == diseasesButton) {
			
			 new DiseasesView();
			
		}
		
		if(e.getSource() == calculatorButton) {
			
			 new CalculatorView();
			
		}
	}
	

}