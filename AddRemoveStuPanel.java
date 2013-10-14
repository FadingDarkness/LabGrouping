package edu.ilstu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class AddRemoveStuPanel extends JPanel
{
	final private Border BORDER_COLOR = BorderFactory.createLineBorder(Color.blue);
	final private Font FONT = new Font("Arial", Font.BOLD, 12);
	final private Color BACKGROUND= new BackgroundColor();
	
	private JPanel addPanel;
	private JPanel gender;
	private JPanel name;
	private JPanel addButtonPanel;
	
	private ButtonGroup genderChoice;
	private JRadioButton male;
	private JRadioButton female;
	
	private JButton addButton;
	private JPanel removePanel;
	private JButton removeButton;
	private JPanel removeButtonPanel;
	
	private JLabel nameLabel;      
	private JTextField nameField;
	
	public AddRemoveStuPanel()
	{
		setLayout(new BorderLayout());
		this.setBackground(BACKGROUND);
		
		buildAddPanel();
		buildRemovePanel();
		
		add(addPanel, BorderLayout.NORTH);
		add(removePanel, BorderLayout.SOUTH);
	}
	
	public void setAddButtonListener(ActionListener listener) 
	{
		addButton.addActionListener(listener);
		nameField.addActionListener(listener);
	}
	
	public void setRemoveButtonListener(ActionListener listener) 
	{
		removeButton.addActionListener(listener);
	}
	
	public String getName()
	{
		return nameField.getText();
	}
	
	public void clearTextField()
	{
		nameField.setText("");
	}
	
	private void buildAddPanel()
	{
		addPanel = new JPanel();
		addPanel.setLayout(new BorderLayout());
		addPanel.setBackground(BACKGROUND);
		
		buildGenderPanel();
		buildNamePanel();
		
		addButtonPanel = new JPanel();
		addButtonPanel.setBackground(BACKGROUND);
		
		addButton = new JButton("Add Student");
		
		addButtonPanel.add(addButton);
		
		addPanel.add(name, BorderLayout.NORTH);
		addPanel.add(gender, BorderLayout.CENTER);
		addPanel.add(addButtonPanel, BorderLayout.SOUTH);
		
		addPanel.setBorder(BorderFactory.createTitledBorder(
				BORDER_COLOR, 
				"Add Entered Student", 
				TitledBorder.CENTER, 
				TitledBorder.DEFAULT_POSITION, 
				FONT));
	}
	
	private void buildRemovePanel()
	{
		removePanel = new JPanel();
		removePanel.setBackground(BACKGROUND);
		
		removeButtonPanel = new JPanel();
		
		removeButton = new JButton("Remove Student");
		
		removePanel.add(removeButton);
		
		
		removePanel.setBorder(BorderFactory.createTitledBorder(
				BORDER_COLOR, 
				"Remove Selected Student", 
				TitledBorder.CENTER, 
				TitledBorder.DEFAULT_POSITION, 
				FONT));
	}
	
	private void buildGenderPanel()
	{
		gender = new JPanel();
		gender.setBackground(BACKGROUND);
		
		genderChoice = new ButtonGroup();
		male = new JRadioButton("Male", true);
		female = new JRadioButton("Female");
		
		male.setBackground(BACKGROUND);
		female.setBackground(BACKGROUND);
		
		genderChoice.add(male);
		genderChoice.add(female);
		
		gender.add(male);
		gender.add(Box.createHorizontalStrut(15));
		gender.add(female);
	}
	
	public boolean getGender()
	{
		if(male.isSelected())
			return true;
		else
			return false;
	}
	
	private void buildNamePanel()
	{
		name = new JPanel();
		addPanel.setLayout(new BorderLayout());
		name.setBackground(BACKGROUND);
		
		nameLabel = new JLabel("Name: ");
		nameField = new JTextField(15);
		
		name.add(nameLabel, BorderLayout.WEST);
		name.add(nameField, BorderLayout.EAST);
	}
}
