package first_package;

public class Training_Constructor {

	/*
	 * Constructor 1 -- add name & salary
	 * Constructor 2 -- add age and rank (A/B/C)
	 * 
	 * */
	

	//Constructor 1
	Training_Constructor(String name , double salary, int serial_number)
	{
		System.out.println(name);
		System.out.println(salary);
	}
	
	//Constructor 2
	
	Training_Constructor(int age , char rank, int emp_id)
	{
		System.out.println(age);
		System.out.println(rank);
	}
	
	public static void main(String[] args) {
		
		new Training_Constructor("Abc", 2000.19, 2);
	    new Training_Constructor(25, 'A', 12);
		
	}
	
}
