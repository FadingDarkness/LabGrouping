package edu.ilstu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;


public class LabManagerFrame extends JFrame 
{
	final private Color BACKGROUND = new BackgroundColor();
	final private int HEIGHT = 381;
	final private int WIDTH = 473;
	
	private int pageNumber;
	
	private Page1 page1;
	private Page2 page2;
	
	private JPanel buttonPanel;
	private JButton back;
	private JButton next;
	private JButton finish;
	
	private ArrayList<Lecture> lectures;
	
	public LabManagerFrame()
	{
		super("Lab Manager");
		lectures = new ArrayList();
		pageNumber = 1;
		
		this.setLayout(new BorderLayout());
		this.getContentPane().setBackground(BACKGROUND);
		
		page1 = new Page1();
		//TEST
		createLectures();
		page2 = new Page2(lectures.get(0));
		
		this.buildButtonPanel();
		
		this.add(page1, BorderLayout.WEST);
		this.add(page2, BorderLayout.CENTER);
		this.add(buttonPanel, BorderLayout.SOUTH);
		
		this.setVisible(true);
		this.setResizable(false);
		this.pack();
//		System.out.print(this.getHeight() + "<height   Width>" + this.getWidth());
	}
	
	private void buildButtonPanel()
	{
		buttonPanel = new JPanel();
		buttonPanel.setBackground(BACKGROUND);
//		buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
		
		back = new JButton("Back");
		next = new JButton("Next");
		finish = new JButton("Finish");
		
		back.setEnabled(false);
		finish.setEnabled(false);
		
		back.setMnemonic(KeyEvent.VK_B);
		next.setMnemonic(KeyEvent.VK_N);
		finish.setMnemonic(KeyEvent.VK_F);
		
		next.addActionListener(new NextButtonListener());
		back.addActionListener(new BackButtonListener());
		finish.addActionListener(new FinishButtonListener());
		
		buttonPanel.add(back);
		buttonPanel.add(next);
		buttonPanel.add(Box.createHorizontalStrut(60));
//      buttonPanel.add(new JSeparator(SwingConstants.VERTICAL));
//      buttonPanel.add(Box.createHorizontalStrut(5));
		buttonPanel.add(finish);
		
	}
	
	private class NextButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) 
		{
			if(pageNumber == 1)
			{
				page1.setVisible(false);
				page2.setVisible(true);
				pageNumber++;
				back.setEnabled(true);
				finish.setEnabled(true);
			}
		}	
	}
	
	private class BackButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) 
		{
			if(pageNumber == 2)
			{
				page2.setVisible(false);
				page1.setVisible(true);
				pageNumber--;
				back.setEnabled(false);
				finish.setEnabled(false);
			}
		}	
	}
	
	private class FinishButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) 
		{
	
		}	
	}
	
	private void createLectures()
	{
		Lecture lecture1 = new Lecture("class1.txt");
		lectures.add(lecture1);
	}
	
	public static void main(String args[])
	{
		LabManagerFrame run = new LabManagerFrame();
	}
}
