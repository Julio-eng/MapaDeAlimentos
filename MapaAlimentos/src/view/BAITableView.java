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

public class BAITableView extends JFrame implements ActionListener {
	
	
	private JTextArea displayTableInformationsBMI = new JTextArea();
	private JLabel title = new JLabel("Tabela IAC");
	private ImageIcon regressIcon = new ImageIcon("regress.png");
	private JButton regress = new JButton();
	
	
	public BAITableView() {
		
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
		displayTableInformationsBMI.setBounds(20, 100, 400, 400);
		displayTableInformationsBMI.setVisible(true);
		displayTableInformationsBMI.setLayout(null);
		displayTableInformationsBMI.setEditable(false);
		displayTableInformationsBMI.setFont(new Font("Arial", Font.PLAIN, 20));
		displayTableInformationsBMI.setBackground(new Color(240, 192, 134));
		displayTableInformationsBMI.setText(" Sexo: Masculino"
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
