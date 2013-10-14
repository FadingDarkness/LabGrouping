<<<<<<< HEAD
package edu.ilstu;
=======
//This is the for each class of students, grouping each lecture

>>>>>>> 6926b71bd6546162b47d33357cf9062115b60a7c

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
<<<<<<< HEAD
=======
//This is the for each class of students, grouping each lecture

>>>>>>> 6926b71bd6546162b47d33357cf9062115b60a7c

public class Lecture
{
	private Student newStu;
<<<<<<< HEAD
	private ArrayList<Student> studentList;
=======
	private ArrayList<Student>  studentList;
>>>>>>> 6926b71bd6546162b47d33357cf9062115b60a7c
	private Scanner in;
	private String name;
	private boolean isMale;
	private PrintWriter write;
	private File filename;

	public Lecture(String fileName)
	{
		filename = new File(fileName);
		studentList = new ArrayList<Student>();
<<<<<<< HEAD
		readFile();
	}

=======
		writeFile();
		readFile();

	}
>>>>>>> 6926b71bd6546162b47d33357cf9062115b60a7c
	public void addStu(String stuName, boolean gender)
	{
		newStu = new Student(stuName, gender);
		studentList.add(newStu);
		writeFile();
	}
<<<<<<< HEAD

	public void remove(String stuName)
	{

		for (int i = 0; i < studentList.size(); i++)
		{
			if(studentList.get(i).getName().equals(stuName))
				studentList.remove(i);

		}
		writeFile();
=======
	
	public void remove(String stuName)
	{
		
		for(int i = 0; i<studentList.size(); i++)
		{
			if(studentList.get(i).getName().equals(stuName))
				studentList.remove(i);
			
		}
		writeFile();
		
>>>>>>> 6926b71bd6546162b47d33357cf9062115b60a7c

	}

	private void readFile()
	{

		try
		{
			in = new Scanner(filename);
		} catch (FileNotFoundException e)
		{
<<<<<<< HEAD

			e.printStackTrace();
		}

		while (in.hasNext())
		{
			name = in.nextLine();
			int gender = in.nextInt();
			if (gender == 0)
=======
			
			e.printStackTrace();
		}
		
		while(in.hasNext())
		{
			name = in.nextLine();
			if(in.nextInt() == 0)
>>>>>>> 6926b71bd6546162b47d33357cf9062115b60a7c
				isMale = false;
			else
				isMale = true;
			addStu(name, isMale);
<<<<<<< HEAD
			in.nextLine();
		}
=======
			
		}
		
>>>>>>> 6926b71bd6546162b47d33357cf9062115b60a7c

	}

	private void writeFile()
	{
		filename.delete();
		try
		{
			write = new PrintWriter(filename);
		} catch (FileNotFoundException e)
		{
<<<<<<< HEAD

			e.printStackTrace();
		}
		for (int i = 0; i < studentList.size(); i++)
		{
			write.println(studentList.get(i).getName());
			if (studentList.get(i).getGender())
			{
				write.println(1);
			} else
				write.println(0);
		}
		write.close();
	}
	
	public int getClassSize()
	{
		return studentList.size();
	}
	
	public String getStuName(int index)
	{
		return studentList.get(index).getName();
	}
	
	public void print()
	{
		for (int i = 0; i < studentList.size(); i++)
		{
			System.out.println(studentList.get(i));
		}
		System.out.println("===========================");
=======
		
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
		}
		write.close();
		
		
		
>>>>>>> 6926b71bd6546162b47d33357cf9062115b60a7c
	}

}
