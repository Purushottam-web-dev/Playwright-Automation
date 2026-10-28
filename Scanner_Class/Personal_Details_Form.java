package Scanner_Class;

import java.util.Scanner;

public class Personal_Details_Form {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Full Name : ");
		String fullName=sc.nextLine();
		System.out.println(fullName);
		
		System.out.println("Address : ");
		String address=sc.nextLine();
		System.out.println(address);
		
		System.out.println("PIN Code : ");
		int pin_code=sc.nextInt();
		System.out.println(pin_code);
		
		System.out.println("Email :- "); //special characteristics -> @#$%&_-=
		String email=sc.nextLine();//String data type contains alpha+numeric+special char
		System.out.println(email);

		System.out.println("DOB :- ");
		String dob= sc.next();
		System.out.println(dob);
		
		System.out.println("Weight :- ");
		double weight = sc.nextDouble();
		System.out.println(weight);
		
		sc.close();
		
		
	}

}
