package arrray_problems;

import java.util.Scanner;

public class NewSyntaxProblem5 {

	//Ex. take input from keyboard(Scanner class), Write a int of Array of length 5 & try to find-out max and min number
	
	public static void main(String[] args) {
		
		int test1[] = new int[5];
		Scanner sc= new Scanner(System.in);
		
		for(int i=0;i<=test1.length-1;i++)
		{
			test1[i]=sc.nextInt();
		}
		
		int max=test1[0];
		int min=test1[0];
		
		for(int i=1;i<=test1.length-1;i++)
		{
			if(test1[i]>max)
			{
				max=test1[i];
			}
			if(test1[i]<min)
			{
				min=test1[i];
			}
				
		}
		
		System.out.println("Max value " + max);
		System.out.println("Min Value " + min);
		
		sc.close();
		
	}

}
