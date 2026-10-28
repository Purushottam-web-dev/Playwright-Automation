package inheritance_pkg;

public class Child_Class extends Parent_Class {
	
	public void add()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("Total " + sum);
	}
	
	public static void main(String[] args) {
		
		Child_Class c1= new Child_Class(); //object
		c1.add();
		c1.sub();
		
		
		
		
		

	}

}
