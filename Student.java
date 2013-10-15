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
 * Creates the student object
 * @param stuName the name of the student
 * @param gender if the student is male this is true, 
 * female it will be false
 */
	public Student(String stuName, boolean gender)
	{
		name = stuName;
		isMale = gender;
		prevGroup=0;
	}
/**
 * Returns the name of the student
 * @return name String
 */
	public String getName()
	{
		return name;
	}

/**
 * returns the true if male, false if female
 * @return isMale boolean
 */
	public boolean getGender()
	{
		return isMale;
	}
/**
* retuns the previous group number that the student was in
* @return prevGroup int
*/
	public int getPrevGroup()
	{
		return prevGroup;
	}
	
	
/**
 * Sets the previous group number
 * @param groupNumber int
 */
	public void setPrevGroup(int groupNumber)
	{
		prevGroup = groupNumber;		
	}
	

	

}
