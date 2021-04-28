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

/**
 * Display a frame with the Body Adiposity Index classification range
 * @author Julio Cesar and Valderson
 * @version 3.0 (apr 2021)
 */

public class BAITableView extends JFrame implements ActionListener {
	
	
	private JTextArea displayTableInformationsBAI = new JTextArea();
	private JLabel title = new JLabel("Tabela IAC");
	private ImageIcon regressIcon = new ImageIcon("regress.png");
	private JButton regress = new JButton();
	
	/**
	 * Class constructor
	 * Frame with textArea, label, imageIcon, button
	 * Setting characteristics and gadgets to a frame
	 */
	public BAITableView() {
		
		this.setVisible(true);
		this.setSize(400, 400); 
		this.setTitle("Mapa de Alimentos"); 	
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); // default = hide on close = keep running on background
		this.setResizable(false);
		this.setLayout(null);
		this.getContentPane().setBackground(new Color(240, 192, 134)); //background color	
		this.add(displayTableInformationsBAI);
		this.add(title);
		this.add(regress);
		
		//IMC TABLE
		displayTableInformationsBAI.setBounds(20, 100, 400, 400);
		displayTableInformationsBAI.setVisible(true);
		displayTableInformationsBAI.setLayout(null);
		displayTableInformationsBAI.setEditable(false);
		displayTableInformationsBAI.setFont(new Font("Arial", Font.PLAIN, 20));
		displayTableInformationsBAI.setBackground(new Color(240, 192, 134));
		displayTableInformationsBAI.setText(" Sexo: Masculino"
				+ "\n Adiposidade normal: 8 a 20"
				+ "\n Sobrepeso: 21 a 25"
				+ "\n Obesidade: acima de 25"
				+ "\n"
				+ "\n"
				+ "\n Sexo: Feminino"
				+ "\n Adiposidade normal: 21 a 32"
				+ "\n Sobrepeso: 33 a 38"
				+ "\n Obesidade: acima de 38");
		
		//TITLE LABEL
		title.setBounds(110, 10, 400, 100);
		title.setFont(new Font("Arial", Font.PLAIN, 30));
		
		//regress
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
