package access_specifier_programs;

public class Access_specifier_with_methods {
	
	
	public static void testcase1()
	{
		System.out.println("one");
	}
	private static void testcase2()
	{
		System.out.println("two");
	}
	protected static void testcase3()
	{
		System.out.println("three");
	}
	  void testcase4()
	{
		  System.out.println("four");
	}
	
	public static void main(String[] args) {
		
		testcase1();
		testcase2();
		testcase3();
		
		Access_specifier_with_methods a1 = new Access_specifier_with_methods();
		a1.testcase4();
		
		
		
	}

}
