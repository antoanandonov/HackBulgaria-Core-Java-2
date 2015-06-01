package Task_7;

public class Students
{
	private String name;
	private int grade;

	public Students(String name, int grade)
	{
		this.name = name;
		this.grade = grade;
	}

	public String getName()
	{
		return name;
	}

	public int getGrade()
	{
		return grade;
	}

	@Override
	public String toString()
	{
		return "Grade: " + this.grade + " Name: " + this.name + "\n";
	}
}
