package inheritance_pkg;

public class Subclass_1 extends Superclass_1{
	
	public static void main(String[] args) {
		
		//Calling sub-class methods
		addition();
		multiplication();
		
		Subclass_1 s1= new Subclass_1(); //object created with child class name
		s1.subtraction(100.00, 10.00);
		s1.division(100, 5.0f);
		
		//calling super-class methods
		
		math();
		Subclass_1 s2= new Subclass_1();
		s2.science();
		
		new Superclass_1();//constructor
		
		
	}
	
	
	public static void addition()
	{
		int a=10;
		int b=20;
		int addition= a+b;
		System.out.println(addition);
	}
	public void subtraction(double a1, double b1)
	{
		double subtraction=a1-b1;
		System.out.println(subtraction);
	}
	public static void multiplication()
	{
		float a2=100.15f;
		double b2=50.50;
		double multiplication=a2*b2;
		System.out.println(multiplication);
	}
	public void division(int a, float b)
	{
		float division=a/b;
		System.out.println(division);
		
	}

}
