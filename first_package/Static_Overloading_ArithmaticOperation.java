package first_package;

public class Static_Overloading_ArithmaticOperation {
	
	//problem - perform addition, subtraction, multiplication and division with static method overloding
	
	//Addition 1+1
	public static void operation(int x1, int y1)

	{
		int addition=x1+y1;
		System.out.println("Addition : -" + addition);
	}
	
	//Subtraction
	public static void operation(double x2,int y2)
	{
		double subtraction=x2-y2;
		System.out.println("Subtraction :- " + subtraction);
	}
	
	//Multiplication
	
	public static void operation(float x3, double y3)
	{
		double multiplication=x3*y3;
		System.out.println("Multiplication : - " + multiplication);
	}
	
	//division
	
	public static void operation(double x4, float y4)
	{
		double division=x4/y4;
		System.out.println("Division :- " + division);
	}
	
	
	public static void main(String[] args) {
		
		operation(10,10); //addition
		
		operation(50.0,25); //subtraction
		
		operation(25.0f,10.0); //multiplication
		
		operation(100.0,25.0f); //division
		
	}
}
