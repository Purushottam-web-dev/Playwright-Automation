package string_functions;

public class String_Problem1 {
	
	public static void main(String[] args) {
		
	//to upper case function
		String name= "pooja";
		String rename=name.toUpperCase();
		System.out.println(rename);
		
		//to lower case
		
		String name1="WANADONGRI";
		String cityName=name1.toLowerCase();
		System.out.println(cityName);
		
		//length
		
		String xLength="pooja";
		int totalLength=xLength.length();
		System.out.println(totalLength);
		
		//trim
		
		String fruit_1= " Pooja ";
		String abc=fruit_1.trim();
		System.out.println(abc);
		
		
		
		//charAt(index)
		
		String xyz="Poojakjbhkbkjndcnjklnjlknlnlcdkjmjjj";//P=0 , o=1, o=2, j=3, 4=a
		System.out.println(xyz.charAt(32));
		
		
		//indexof(char)
		
		String cityName="nagpur";
		System.out.println(cityName.indexOf("r"));
		
		
		// substring(begin)
		
		String aa= "neha";
		System.out.println(aa.substring(1)); //trim = removing char
		
		//substring(begin, end)
		
		String bb= "neha";
		System.out.println(bb.substring(1, 4)); 
		
		
		
		

	}

}
