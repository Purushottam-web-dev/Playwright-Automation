package first_package;

public class Friday_Constructor_Overloading {
	
	public static void main(String[] args) {
		
		new Friday_Constructor_Overloading(50);
		new Friday_Constructor_Overloading(145000.50);
		new Friday_Constructor_Overloading("Kunal");
	}
	
	
	Friday_Constructor_Overloading(int age)

        {
		System.out.println("Age " + age);
		
		}
	
	Friday_Constructor_Overloading(String name)

    {
	
		System.out.println("Name " + name);
	}
	
	Friday_Constructor_Overloading(Double salary)

    {
	
		System.out.println("Salary " + salary);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
