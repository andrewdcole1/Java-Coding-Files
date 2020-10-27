public class Driver2
{
	public static void main(String[] args) throws InterruptedException
	{
		Student student1 = new Student("Jeremy Bow", 4.0, "1232592");
		Student student2 = new Student("Andrew Cole", 3.7, "01081920");
		Student student3 = new Student("Gary Cantrell", 3.85, "12097891");
		
		printStudentInformation(student1);
		printStudentInformation(student2);
		printStudentInformation(student3);
		
		Student[] studentArray = {student1, student2, student3};
		
		for(Student s : studentArray)
			printStudentInformation(s);

	}
	
	public static void printStudentInformation(Student studentInfo)
	{
		System.out.println("Student Name: " + studentInfo.getName());
		System.out.println("Student GPA: " + studentInfo.getGPA());
		System.out.println("Student Number: " + studentInfo.getStudentNumber() + "\n");
	}
}