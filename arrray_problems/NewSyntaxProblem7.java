package arrray_problems;

import java.util.Scanner;

public class NewSyntaxProblem7 {
	////Ex. Find out the average of the array of 5 (with & without scanner class)
	
	public static void main(String[] args) {
		
		//int numbers[]= {100, 200, 500, 50,150};
		int numbers[]= new int[5];
		Scanner sc= new Scanner(System.in);
		int sum=0;
		
		for(int i=0;i<=numbers.length-1;i++) {
			
			//sum=sum+numbers[i];
			sum= sum+sc.nextInt();
		}
		
		System.out.println("Total values of Array : "+ sum);
		System.out.println("Calculating Average values " + sum/numbers.length);
		sc.close();
	}

}
