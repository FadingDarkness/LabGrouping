//This is the student class, it creates the student object, which stores
//which stores their name and gender

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
	

	

}
