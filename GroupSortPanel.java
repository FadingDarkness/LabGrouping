package edu.ilstu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class GroupSortPanel extends JPanel
{
	final private Color BACKGROUND = new BackgroundColor();
	final private Border BORDER_COLOR = BorderFactory.createLineBorder(BACKGROUND);
	final private Font FONT = new Font("Arial", Font.BOLD, 24);
	
	GroupSizePanel groupSize;
	GenderSortPanel genderSort;
	JLabel label;
	
	JPanel labelPanel;
	
	public GroupSortPanel()
	{
		setLayout(new BorderLayout());
		setBackground(BACKGROUND);
		
		label = new JLabel("Group Settings");
		label.setFont(FONT);
		label.setBackground(BACKGROUND);
		
		labelPanel = new JPanel();
		labelPanel.setBackground(BACKGROUND);
		labelPanel.add(label);
		
		groupSize = new GroupSizePanel();
		
		genderSort = new GenderSortPanel();
		
		add(labelPanel, BorderLayout.NORTH);
		add(groupSize, BorderLayout.CENTER);
		add(genderSort, BorderLayout.WEST);
	}
}
