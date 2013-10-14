package edu.ilstu;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class GenderSortPanel extends JPanel
{	
	final private Color BACKGROUND = new BackgroundColor();
	final private Border BORDER_COLOR = BorderFactory.createLineBorder(BACKGROUND);
	final private Font FONT = new Font("Arial", Font.BOLD, 12);
	
	JCheckBox checkBox;
	
	public GenderSortPanel()
	{
		setBackground(BACKGROUND);
		
		checkBox = new JCheckBox("Sort groups by gender?");
		
		checkBox.setBackground(BACKGROUND);
		
		setBorder(BorderFactory.createTitledBorder(
				BORDER_COLOR, 
				"", 
				TitledBorder.CENTER, 
				TitledBorder.DEFAULT_POSITION, 
				FONT));
		add(checkBox);
	}
}
