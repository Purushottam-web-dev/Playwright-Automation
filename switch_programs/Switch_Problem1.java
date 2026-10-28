package switch_programs;

public class Switch_Problem1 {
	
	/*
	 * Note – 
1.	Switch always consist of numeric value
2.	If we do not use break statement, then leakage will happen
*/
	
	public static void main(String[] args) {
		
		int a=4;
		switch(a)
		{
		case 1: System.out.println("Pooja");
		break;
		case 2: System.out.println("Pooja1");
		break;
		case 3: System.out.println("Pooja2");
		break;
		case 4: System.out.println("Pooja3");
		break;
		default: System.out.println("No Data Found");
	
		}
		
	}

}
