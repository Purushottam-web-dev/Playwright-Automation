package first_package;

public class Addtion {
	
	//1. perform addition 
	//2. create 3 different methods like static, non-static & constructor 
	
	public static void Team1()

	{
		int t1=10;
		int t2=20;
		int total_1= t1+t2;
		System.out.println(total_1);
	}
	
	public void Team2()
	{
		int t3=20;
		int t4=5;
		int total_2=t3+t4;
		System.out.println(total_2);
		
	}
	
	Addtion(int a)
	{
		int t5=30;
		int t6=30;
		int total_3=t5+t6;
		System.out.println(total_3);
	}
	
	Addtion()
	{
		int t5=30;
		int t6=30;
		int total_3=t5+t6;
		System.out.println(total_3);
	}
	
	public static void main(String[] args) {
		
		Team1(); //static call
		
		Addtion a1= new Addtion(); //constructor call
		
		a1.Team2(); //non-static call
		
		
	}
	
	
}
