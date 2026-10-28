package first_package;

public class Method_Overloading_Static {
	
	// Problem 1- Add empID, Salary, Age & Name of employee
	
	//type = int, short, byte, long (number store)
	//String data type is used to store alpha+numeric+special characters
	
	public static void employee1(int empID)
	{
		System.out.println("Employee ID :- " + empID);
	}
	
	public static void employee1(double salary)
	{
		System.out.println("Salary of Employee :- " + salary);
	}
	public static void employee1(float age)
	{
		System.out.println("Age of Employee : - " + age);
	}
	
	public static void employee1(String name)
	{
		System.out.println("Name of employee :- " + name);
	}
	
	public static void main(String[] args) {
		
		employee1(123);
		employee1(9999.99);
		employee1(25.6f);
		employee1("Ajay");
		
	}
	
	

}
