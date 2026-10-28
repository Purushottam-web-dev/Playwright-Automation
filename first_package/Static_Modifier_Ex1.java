package first_package;


//Static & non-static --> modifier
public class Static_Modifier_Ex1 {
	
	public static void add()
	{
		int a=10;
		int b=20;
		int total_sum=a+b;
		System.out.println("addition = " + total_sum);
	}
	
	public static void sub()
	{
		int a1=20;
		int b1=15;
		int total_sub=a1-b1;
		System.out.println("subtraction = " + total_sub);
	}
	
	public static void mul()
	{
		int a2=15;
		int b2=2;
		int total_mul=a2*b2;
		System.out.println("multiplication = " + total_mul);
		
	}
	public static void div()

	{
		int a3=50;
		int b3=10;
		int total_div=a3/b3;
		System.out.println("division = " + total_div);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Result of Operations :- ");
		add();
		sub();mul();
		div();
		
		
		
	}

}
