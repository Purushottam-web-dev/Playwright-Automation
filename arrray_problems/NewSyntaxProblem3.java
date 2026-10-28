package arrray_problems;

public class NewSyntaxProblem3 {
	
	//Ex. copy the array 1 list of number into another array
	
	public static void main(String[] args) {
		
		int originalArray[]= {10,20,30,40,50,60};
		int newArray[]= new int[originalArray.length];
		
		for(int i=0;i<=originalArray.length-1;i++) {
			
			newArray[i]=originalArray[i];
		}
		
		System.out.println(newArray[0]);
		System.out.println(newArray[1]);
		System.out.println(newArray[2]);
		System.out.println(newArray[3]);
		System.out.println(newArray[4]);
		System.out.println(newArray[5]);
	}

}
