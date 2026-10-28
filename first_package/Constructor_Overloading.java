package first_package;

public class Constructor_Overloading {
	
	
	Constructor_Overloading()

	{
		System.out.println("Purushottam");
	}
	
	Constructor_Overloading(int age)
	{
		
		System.out.println(age);
	}
	
	
	public static void main(String[] args) {
		
		new Constructor_Overloading();
		new Constructor_Overloading(25);
		
	}
}
