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

/**
 * 
 * This is the student class, it creates the student object,
 * which stores their name and gender and the previous group number
 * 
 * @author Sarah Butler
 * 
*/
public class Student
{
	private String name;
	private boolean isMale;
	private int prevGroup;

/**
 * 
 * @param stuName
 * @param gender
 */
	public Student(String stuName, boolean gender)
	{
		name = stuName;
		isMale = gender;
		prevGroup=0;
	}

	public String getName()
	{
		return name;
	}


	public boolean getGender()
	{
		return isMale;
	}
	
	public int getPrevGroup()
	{
		return prevGroup;
	}
	
	

	public void setPrevGroup(int groupNumber)
	{
		prevGroup = groupNumber;		
	}
	

	

}
