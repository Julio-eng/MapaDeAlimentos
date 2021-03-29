package guipackage;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

	
	ImageIcon image = new ImageIcon("dedbe0c7a503fae73f061d6b0e21923f.jpg");
	
	public void graphicalUserInterfaceMethod() {
		
		//working with fundamental GUI things
		this.setVisible(true);
		this.setSize(420, 420); 
		this.setTitle("Mapa de Alimentos"); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // defaut = hide on close = keep running on background
		this.setResizable(false);
		
		//working with the icon
		this.setIconImage(image.getImage());
		
		//coloring
		this.getContentPane().setBackground(new Color(240, 192, 134));
		
		
	}
	
	
	
}
