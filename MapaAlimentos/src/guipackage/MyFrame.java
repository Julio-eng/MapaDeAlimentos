package guipackage;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import foodmappackage.Aliments;

public class MyFrame extends JFrame implements ActionListener {

	private Aliments aliment = new Aliments();
	private ImageIcon image = new ImageIcon("dedbe0c7a503fae73f061d6b0e21923f.jpg");
	private ImageIcon imagePratoComida = new ImageIcon("c46cd3e1dbe590f029b33694dd888985-curso-de-prato.png");
	private JPanel menuPanel = new JPanel();
	private JPanel Panel2 = new JPanel();
	private JPanel Panel3 = new JPanel();
	private JButton alimentButton = new JButton();
	private JButton vitaminsButton = new JButton();
	private JButton mineralButton = new JButton();
	private JButton diseasesButton = new JButton();
	private JLabel label = new JLabel();
	private JLayeredPane layeredPane = new JLayeredPane();
			
	public void graphicalUserInterfaceMethod() {
		
		//working with fundamental GUI things
		this.setVisible(true);
		this.setSize(800, 800); 
		this.setTitle("Mapa de Alimentos"); 	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // defaut = hide on close = keep running on background
		this.setResizable(false);
		this.setLayout(null);
		this.getContentPane().setBackground(new Color(240, 192, 134)); //background color
		this.setIconImage(image.getImage());	//icon image
		

		//pannel
		menuPanel.setBounds(0, 0, 800, 800);
		menuPanel.setBackground(new Color(240, 192, 120));
		this.menuPanel.setLayout(null);
		this.add(menuPanel);
		
		//alimentButton
		alimentButton.setBounds(275, 350, 250, 50);
		this.menuPanel.add(alimentButton);
		alimentButton.addActionListener(this);
		alimentButton.setText("Aliments");
		alimentButton.setFocusable(false);
		alimentButton.setFont(new Font("Comic Sans", Font.BOLD, 15));
		alimentButton.setForeground(Color.darkGray);

		
		//vitaminsButton
		vitaminsButton.setBounds(275, 450, 250, 50);
		this.menuPanel.add(vitaminsButton);
		vitaminsButton.addActionListener(this);
		vitaminsButton.setText("Vitamins");
		vitaminsButton.setFocusable(false);
		vitaminsButton.setFont(new Font("Comic Sans", Font.BOLD, 15));
		vitaminsButton.setForeground(Color.DARK_GRAY);
		
		//mineralButton
		mineralButton.setBounds(275, 550, 250, 50);
		this.menuPanel.add(mineralButton);
		mineralButton.addActionListener(this);
		mineralButton.setText("Minerals");
		mineralButton.setFocusable(false);
		mineralButton.setFont(new Font("Comic Sans", Font.BOLD, 15));
		mineralButton.setForeground(Color.DARK_GRAY);
		
		//diseasesButton
		diseasesButton.setBounds(275, 650, 250, 50);
		this.menuPanel.add(diseasesButton);
		diseasesButton.addActionListener(this);
		diseasesButton.setText("Diseases");
		diseasesButton.setFocusable(false);
		diseasesButton.setFont(new Font("Comic Sans", Font.BOLD, 15));
		diseasesButton.setForeground(Color.DARK_GRAY);
		
		//label
		label.setText("Mapa de Alimentos");
		this.menuPanel.add(label);
		label.setBounds(220, 40, 400, 300);
		label.setFont(new Font("Comic Sans", Font.BOLD, 40));
		label.setIcon(imagePratoComida);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		
		//layered panes
		//layeredPane.add(menuPanel, Integer.valueOf(0));
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==alimentButton) {
			
			
			
		}
		
	}
	
}
