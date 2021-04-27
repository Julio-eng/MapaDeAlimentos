package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Used to set the menu frame with the options(buttons) for what functionality do you want to use
 * @author Julio Cesar and Valderson 
 * @version 3.0 (Apr 2021)
 */

public class MainView extends JFrame implements ActionListener {
	
	private JButton alimentButton = new JButton();
	private JButton vitaminsButton = new JButton();
	private JButton mineralsButton = new JButton();
	private JButton diseasesButton = new JButton();
	private JButton calculatorButton = new JButton();
	private JLabel mainMenuTitle = new JLabel("Menu Principal");
	private JLabel programName = new JLabel("Mapa de Alimentos");
	
	/**
	 * Constructor method used to set most of the components and build the frame
	 */
	
	public MainView() {
		
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
		programName.setFont(new Font("Arial", Font.BOLD, 33));
		programName.setBounds(100, 50, 300, 33);
		
		this.add(mainMenuTitle);
		mainMenuTitle.setFont(new Font("Arial", Font.PLAIN, 27));
		mainMenuTitle.setBounds(160, 130, 300, 30);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == alimentButton) {
			 new AlimentView();
			 this.dispose();
		}
		
		if(e.getSource() == vitaminsButton) {
			 new VitaminsView();
			 this.dispose(); 
		}
		
		if(e.getSource() == mineralsButton) {
			new MineralsView();
			this.dispose(); 
		}
		
		if(e.getSource() == diseasesButton) {
			 new DiseasesView();
			 this.dispose(); 
		}
		
		if(e.getSource() == calculatorButton) {
			 new CalculatorView();
			 this.dispose(); 
		}
	}
}
