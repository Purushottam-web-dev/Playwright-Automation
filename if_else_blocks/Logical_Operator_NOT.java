package if_else_blocks;

public class Logical_Operator_NOT {
	
	//check NOT (!) logical operator
	
	public static void main(String[] args) {
		
		int boyAge=6;
		
		if(!(boyAge>6 && boyAge==5))
		{
			System.out.println("Boy can go to nursery");
		}
		else {
			System.out.println("Boy is not eligible");
		}
	}

}
