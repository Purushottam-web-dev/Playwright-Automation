package exception_handling_try_and_catch;

public class Throw_and_Throws {

	/*Ex. age or person is greater than 18 then allow him to use google app 
	otherwise throw arithmetic exceptions*/
	
	//throw & throws keyword problem
	
	public static void main(String[] args) throws NullPointerException{
		
		int age=25;
		
		if(age>25)
		{
			System.out.println("User can use google map");
		}
		else {
			
			 // throw new ArithmeticException(); type 1 to show exception
			throw new ArithmeticException("User is not eligible to use google map"); // type 2 to shown throw exception
		}
	}
	
}
