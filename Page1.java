package edu.ilstu;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class Page1 extends JPanel
{
	final private Color BACKGROUND = new BackgroundColor();
	
	private LogoPanel logo;
	private ClassSelectionPanel classSelection;
	
	public Page1()
	{
		setLayout(new BorderLayout());
		this.setBackground(BACKGROUND);
		
		logo = new LogoPanel();
		add(logo, BorderLayout.NORTH);
		
		classSelection = new ClassSelectionPanel();
		add(classSelection, BorderLayout.SOUTH);
		
		setVisible(true);
	}
}
