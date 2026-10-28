package type_casting_pkg;

public class Type_Casting_Problem2 {
	
	//Ex. Convert int into double
	
	public static void main(String[] args) {
		
		int age= 50;
		
		double converted_age=(double)age; //Widening (converting small data type into big data type)
		System.out.println(converted_age);
	}

}
