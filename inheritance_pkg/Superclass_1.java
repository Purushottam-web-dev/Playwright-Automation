package inheritance_pkg;

public class Superclass_1 {
	
	public static void math()
	{
		int c1=10;
		int c2=20;
		int sum=c1+c2;
		System.out.println(sum);
	}
	
	public void science()

	{
		int d1=20;
		int d2=10;
		int sub=d1-d2;
		System.out.println(sub);
	}
	
	Superclass_1()
	{
	
		System.out.println("This is super class constructor");
	}
	
}
