package arrray_problems;

public class NewSyntaxProblem {
	
	//syntax= Data Type variable name[]= {values};
	
	public static void main(String[] args) {
		int num[]= {1,2,3};
		
		int sum=0;
		
		for(int i=0;i<=num.length-1;i++) //condition=>i<=num.length-1=true result will be printed
		{
			sum=sum+num[i];
			System.out.println("Array Values "+ sum);
		}
		System.out.println("Not Found");
		
		
	
		
	}
	
	

	


}
