package atas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBox implements ActionListener
{
	String[] plantStrings = { "Vegetable", "Fruit", "Flower"};
	JComboBox plantList = new JComboBox(plantStrings);
	JLabel label = new JLabel("Select Plant"); 
	public ComboBox() {
		plantList.setBounds(50,50,90,20);
		
		label.setAlignmentX(JLabel.LEFT_ALIGNMENT);  
		label.setSize(400,100);
		label.setBounds(50,100,100,30);
		label.setVisible(true);
		
		JFrame frame = new JFrame("Garden Planner");
		frame.add(plantList);
		frame.setLayout(null);
		frame.setSize(400,500);
		frame.setVisible(true);
		
		frame.add(label);
	  }
	@Override
	public void actionPerformed(ActionEvent e) {
	    
	}
}
