package method_overriding;

class Parent_1{
	
	void add()
	{
	
	
		System.out.println("Addition"); //implementation
	
	}

	public void java() {
		// TODO Auto-generated method stub
		
	}
	
	
}


public class Method_Overriding_1 extends Parent_1{
	
	void add()
	{
		super.java();
		System.out.println("Subtraction"); //implementation
	}
	
	public static void main(String[] args) {
		
		Method_Overriding_1 m1= new Method_Overriding_1();
		m1.add();
		
	}
	

}
