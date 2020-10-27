public class Student
{
	private String studentName;
	private double studentGPA;
	private String studentNumber;
	
	public Student()
	{
		studentName = " ";
		studentGPA = 4.0;
		studentNumber = " ";
	}
	
	public Student (String nameIn, double gpaIn, String studentNumberIn)
	{
		
		studentName = nameIn;
		studentGPA = gpaIn;
		studentNumber = studentNumberIn;
		
	}
	
	public String getName()
	{
		return studentName;
	}
	
	public double getGPA()
	{
		return studentGPA;
	}
	
	public String getStudentNumber()
	{
		return studentNumber;
	}
	
	public void setName (String nameIn)
	{
		studentName = nameIn;
	}
	
	public void setGPA (double gpaIn)
	{
		studentGPA = gpaIn;
	}
	
	public void setStudentNumber (String studentNumberIn)
	{
		studentNumber = studentNumberIn;
	}
}
