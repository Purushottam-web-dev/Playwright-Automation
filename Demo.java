package abstract_method;

//super calling statement

class Parent_Super_Calling{
	
	Parent_Super_Calling(int a) //constructor
	{
		
		System.out.println(a+ " Pooja");

	}
	
}

class Child_Super_calling extends Parent_Super_Calling {

	Child_Super_calling() //constructor
	{
	
		super(25); //explicitly
    System.out.println("tandekar");
	}

}

public class Demo{
	
	public static void main(String[] args) {
		
		
		new Child_Super_calling();
		
	}
	
}
