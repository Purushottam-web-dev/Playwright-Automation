package Scanner_Class;

import java.util.Scanner;

//1.	Pre-defined class in java
//2.	Take the human input in run time
//3.	It is also helps to write a generic code (acceptable by all)
//4.	Scanner class is the final class in java
//5.	We can import Scanner class from java.util.Scanner; package
//6.	Under Scanner class we have 16 constructors available in the java


public class Program1_Scanner {
	
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("First Input :- ");
		int a=sc.nextInt();
		System.out.println("Second Input : -");
		int b=sc.nextInt();
		System.out.println("Addition :- ");
		int sum=a+b;
		System.out.println("Result :- " + sum);
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int a=10;
//		int b=20;
//		int sum=a+b;
//		System.out.println(sum);
		
	}

}
