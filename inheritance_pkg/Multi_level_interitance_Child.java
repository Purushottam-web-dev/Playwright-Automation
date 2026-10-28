package inheritance_pkg;

public class Multi_level_interitance_Child extends Multi_level_interitance_father{
	
	public static void childName()

	{
		System.out.println("xyz");
	}
	
	public static void main(String[] args) {
		
		
		childName();
		fatherName();
		grandParent();
		
		
	}

}
