package atas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel implements ActionListener 
{
	public JPanel createContentPanel()
	{
		JPanel GUI = new JPanel();
		GUI.setLayout(null);
		
		JPanel text = new JPanel();
		text.setLayout(null);
		text.setLocation(10, 10);
		text.setSize(250,30);
		GUI.add(text);
		
		JLabel textB = new JLabel("Select Plant");
		textB.setLocation(0,0);
		textB.setSize(100,30);
		textB.setHorizontalAlignment(0);
		text.add(textB);
		
		JPanel comBoxes = new JPanel();
		comBoxes.setLayout(null);
		comBoxes.setLocation(100, 10);
		comBoxes.setSize(225,50);
		GUI.add(comBoxes);		
		
		String[] plantStrings = { "Vegetable", "Fruit", "Flower"};
		JComboBox<String> plantList = new JComboBox<String>(plantStrings);
		plantList.setLocation(25,0);
		plantList.setSize(150,30);
		comBoxes.add(plantList);
			
		
		return GUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
			
	}

}
