package abstract_method;

/*
1.	only non-static method can be over-ridden
2.	Child class can never be the abstract class
3.	Abstract class always be the super-class or super most class
4.	In abstract class we can store the or write the concrete method
5.	Concrete class cannot have the abstract methods
6.	We can create relation between two abstract class with the help of extends keyword
*/

abstract class Maharashtra{
	
	abstract void marathi();
	
	 void english()
	 
	{
		System.out.println("I like english subject");
	}	
}


abstract class Rajasthan extends Maharashtra{
	
	abstract void hindi();
	
	void maths()
	{
		System.out.println("I love maths");
	}
	 
	
}
public class India extends Rajasthan{
	
public static void main(String[] args) {
	
	int a = 5;
	System.out.println(a++);

	
	India a1= new India();
	
	System.out.println("Maharashtra Result :- ");
	
	a1.marathi();
	a1.english();
	
	System.out.println("Rajasthan Result :- ");
	
	a1.hindi();
	a1.maths();
	
	System.out.println("India Result :- ");
	
	a1.science();
		
	}
	
	
	void science()
	{
		System.out.println("I like science");
	}
	

	@Override
	void hindi() {
		// TODO Auto-generated method stub
		
		System.out.println("I like hindi");
	}

	@Override
	void marathi() {
		// TODO Auto-generated method stub
		
		System.out.println("I like marathi");
	}

}
