package problems_of_interface;



//Multiple Inheritance (Diamond Problem_
abstract class Apple{
	
	abstract void num1();
	abstract void num2();
	
	
}

interface Orange {
	
	abstract void num3();
	abstract void num4();
	
}


public class Problem2_abstract_to_interface extends Apple implements Orange{
	
	public static void main(String[] args) {
		
		Problem2_abstract_to_interface p1= new Problem2_abstract_to_interface();
		p1.num1();
		p1.num2();
		p1.num3();
		p1.num4();
		
	}

	@Override
	public void num3() {
		// TODO Auto-generated method stub
		
		System.out.println("num3");
	}

	@Override
	public void num4() {
		// TODO Auto-generated method stub
		
		System.out.println("num4");
	}

	@Override
	void num1() {
		// TODO Auto-generated method stub
		
		System.out.println("num1");
		
	}

	@Override
	void num2() {
		// TODO Auto-generated method stub
		System.out.println("num2");
	}

}
