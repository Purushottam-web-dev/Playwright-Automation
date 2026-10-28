package abstract_method;



public class Parent_Abstract extends Abstract_Method_01{
	
	public static void main(String[] args) {
		Parent_Abstract p1= new Parent_Abstract();
		p1.test1();
		p1.test2();
		p1.test3();
		p1.test4();
	}
	
	void test3()
	{
		System.out.println("test 3 method");
	}
	
	void test4()
	{
		System.out.println("test 4 method");
		
	}

	@Override
	void test1() {
		// TODO Auto-generated method stub
		
		System.out.println("test 1 method");
	}

	void test2() {
		// TODO Auto-generated method stub
		
		System.out.println("test 2 method");
	}

	
	
	
}

abstract class Abstract_Method_01{
	
	abstract void test1();
	abstract void test2();

		
		
	}

