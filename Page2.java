package edu.ilstu;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class Page2 extends JPanel
{
	final private Color BACKGROUND = new BackgroundColor();
	
	private ClassListPanel addRemove;
	private GroupSortPanel groupSort;
	
	private int lectureNumber;
	private Lecture lecture;

	public Page2(Lecture lecture)
	{
		setLayout(new BorderLayout());
		this.lecture = lecture;
		this.setBackground(BACKGROUND);
		
		addRemove = new ClassListPanel(lecture);
		groupSort = new GroupSortPanel();
		
		add(addRemove, BorderLayout.NORTH);
		add(groupSort, BorderLayout.SOUTH);
		
		setVisible(false);
	}
	
	public void setLectureNum(int num)
	{
		this.lectureNumber = num;
	}
}
