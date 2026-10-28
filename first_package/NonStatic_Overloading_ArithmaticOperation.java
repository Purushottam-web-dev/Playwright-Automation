package first_package;

public class NonStatic_Overloading_ArithmaticOperation {
	
	//problem - perform addition, subtraction, multiplication and division with static method overloading

	//addition
	public void operation1(int a1, int b1)
	{
		int addition=a1+b1;
		System.out.println("addition " + addition);
		
	}
	//subtraction
	public void operation1(int a2, double b2)
	{
		
		double subtraction=a2-b2;
		System.out.println("subtraction " + subtraction);
	}
	//multiplication
	
	
	public void operation1(double a3, int b3)
	{
		
		double multiplication=a3*b3;
		System.out.println("multiplication "+ multiplication);
	}
	
	//division
	public void operation1(double a4, float b4)
	{
		
		double division=a4/b4;
		System.out.println("division "+ division);
	}
	
	
	public static void main(String[] args) {
		
		NonStatic_Overloading_ArithmaticOperation n1= new NonStatic_Overloading_ArithmaticOperation(); //object
		
		n1.operation1(10, 20);
		n1.operation1(30, 20.0);
		n1.operation1(100.0, 25);
		n1.operation1(1000.0, 100.0f);
		
		
		
	}
	
	
	
	
	
	
}
