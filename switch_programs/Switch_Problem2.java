package switch_programs;

import java.util.Scanner;

public class Switch_Problem2 {

	//Ex:- write a switch program with scanner class and perform  
	//addition, subtraction, multiplication and division
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int choice = sc.nextInt();		
		switch(choice)
		{
		case 1: 
			
            System.out.println("Enter Addition Input :- ");
			int a= sc.nextInt();
			int b= sc.nextInt();
			int addition= a+b;
			System.out.println(addition);
			
			break;
			
		case 2: 
			System.out.println("Enter Subtraction Input :- ");
			int a1= sc.nextInt();
			int b1= sc.nextInt();
			int subtraction= a1-b1;
			System.out.println(subtraction);
			
			break;
			
		case 3: 
			System.out.println("Enter Multiplication Input :- ");
			int a2= sc.nextInt();
			int b2= sc.nextInt();
			int multiplication= a2*b2;
			System.out.println(multiplication);
			
			break;
			
		case 4: 
			System.out.println("Enter Division Input :- ");
			int a3= sc.nextInt();
			int b3= sc.nextInt();
			int division= a3/b3;
			System.out.println(division);
			
			break;
			
			default : System.out.println("Invalid Result");
		
		}
		sc.close();
	}

}
