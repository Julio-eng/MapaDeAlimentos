package view;

import java.awt.Font;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import control.MineralsControl;
import model.VitaminsAndMinerals;


public class MineralsView implements ListSelectionListener{
	
	private JFrame mineralsFrame = new JFrame();
	private VitaminsAndMinerals[] minerals = {new MineralsControl().getCalcium(),
											  new MineralsControl().getIron(),
											  new MineralsControl().getFibers(),
											  new MineralsControl().getPhosphorus(),
											  new MineralsControl().getIodine(),
											  new MineralsControl().getMagnesium(),
											  new MineralsControl().getPotassium(),
											  new MineralsControl().getProtein(),
											  new MineralsControl().getSodium(),
											  new MineralsControl().getZinc(),};
	private JList<VitaminsAndMinerals>  mineralsList = new JList<>(minerals);
	
	MineralsView(){
		
		mineralsList.setBounds(10, 10, 763, 400);
		mineralsList.setFont(new Font("Arial", Font.BOLD,20));
		mineralsList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		mineralsList.addListSelectionListener(this);
		
		mineralsFrame.add(mineralsList);
		mineralsFrame.setSize(800, 800);
		mineralsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mineralsFrame.setLayout(null);
		mineralsFrame.setVisible(true);
		
		
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		if(e.getSource() == mineralsList) {
			
			VitaminsAndMinerals pos = mineralsList.getSelectedValue();
			new InformationView(pos);
			
		}
		
	}

}
