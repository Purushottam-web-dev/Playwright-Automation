package if_else_blocks.static_and_iib;

public class Instant_Initialization_Block {
	
	/* order of execution
	 * 1. SIB
	 * 2. IIB
	 * 3. Static
	 * 4. Non-Static
	 * */
	
	{
		System.out.println("IIB Method"); //IIB Method
	}
	
	public static void mul()
	{
		System.out.println("Multiplication"); //Static method
	}
	
	public void div()
	{
		System.out.println("Division"); //Non-static method
	}
	
	public static void main(String[] args) {
		
		mul(); //static method calling
		
		Instant_Initialization_Block i1= new Instant_Initialization_Block();  //non-static method calling
		i1.div();
		
	}

}
