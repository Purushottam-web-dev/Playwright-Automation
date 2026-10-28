package problems_of_interface;


interface Test1 {
	
	abstract void test11();
	abstract void test12();
	
	
}

public class Problem_1_interface_concrete implements Test1{
	
	public static void main(String[] args) {
		
		Problem_1_interface_concrete p1= new Problem_1_interface_concrete();
		p1.test11();
		p1.test12();
		
	}

	@Override
	public void test11() {
		// TODO Auto-generated method stub
		
		System.out.println("Test 11");
		
	}

	@Override
	public void test12() {
		// TODO Auto-generated method stub
		
		System.out.println("Test 12");
		
	}

}
