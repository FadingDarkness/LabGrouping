//This is the for each class of students, grouping each lecture


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
//This is the for each class of students, grouping each lecture


public class Lecture
{
	private Student newStu;
	private ArrayList<Student>  studentList;
	private Scanner in;
	private String name;
	private boolean isMale;
	private PrintWriter write;
	private File filename;

	public Lecture(String fileName)
	{
		filename = new File(fileName);
		studentList = new ArrayList<Student>();
		writeFile();
		readFile();

	}
	public void addStu(String stuName, boolean gender)
	{
		newStu = new Student(stuName, gender);
		studentList.add(newStu);
		writeFile();
	}
	
	public void remove(String stuName)
	{
		
		for(int i = 0; i<studentList.size(); i++)
		{
			if(studentList.get(i).getName().equals(stuName))
				studentList.remove(i);
			
		}
		writeFile();
		

	}

	private void readFile()
	{

		try
		{
			in = new Scanner(filename);
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
		filename.delete();
		try
		{
			write = new PrintWriter(filename);
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
		}
		write.close();
		
		
		
	}

}
