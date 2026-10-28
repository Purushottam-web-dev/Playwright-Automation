package first_package;

public class Constructor_Overloading_1 {
	
	
	public static void main(String[] args) {
		
		new Constructor_Overloading_1();
		
	}
	
	
	Constructor_Overloading_1()

{
		
		//int => whole number accepts
		//double & float data types are accepting decimal values
		//int + float/double = double/float
		
		int a1=10;
		double a2=10.0;
		double result_1=a1+a2;
		System.out.println(result_1);
		
		int s1=20;
		float s2= 10.0f;
		float result_2=s1-s2;
		System.out.println(result_2);
		
	/*	work :
	 * addtion = > float + float
	 * subraction => double - float
	 * multiplication => double * int
	 * division => float /int
	 *  
	 */
			
		

}
}
