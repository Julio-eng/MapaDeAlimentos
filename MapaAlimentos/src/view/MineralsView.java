package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import control.MineralsControl;
import model.VitaminsAndMinerals;


public class MineralsView implements ListSelectionListener, ActionListener{
	
	private JFrame mineralsFrame = new JFrame();
	private JList<VitaminsAndMinerals>  mineralsList = new JList<>();
	private DefaultListModel<VitaminsAndMinerals> model = new DefaultListModel<>();
	private JButton add = new JButton("Add");
	
	MineralsView(){
		
		add.setBounds(300, 5, 100, 50);
		add.setFocusable(false);
		add.addActionListener(this);
		
		mineralsList.setBounds(5, 5, 250, 750);
		mineralsList.setFont(new Font("Arial", Font.BOLD,20));
		mineralsList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		mineralsList.setBackground(new Color(240, 192, 134));
		mineralsList.addListSelectionListener(this);
		mineralsList.setModel(model);
		
		model.addElement(new MineralsControl().getCalcium());
		model.addElement(new MineralsControl().getIron());
		model.addElement(new MineralsControl().getFibers());
		model.addElement(new MineralsControl().getPhosphorus());
		model.addElement(new MineralsControl().getIodine());
		model.addElement(new MineralsControl().getMagnesium());
		model.addElement(new MineralsControl().getPotassium());
		model.addElement(new MineralsControl().getProtein());
		model.addElement(new MineralsControl().getSodium());
		model.addElement(new MineralsControl().getZinc());	 
		
		mineralsFrame.add(mineralsList);
		mineralsFrame.add(add);
		mineralsFrame.setSize(500, 800);
		mineralsFrame.getContentPane().setBackground(new Color(240, 192, 134));
		mineralsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mineralsFrame.setLayout(null);
		mineralsFrame.setVisible(true);
		
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		
		VitaminsAndMinerals pos = mineralsList.getSelectedValue();
		
		if(e.getValueIsAdjusting() && e.getSource() == mineralsList) {
			new MineralsInformationView(pos);
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == add) {	
			new AddMineralsView();
		}
	}

	public DefaultListModel<VitaminsAndMinerals> getModel() {
		return model;
	}

	public void setModel(DefaultListModel<VitaminsAndMinerals> model) {
		this.model = model;
	}
	
}
