package arrray_problems;

public class NewSyntaxProblem2 {
	
	//Ex. – give me sum of array of 5 with positive & negative
	
	
	public static void main(String[] args) {
		
		int count[]= {10,-5,25,-10,15};
		
		int total=0;//20
		
		for(int i=0;i<=count.length-1;i++)
		{
			total=total+count[i];
			System.out.println(total);
		}
		
		System.out.println("Result Not Found");
	}

}
