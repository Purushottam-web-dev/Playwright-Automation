package first_package;

public class Program_of_Static_NonStatic_Constructor {
	
	
	Program_of_Static_NonStatic_Constructor() //constructor
	{
		//addition
		
		int a=20;
		int b=25;
		int total1=a+b;
		System.out.println("Constructor Result " + total1);
		
	}
	
	public void subtraction() //non-static method

	{
		int c=50;
		int d=25;
		int total2=c-d;
		System.out.println("Non-Static Result " + total2);
	}
	
	public static void multiplication() //static method

	{
		int e=25;
		int f=10;
		int totall3=e*f;
		System.out.println("Static Result " + totall3);
	}
	
	
	public static void main(String[] args) {
		
	Program_of_Static_NonStatic_Constructor p1= new Program_of_Static_NonStatic_Constructor(); //we are calling constructor
		
	p1.subtraction(); //we are calling non-static method
		
	multiplication(); //we are calling static method
		
		
	}
	
	
}
