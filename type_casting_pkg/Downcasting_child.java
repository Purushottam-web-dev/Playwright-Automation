package type_casting_pkg;


class Downcasting_Parent
{
	
	void add()
	{
		System.out.println("addition");
	}
	
}


public class Downcasting_child extends Downcasting_Parent {
	
	void sub()
	{
		System.out.println("subtraction");
	}
	
	public static void main(String[] args) {
		
		Downcasting_Parent d1=  new Downcasting_child(); //upcasting
		
		d1.add();
		
		Downcasting_child ref= (Downcasting_child)d1; //downcasting
		
		ref.add();
		ref.sub();
		
	}

}
