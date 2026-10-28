package first_package;

public class Constructor_Overloading_ArithmaticOperation {
	
//problem - perform addition, subtraction, multiplication and division with static method overloading
	
	//addition
	Constructor_Overloading_ArithmaticOperation(int b1, int b2)
	{
		int addition=b1+b2;
		System.out.println("addition "+ addition);
		
	}

	//subtraction
	Constructor_Overloading_ArithmaticOperation(int b3,double b4)
	{
		double subtraction=b3-b4;
		System.out.println("subtraction " + subtraction);
	}
	
	//multiplication
	Constructor_Overloading_ArithmaticOperation(double b5, float b6)
	{
		double multiplication= b5*b6;
		System.out.println("multiplication " +multiplication);
		
	}
	//division
	Constructor_Overloading_ArithmaticOperation(float b7, double b8)
	{
		double division= b7/b8;
		System.out.println("division " + division);
	}
	
	public static void main(String[] args) {
		
		new Constructor_Overloading_ArithmaticOperation(25,25);
		new Constructor_Overloading_ArithmaticOperation(80,20.0);
		new Constructor_Overloading_ArithmaticOperation(100.0,100.0f);
		new Constructor_Overloading_ArithmaticOperation(80.0f,10.0);
		
	}
}
