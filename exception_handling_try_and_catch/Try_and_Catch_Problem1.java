package exception_handling_try_and_catch;

public class Try_and_Catch_Problem1 {
	
	public static void main(String[] args) throws ArithmeticException {
		
	
		try {
			int div=1/0;
			System.out.println(div);
			

		}
		catch(ArithmeticException a1){
			
			System.out.println("Exception Handling");
			
			
		}
}
}

