package abstract_method;

//this calling statement
public class Fruits {
	
	
	Fruits()
	{
		System.out.println("age");
	}
	
	Fruits(String name)
	{
	this();
		System.out.println(name);
	
	}
	
	public static void main(String[] args) {
	
		new Fruits("Hello");
		
	}

}
