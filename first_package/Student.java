package first_package;

public class Student {
	
/*Problem 1: Default + Name
Create a class Student:
Constructor 1 → no parameters (prints "Student created")
Constructor 2 → takes name and prints it
*/
	
	Student()
	{
		System.out.println("Student created");
	}
	

	Student(String name)
	{
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		
		new Student();
		new Student("Purushottam");
		
		
	}
	
	

}
