package edu.ilstu;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LogoPanel extends JPanel
{
	final private Color BACKGROUND= new BackgroundColor();
	
	
	private ImageIcon logo;
	private JLabel label;
	
	public LogoPanel()
	{
		this.setBackground(BACKGROUND);
		
		logo = new ImageIcon("labManagerLogo.png");
		label = new JLabel(logo, JLabel.CENTER);
		add(label);
	}
}
