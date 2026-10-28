package abstract_method;


public class Main_method_overloading {
	
	 public static void main(int a)
	  {
		  System.out.println(a);
	  }

	  public static void main(String name)
	  {
		System.out.println(name);  
	  }
	  
	  public static void main(String[] args) {
		  
		  main(30);
		  main("xyz");
		
	}
	
	

}
