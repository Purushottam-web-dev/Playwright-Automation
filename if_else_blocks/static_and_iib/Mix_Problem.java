package if_else_blocks.static_and_iib;

public class Mix_Problem {
	
	//write a program for static , non-static, constructor, SIB, IIB
	
	
	public static void main(String[] args) {
		
		add();
		Mix_Problem m1=new Mix_Problem();
		m1.sub();
		
		
	}

	
	//SIB Method/Block
	static
	{
		System.out.println("This is SIB Method/Block");
	}
	
	//IIB method/block
	
	{
		System.out.println("This is IIB method/block");
	}
	
	
	//static method
	public static void add()
	{
		int a=10;
		int b=10;
		int addition=a+b;
	
		System.out.println("Addition result : " + addition);
	}
	
	//non-static method
	public void sub()
	{
		int c=20;
		int d=5;
		int subtraction=c-d;
		
		System.out.println("Subtraction result:" + subtraction);
	}
	
	//constructor
	
	Mix_Problem()

	{
		int e=50;
		int f=10;
		int multiplication=e*f;
		
		System.out.println("Multiplication result " + multiplication);
	}
	
	
}
