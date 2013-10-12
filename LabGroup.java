//This is the for each class of students, grouping each lecture


public class LabGroup
{
	private Student student;
	private Student [] labArr;
	private LabGroup lab;

	public LabGroup(String labName)
	{
		labArr[0] = new Student(" ", false);

	}

	public void addStudent(String name, boolean isMale)
	{
		student.addStu(name, isMale);
	}

	public void removeStudent(String name)
	{
		student.remove(name);
	}
}
