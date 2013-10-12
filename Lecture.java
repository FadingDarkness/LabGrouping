//This is the for each class of students, grouping each lecture

package ilstu.edu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Lecture
{
	private Student newStu;
	private ArrayList<Student>  studentList;
	private Scanner in;
	private String name;
	private boolean isMale;
	private PrintWriter write;
	private String fileName;

	public Lecture(String filename)
	{
		fileName = filename;
		studentList = new ArrayList<Student>();
	

	}
	public void addStu(String stuName, boolean gender)
	{
		newStu = new Student(stuName, gender);
		studentList.add(newStu);
	}
	
	public void remove(String stuName)
	{
		
		for(int i = 0; i<studentList.size(); i++)
		{
			if(studentList.get(i).getName().equals(stuName))
				studentList.remove(i);
		}

	}

	private void readFile()
	{

		try
		{
			in = new Scanner(new File(fileName));
		} catch (FileNotFoundException e)
		{
			
			e.printStackTrace();
		}
		
		while(in.hasNext())
		{
			name = in.nextLine();
			if(in.nextInt() == 0)
				isMale = false;
			else
				isMale = true;
			addStu(name, isMale);
			
		}
		

	}

	private void writeFile()
	{
		try
		{
			write = new PrintWriter(fileName);
		} catch (FileNotFoundException e)
		{
		
			e.printStackTrace();
		}
		for(int i = 0; i<studentList.size(); i++)
		{
			write.println(studentList.get(i).getName());
			if(studentList.get(i).getGender())
			{
				write.println(1);
			}
			else
				write.println(0);
			studentList.remove(i);
		}
		
	}


}
