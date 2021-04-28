package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import model.*;

/**
 * Display of the graphic interface to the Body Mass Index and Body Adiposity Index calculation
 * @author Julio Cesar and Valderson
 * 
 */

public class CalculatorView implements ActionListener {
	
	
	private ImageIcon regressIcon = new ImageIcon("regress.png");
	private ImageIcon menuIcon = new ImageIcon("menu.png");	
	private JFrame calculatorFrame = new JFrame();
	private JPanel mainPanel = new JPanel();
	private JLabel calculator = new JLabel("Calculadora");
	private JLabel informations = new JLabel("Informacoes");
	private JLabel bodyMass = new JLabel("Massa Corporal(kg) : ");
	private JLabel height = new JLabel("Altura(m) : ");
	private JLabel waistCircunference = new JLabel("Circunferencia da Cintura(cm): ");
	private JTextField bodyMassJTxt = new JTextField();
	private JTextField heightJTxt = new JTextField();
	private JTextField waistCircunferenceJTxt = new JTextField();
	private JTextField displayBMICalculation = new JTextField();
	private JTextField displayBAICalculation = new JTextField();
	private JButton calculate = new JButton("Calcular");
	private JButton cleanJTxtFields = new JButton("Limpar");
	private JButton boddyMassIndexTable = new JButton("Tabela IMC");
	private JButton boddyAdiposityIndexTable = new JButton("Tabela IAC");
	private JButton menu = new JButton();
	private JButton regress = new JButton();
	private BAI objectBAI = new BAI();
	private BMI objectBMI = new BMI();
	private JTextArea displayInformations = new JTextArea();
	private JTextArea displayInformations2 = new JTextArea();
	
	/**
	 * Constructor to set information to the frame, panels, buttons and other frame gadgets
	 */
	
	public CalculatorView(){
		
		//FRAME---------------------------------------------------------------------------------------------------------------------------------
		calculatorFrame.setVisible(true);
		calculatorFrame.setSize(500, 800); 
		calculatorFrame.setTitle("Mapa de Alimentos"); 	
		calculatorFrame.setResizable(false);
		calculatorFrame.setLayout(null);
		calculatorFrame.getContentPane().setBackground(new Color(240, 192, 134)); //background color
		calculatorFrame.add(mainPanel);

		
		//MAIN PANEL-----------------------------------------------------------------------------------------------------------------------------
		mainPanel.setSize(500, 800);
		mainPanel.setBackground(new Color(240, 192, 134));
		mainPanel.setLayout(null);
		mainPanel.add(calculator);
		mainPanel.add(bodyMass);
		mainPanel.add(height);
		mainPanel.add(waistCircunference);
		mainPanel.add(bodyMassJTxt);
		mainPanel.add(heightJTxt);
		mainPanel.add(waistCircunferenceJTxt);
		mainPanel.add(informations);
		mainPanel.add(calculate);
		mainPanel.add(cleanJTxtFields);
		mainPanel.add(displayBMICalculation);
		mainPanel.add(displayBAICalculation);
		mainPanel.add(displayInformations);
		mainPanel.add(boddyAdiposityIndexTable);
		mainPanel.add(boddyMassIndexTable);
		mainPanel.add(regress);
		mainPanel.add(menu);	
		mainPanel.add(displayInformations2);
		
		//CALCULATOR-LABEL-----------------------------------------------------------------------------------------------------------------------
		titleLabels(calculator, 160, 70, 30);
		titleLabels(informations, 150, 400, 30);
		
		//LABELS---------------------------------------------------------------------------------------------------------------------------------
		setLabels(bodyMass, 150);
		setLabels(height, 180);
		setLabels(waistCircunference, 210);
		
		//JXTFields---------------------------------------------------------------------------------------------------------------------------
		setJTextFields(bodyMassJTxt, 156);
		setJTextFields(heightJTxt, 186);
		setJTextFields(waistCircunferenceJTxt, 216);
		displayBMICalculation.setVisible(true);
		displayBMICalculation.setLayout(null);
		displayBMICalculation.setBounds(350, 450, 100 , 20);
		displayBMICalculation.setEditable(false);
		
		displayBAICalculation.setVisible(true);
		displayBAICalculation.setLayout(null);
		displayBAICalculation.setBounds(350, 477, 100 , 20);
		displayBAICalculation.setEditable(false);
		
		
		//Buttons----------------------------------------------------------------------------------------------------------------------------
		setButtons(cleanJTxtFields, 130, 300, 100, 50);
		setButtons(calculate, 260, 300, 100, 50);
		setButtons(boddyMassIndexTable, 130, 650, 100, 50);
		setButtons(boddyAdiposityIndexTable, 260, 650, 100, 50);
		setMiniButtons(regress, regressIcon, 0);
		setMiniButtons(menu, menuIcon, 32);
		
		//Text-Area--------------------------------------------------------------------------------------------------------------------------
		displayInformations.setBounds(20, 450, 310, 47);
		displayInformations.setVisible(true);
		displayInformations.setLayout(null);
		displayInformations.setFont(new Font("Arial", Font.PLAIN, 20));
		displayInformations.setBackground(new Color(240, 192, 134));
		displayInformations.setText(" Indice de Massa Corporal:"
				+ "\n Indice de Adiposidade Corporal:");

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == calculate) {
						
			calculationBMIBMA();			
			
		}
		
