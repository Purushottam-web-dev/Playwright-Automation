package arrray_problems;

import java.util.Arrays;

public class SplitFunctionProblem {
	
	//Problem - Ex. Write program for String split function with array
	
	public static void main(String[] args) {
		
		String name="Pooja";
		String surname="Tandekar";
		
		String name1[]=name.split("a");
		String surname1[]=surname.split("r");
		
		System.out.println(Arrays.toString(name1));
		System.out.println(Arrays.toString(surname1));
		
		
	}

}
