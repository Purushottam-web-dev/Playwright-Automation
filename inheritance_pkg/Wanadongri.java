package inheritance_pkg;



class Maharashtra{
	
	public static void stateName()
	{
		System.out.println("Maharashtra");
	}
	
}

class Nagpur extends Maharashtra{
	
	public static void cityName()
	{
	
		System.out.println("Nagpur");
	}
	
	
}


public class Wanadongri extends Nagpur{
	
	
	public static void main(String[] args) {
		
		villageName();
		cityName();
		stateName();
	}
	
	public static void villageName()

	{
		System.out.println("Wanadongri");
	}
}