		if(e.getSource() == cleanJTxtFields) {

			cleanJTextFields();
						
		}
		
		if(e.getSource() == boddyMassIndexTable) {
			
			new BMITableView();	
			
			
		}
		
		if(e.getSource() == boddyAdiposityIndexTable) {
			
			new BAITableView();			
			
		}
		
		if(e.getSource() == menu) {
			
			calculatorFrame.dispose();
			mainPanel.setVisible(false); //setting visibility
			new MainView();
			
		}
		
		if(e.getSource() == regress) {
			
			calculatorFrame.dispose(); 
			mainPanel.setVisible(false); //setting visibility
			new MainView();			
			
		}
		
	}

	/**
	 * Standardize the labels of the class
	 * @param label variable that contains the JLabel
	 * @param y variable that contains the label vertical location
	 */
	public void setLabels(JLabel label, int y) {
		
		label.setFont(new Font("Arial", Font.PLAIN, 20));
		label.setBounds(30, y, 300, 30);
		label.setVisible(true);
		label.setLayout(null);
		
		
	}
	
	/**
	 * Standardize the JTextFields characteristics
	 * @param variable contains the JTextField
	 * @param y variable that contains the textField vertical location
	 */
	
	public void setJTextFields(JTextField variable, int y) {
		
		variable.setVisible(true);
		variable.setLayout(null);
		variable.setBounds(325, y, 100 , 20);
		
	}
	
	/**
	 * Standardize the Label characteristics
	 * @param label contains the JLabel
	 * @param x variable that contains the textField horizontal location
	 * @param y variable that contains the textField vertical location
	 * @param tamanhoFonte variable that contatins the size of the font
	 */
	
	public void titleLabels(JLabel label, int x, int y, int tamanhoFonte) {
		
		label.setFont(new Font("Arial", Font.PLAIN, tamanhoFonte));
		label.setBounds(x, y, 350, 30);
		label.setVisible(true);
		label.setLayout(null);
		
	}
	
	/**
	 * Standardize the buttons
	 * @param button variable that contains the JButton
	 * @param x variable that contains the button horizontal location
	 * @param y variable that contains the button horizontal location
	 * @param width button width
	 * @param height button height
	 */
	
	public void setButtons(JButton button, int x, int y, int width, int height) {
		
		button.setBounds(x, y, width, height);
		button.setVisible(true);
		button.setFocusable(false);
		button.addActionListener(this);
		
		
	}
	
	/**
	 * Standardize the smaller buttons (button of regress or go back to a new MainFrame())
	 * @param button variable that contains the JButton
	 * @param x variable that contains the button horizontal location
	 * @param y variable that contains the button horizontal location
	 * @param width button width
	 * @param height button height
	 */
	
	public void setMiniButtons(JButton name, ImageIcon icon, int x) {
		name.setBounds(x, 0, 32, 32);
		name.setVisible(true);
		name.setFocusable(false);
		name.addActionListener(this);
		name.setIcon(icon);
		
	}
	
	/**
	 * Check if the information entered in the JTextField is a number
	 * @param text variable that contatins the entered number on String format
	 * @return true or false return (if is possible to convert = true // in case not == false)
	 */
	
	public boolean testJTextFieldReturn(String text) {
		      try {
		         Double.parseDouble(text);
		         return true;
		         
		      } catch (NumberFormatException e) {
		         return false;
		         
		      }
		   }
	
	/**
	 * The user must enter the required height
	 * The user must also enter boddy mass OR waist circunference
	 * BAI requires: height and waist circunference
	 * BMI requires: height and body mass
	 */
	
	public void calculationBMIBMA() {
		
		
		if(heightJTxt.getText().isEmpty()) {
			
			JOptionPane.showMessageDialog(null, "Altura e um campo obrigatorio!", null, JOptionPane.INFORMATION_MESSAGE);
			
			
		}
		
		else if(!heightJTxt.getText().isEmpty() && !bodyMassJTxt.getText().isEmpty() && !waistCircunferenceJTxt.getText().isEmpty()) {
			
			if(testJTextFieldReturn(heightJTxt.getText()) == false || testJTextFieldReturn(waistCircunferenceJTxt.getText()) == false || testJTextFieldReturn(bodyMassJTxt.getText()) == false) {
				
				JOptionPane.showMessageDialog(null, "Entre com apenas numeros!", null, JOptionPane.INFORMATION_MESSAGE);
				
			}
			
			objectBAI.setHeight(Double.parseDouble(heightJTxt.getText()));
			objectBAI.setHip(Double.parseDouble(waistCircunferenceJTxt.getText()));
			objectBMI.setBoddyMass(Double.parseDouble(bodyMassJTxt.getText()));	
			displayBMICalculation.setText(objectBMI.bmiCalculation() + " Kg/m²");
			displayBAICalculation.setText(objectBAI.baiCalculation() + "%");
			
		}
		else if(bodyMassJTxt.getText().isEmpty() && waistCircunferenceJTxt.getText().isEmpty()) {
			
			JOptionPane.showMessageDialog(null, "Massa Coporal e 	Circunferencia da cintura nao podem estar ambos vazios!", null, JOptionPane.INFORMATION_MESSAGE);
			
		}
		else if(!heightJTxt.getText().isEmpty() && !bodyMassJTxt.getText().isEmpty()) {
			
			
			if(testJTextFieldReturn(heightJTxt.getText()) == false || testJTextFieldReturn(bodyMassJTxt.getText()) == false) {
				
				JOptionPane.showMessageDialog(null, "Entre com apenas numeros!", null, JOptionPane.INFORMATION_MESSAGE);
				
			}
			
			
			objectBMI.setHeight(Double.parseDouble(heightJTxt.getText()));
			objectBMI.setBoddyMass(Double.parseDouble(bodyMassJTxt.getText()));		
			displayBMICalculation.setText(objectBMI.bmiCalculation() + " Kg/m²");
			

		} 
		else if(!heightJTxt.getText().isEmpty() && !waistCircunferenceJTxt.getText().isEmpty()) {
			
			if(testJTextFieldReturn(heightJTxt.getText()) == false || testJTextFieldReturn(waistCircunferenceJTxt.getText()) == false) {
				
				JOptionPane.showMessageDialog(null, "Entre com apenas numeros!", null, JOptionPane.INFORMATION_MESSAGE);
				
			}
			
			objectBAI.setHeight(Double.parseDouble(heightJTxt.getText()));
			objectBAI.setHip(Double.parseDouble(waistCircunferenceJTxt.getText()));
			displayBAICalculation.setText(objectBAI.baiCalculation() + "%");
			
		}
		
	}
	
	/**
	 * Clean the JTextFields setText
	 */
	   
	public void cleanJTextFields() {
		
		heightJTxt.setText("");
		bodyMassJTxt.setText("");
		waistCircunferenceJTxt.setText("");
		displayBMICalculation.setText("");
		displayBAICalculation.setText("");
	}

}
