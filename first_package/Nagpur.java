package first_package;

public class Nagpur
 {
	
	/*
	 * 1.	It is special type of method in java, it doesn’t have a return type
2.	Constructor are always non-static (modifier)
3.	Constructor have any access specifier (private, protected, public & default/package)
4.	Constructor are always going to be a class name

	 */
	
	public Nagpur() //constructor
	{
		System.out.println("I love Nagpur");
	}
	
	public static void main(String[] args) {
		
		new Nagpur();//object
	}
	
	
	

}
