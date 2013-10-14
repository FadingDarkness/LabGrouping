package edu.ilstu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ClassSelectionPanel extends JPanel
{
    final private String[] CLASS_NAMES = {"Class 1", "Class 2", "Class 3"};
    final private Color BACKGROUND= new BackgroundColor();
	
	private JPanel classPanel;
	private JPanel labelPanel;
	
	private Font font;
	
	private JComboBox classNames;
	private JLabel label;
	
	public ClassSelectionPanel()
	{
		setLayout(new FlowLayout());
		
		font = new Font("Arial", 0, 20);
		
		this.setBackground(BACKGROUND);
		
		classPanel = new JPanel();
		labelPanel = new JPanel();
		
		classPanel.setBackground(BACKGROUND);
		labelPanel.setBackground(BACKGROUND);
		
		label = new JLabel("Choose Your Class: ");
		label.setFont(font);
		
		classNames = new JComboBox(CLASS_NAMES);
		classNames.setFont(font);
		
		classPanel.add(classNames);
		labelPanel.add(label);
	
		add(labelPanel);
		add(classPanel);	
	}
	
	/**
	 * 
	 * @return the name of the card type
	 */
	public String getCardType()
	{
		String cardType;
		
		cardType = (String)classNames.getSelectedItem();
		
		return cardType;
	}
}
