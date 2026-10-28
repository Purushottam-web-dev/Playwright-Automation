package if_else_blocks.static_and_iib;

/*
Order of execution
1st priority to SIB
2nd priority to static method
3rd priority to non-static method
*/

public class Static_Block {
	
	public static void main(String[] args) 
	{
		Static_Block s1= new Static_Block(); //calling non-static method by creating an object
		s1.sub();
		add(); //static method calling
		
	}
	
	public static void add()
	{
		System.out.println("addition");
	}
	
	public void sub()
	{
		System.out.println("subtraction");
	}
	
	static //SIB Method
	{
		System.out.println("SIB Method");
	}

}
