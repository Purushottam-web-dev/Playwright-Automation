package exception_handling_try_and_catch;

public class Problem3_try_and_catch {
	
	public static void main(String[] args) {
		
		int values[]= new int[5];
		values[0]=10;
		values[1]=20;
		values[2]=30;
		values[3]=40;
		values[4]=50;
		
		
		try {
			
			values[5]=60;
			System.out.println(values[5]);
		}
		catch(ArrayIndexOutOfBoundsException a4)

		{
			System.out.println("Invalid Length");
		}
		
		finally {
			System.out.println("Executed Finally Block");
		}
	

}
}

