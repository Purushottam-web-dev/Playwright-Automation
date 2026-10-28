package Scanner_Class;

import java.util.Scanner; 

public class Simple_Interest_Calculation {
	//double Simple_Interest= (P*R*T)/100;
	//P= Principal amount , R=Rate of interest , T = time
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Principal Amount : -");
		double P= sc.nextDouble();
		System.out.println(P);
		
		
		System.out.println("Rate of Interest :-");
		double R= sc.nextDouble();
		System.out.println(R);
		
		
		System.out.println("Tenure :-");
		double T= sc.nextDouble();
		System.out.println(T);
		
		System.out.println("Calculation of simple interest :- ");
		double SI=(P*R*T)/100;
		System.out.println(SI);
		
		sc.close();
		
	}

}
