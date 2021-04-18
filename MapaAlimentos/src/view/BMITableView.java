package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class BMITableView extends JFrame implements ActionListener{
	
	JTextArea displayTableInformationsBMI = new JTextArea();
	JLabel title = new JLabel("Tabela IMC");
	private ImageIcon regressIcon = new ImageIcon("regress.png");
	private JButton regress = new JButton();
	
	
	
	public BMITableView() {
		
		this.setVisible(true);
		this.setSize(400, 400); 
		this.setTitle("Mapa de Alimentos"); 	
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); // default = hide on close = keep running on background
		this.setResizable(false);
		this.setLayout(null);
		this.getContentPane().setBackground(new Color(240, 192, 134)); //background color	
		this.add(displayTableInformationsBMI);
		this.add(title);
		this.add(regress);
		
		//IMC TABLE
		displayTableInformationsBMI.setBounds(20, 150, 400, 400);
		displayTableInformationsBMI.setVisible(true);
		displayTableInformationsBMI.setLayout(null);
		displayTableInformationsBMI.setEditable(false);
		displayTableInformationsBMI.setFont(new Font("Arial", Font.BOLD, 20));
		displayTableInformationsBMI.setBackground(new Color(240, 192, 134));
		displayTableInformationsBMI.setText(" "
				+ "IMC < 18,5:           Magreza"
				+ "\n 18,4 < IMC < 25:   Saudavel"
				+ "\n 24,9 < IMC < 30:   Sobrepeso"
				+ "\n 29,9 < IMC < 35:   Obesidade Grau 1"
				+ "\n 34,9 < IMC < 40:   Obesidade Grau 2"
				+ "\n IMC > 39,9:           Obesidade Grau 3");
		
		//TITLE LABEL
		title.setBounds(110, 10, 400, 100);
		title.setFont(new Font("Arial", Font.BOLD, 30));
		
		//REGRESS
		regress.setIcon(regressIcon);
		regress.setBounds(0, 0, 32, 32);
		regress.setVisible(true);
		regress.setFocusable(false);
		regress.addActionListener(this);
		
		
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == regress) {
			this.dispose();
		}
		
	}

}