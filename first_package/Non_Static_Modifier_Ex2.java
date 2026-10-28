package first_package;

public class Non_Static_Modifier_Ex2 {
	
	public static void main(String[] args) {
		
		
		System.out.println("Non-Static method Program :- ");
		
		Non_Static_Modifier_Ex2 n1= new Non_Static_Modifier_Ex2(); //object & n1= reference variable
		n1.add();
		n1.sub();
		n1.mul();
		n1.div();
		
		
	}
	
	public void add()
	{
		int a=10;
		int b=20;
		int total_sum=a+b;
		System.out.println("addition = " + total_sum);
	}
	
	public void sub()
	{
		int a1=20;
		int b1=15;
		int total_sub=a1-b1;
		System.out.println("subtraction = " + total_sub);
	}
	
	public void mul()
	{
		int a2=15;
		int b2=2;
		int total_mul=a2*b2;
		System.out.println("multiplication = " + total_mul);
		
	}
	public void div()

	{
		int a3=50;
		int b3=10;
		int total_div=a3/b3;
		System.out.println("division = " + total_div);
		
	}



}
