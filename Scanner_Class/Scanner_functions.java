package Scanner_Class;

import java.util.Scanner;

public class Scanner_functions {
	
	
	public static void main(String[] args) {
		
		//calculate - double Simple_Interest= (P*R*T)/100;
		
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("Finding Age :- ");
		int age=sc.nextInt();
		System.out.println(age);
		
		System.out.println("Finding Salary :- ");
		double salary = sc.nextDouble();
		System.out.println(salary);
		
		System.out.println("Finding weight :- ");
		float weight=sc.nextFloat();
		System.out.println(weight);
		
		System.out.println("Finding gender :- ");
		boolean gender=sc.nextBoolean(); //boolean data type will accept only true or false values
		System.out.println(gender);
		
		System.out.println("Finding sentence :- ");
		String name=sc.nextLine();
		System.out.println(name); //We can write and store the full sentence
		
		System.out.println("Finding word :- ");
		String name1=sc.next();
		System.out.println(name1); //it will accept only one word
		
		System.out.println("Finding tshirt size :- ");
		byte size=sc.nextByte();
		System.out.println(size);
		
		System.out.println("Finding flat number :- ");
		short flatNo=sc.nextShort();
		System.out.println(flatNo);
		
		System.out.println("Finding pincode :- ");
		long pincode=sc.nextLong();
		System.out.println(pincode);
	}

}
