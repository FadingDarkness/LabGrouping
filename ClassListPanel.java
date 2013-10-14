package edu.ilstu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class ClassListPanel extends JPanel 
{
	final private Color BACKGROUND= new BackgroundColor();
	final private Border BORDER_COLOR = BorderFactory.createLineBorder(Color.blue);
	
	private AddRemoveStuPanel addRemove;
	
	private JList list;
	private DefaultListModel listModel;
	private JScrollPane listScrollPane;
	
	private Lecture lecture;
	
	public ClassListPanel(Lecture lecture)
	{
		this.lecture = lecture;
		
		setLayout(new BorderLayout());
		
		listModel = new DefaultListModel();
		
		list = new JList(listModel);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.addListSelectionListener(null);
        list.setVisibleRowCount(5);
        list.setBackground(BACKGROUND);
        list.setBorder(BorderFactory.createTitledBorder(BORDER_COLOR, "Class List", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION));
        listScrollPane = new JScrollPane(list);
		listScrollPane.setPreferredSize(new Dimension(275, 175));
		
		addRemove = new AddRemoveStuPanel();
		addRemove.setAddButtonListener(new addStudentListener());
		addRemove.setRemoveButtonListener(new removeStudentListener());
		
		add(listScrollPane, BorderLayout.CENTER);
		add(addRemove, BorderLayout.EAST);
		
		addStudents();
	}
	
	private void addStudents()
	{
		for(int i = 0; i < lecture.getClassSize(); i++)
		{
			listModel.addElement(lecture.getStuName(i));
		}
	}
	
	class addStudentListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) 
		{
			if(!addRemove.getName().equals(""))
			{
				String name = addRemove.getName();
				boolean gender = addRemove.getGender();
				lecture.addStu(name, gender);
				listModel.addElement(addRemove.getName());
				addRemove.clearTextField();
			}
		}	
	}
	
	class removeStudentListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) 
		{
			lecture.remove(list.getSelectedValue().toString());
			listModel.removeElement(list.getSelectedValue());
			lecture.print();
		}	
	}
}
