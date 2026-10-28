package abstract_method;

abstract class Wanadongri{
	
	abstract void addition();
	abstract void division();
	
	
	
}

class Nagpur extends Wanadongri{
	
	void subtraction()
	{
		int c1=25;
		
		int c2=10;
		int sub=c1-c2;
		System.out.println(sub);
	}

	@Override
	void addition() {
		// TODO Auto-generated method stub
		
		int a1=15;
		int a2=15;
		int add=a1+a2;
		System.out.println(add);
	}

	@Override
	void division() {
		// TODO Auto-generated method stub
		
		int b1=50;
		int b2=5;
		int div=b1/b2;
		System.out.println(div);
	}
	
}

public class Maharashtra_01 extends Nagpur{
	
	void multiplication()
	{
		int d1=10;
		int d2=10;
		int mul= d1*d2;
		
		System.out.println(mul);
	}
	
	public static void main(String[] args) {
		
		Maharashtra_01 m1= new Maharashtra_01();
		m1.addition();
		m1.division();
		m1.subtraction();
		m1.multiplication();
		
	}

}
