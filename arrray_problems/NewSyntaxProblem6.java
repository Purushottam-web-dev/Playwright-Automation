package arrray_problems;

public class NewSyntaxProblem6 {
	
	public static void main(String[] args) {
		
		int values[]= {5,-1,15,25,10};
		
		int max=values[0]; //assumption
		int min=values[0]; //assumption
		
		for(int i=0;i<=values.length-1;i++) {
			
			if(values[i]>max)
			{
				max=values[i];
			}
			if(values[i]<min) {
				
				min=values[i];
			}
		}
		System.out.println("Min kength " + min);
		System.out.println("Max length " + max);
	}

}
