package arrray_problems;

public class NewSyntaxProblem4 {
	
	//Ex. reverse the elements, that we have in array
	
	public static void main(String[] args) {
		
		int oldArray[]= {5,10,15,20,25};
		int newArray[]= new int [oldArray.length];
		
		int i=0;
		int k=0;
		
		for (i=oldArray.length-1,k=0;i>=0;i--)
		{
			newArray[k]=oldArray[i];
			k++;
		}
		
		System.out.println("Original Array");
		System.out.println(oldArray[0]);
		System.out.println(oldArray[1]);
		System.out.println(oldArray[2]);
		System.out.println(oldArray[3]);
		System.out.println(oldArray[4]);
		
		System.out.println("Reverse Array");
		System.out.println(newArray[0]);
		System.out.println(newArray[1]);
		System.out.println(newArray[2]);
		System.out.println(newArray[3]);
		System.out.println(newArray[4]);
		
	}

}
