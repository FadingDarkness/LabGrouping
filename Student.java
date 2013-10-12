//This is the student class, it creates the student object, which stores
//which stores their name and gender


public class Student
{
	private String name;
	private boolean isMale;
	private Student [] student;
	private int arrCount=0;

	public Student(String stuName, boolean gender)
	{
		name = stuName;
		isMale = gender;
	}

	public boolean isMale()
	{
		return isMale;
	}

	public String getName()
	{
		return name;
	}

	public int getNumStu()
	{
		return arrCount +1;
	}

	public void addStu(String stuName, boolean gender)
	{
		Student newStu = new Student(stuName, gender);
		student[arrCount++] = newStu;
	}

	public void remove(String stuName)
	{
		boolean stuFound = false;
		int num = 0;
		

		while(stuFound = false)
		{	
			if(student[num++].getName().equals(stuName))
			{
				stuFound = true;
				while(arrCount > num)
				{
					student[num++] = student[num+1];
				}
				arrCount --;
			}	
		}

	}

}
