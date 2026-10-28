package type_casting_pkg;

public class Type_Casting_Problem1 {
	
	public static void main(String[] args) {
		
		/*
		 * Whatever we are converting should be in right side & 
		 * what we are converting should be in left hand side*/
		
		double size = 100.11;
		
		int converted_size=(int) size; //narrowing (converting big data type into small data type)
		System.out.println(converted_size);
	}

}
