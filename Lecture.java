/*
* Programmer: Sarah Butler
*
* Date: October 14,2013
*
* File Name: Lecture
*
* Class: IT 226
* Instructor: Cathy Holbrook
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * This creates a class that holds an arrayList of students who fill up a specific lecture
 * Writes and reads a file, adds students and removes students from the file
 * 
 * @author Sarah Butler
 *
 */


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
		int i = 0;
		
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
			int temp = in.nextInt();
			
			studentList.get(i).setPrevGroup(temp);
			i++;
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
			write.println(studentList.get(i).getPrevGroup());
		}
		write.close();
		
		
		
	}
	public String toString()
	{
		String str = "";
		for(int i = 0; i < studentList.size(); i++)
		{
			str += studentList.get(i).getName() + "\n";
		}
		return str;
	}
	
	public static void main(String[] args)
	{
		Lecture lecture = new Lecture("lecture.txt");
		lecture.addStu("Sarah", false);
		lecture.addStu("Tim", true);
		lecture.addStu("Mark", true);
		
		lecture.remove("Sarah");
		lecture.remove("Orange");
		
		
		
	}


}

}
