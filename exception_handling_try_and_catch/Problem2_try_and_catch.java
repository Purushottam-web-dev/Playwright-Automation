package exception_handling_try_and_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem2_try_and_catch {
	
	//Example – use scanner class accept input and handle the exceptions
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		try {
		int inputFromKeyboard= sc.nextInt();
		
		System.out.println("Input From Keyboard " + inputFromKeyboard);
		}
		catch(InputMismatchException a3)
		{
			System.out.println("Please send correct int values");
			
		}
		
		sc.close();
		
		
	}
	

}
