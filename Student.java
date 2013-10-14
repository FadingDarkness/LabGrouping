package edu.ilstu;

public class Student 
{
	private String name;
	private boolean isMale;

	public Student(String stuName, boolean gender) 
	{
		name = stuName;
		isMale = gender;
	}

	public String getName() 
	{
		return name;
	}

	public boolean getGender() 
	{
		return isMale;
	}
	
	public String toString()
	{
		return name;
	}

}