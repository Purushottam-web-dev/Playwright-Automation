package first_package;

public class Constructor_Example {
	
	//Constructor
	
	 Constructor_Example()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		
		//Constructor_Example c1= new Constructor_Example(); //object type 1
		
		new Constructor_Example(); //object type 2
		
	}

}
