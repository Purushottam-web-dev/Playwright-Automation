package encapsulation_problems;

class ParentClass{
	
	int add(int a, int b)
	{
		int sum=a+b;
		return sum;
	}
	
	double sub(double a1, double b1)
	{
		double sub=a1-b1;
		return sub;
	}
	
}

public class Return_Concept {
	
	public static void main(String[] args) {
		ParentClass p1= new ParentClass();
		
		System.out.println(p1.add(10, 10));
		System.out.println(p1.sub(30.0, 10.0));
		
		
	}

}
