package edu.ilstu;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class GroupSizePanel extends JPanel
{
	final private Color BACKGROUND = new BackgroundColor();
	final private Border BORDER_COLOR = BorderFactory.createLineBorder(BACKGROUND);
	final private Font FONT = new Font("Arial", Font.BOLD, 12);
	
	JSlider groupSize;
	
	public GroupSizePanel()
	{
		setBackground(BACKGROUND);
		
		groupSize = new JSlider(JSlider.HORIZONTAL, 2, 8, 4);
		groupSize.setBackground(BACKGROUND);
		
		groupSize.setMajorTickSpacing(1);
		groupSize.setMinorTickSpacing(0);
		groupSize.setPaintTicks(true);
		groupSize.setPaintLabels(true);
		
		add(groupSize);
		
		setBorder(BorderFactory.createTitledBorder(
				BORDER_COLOR, 
				"Size of Each Group", 
				TitledBorder.CENTER, 
				TitledBorder.DEFAULT_POSITION, 
				FONT));
	}
}
