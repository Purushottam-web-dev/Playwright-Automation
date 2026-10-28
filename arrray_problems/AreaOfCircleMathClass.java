package arrray_problems;

public class AreaOfCircleMathClass {
	
	public static void main(String[] args) {
		
		/*Ex. Calculate area of a circle by using for loop and Math class
		Assume= r=random , math.random*/
		//Calculation formula--> Area=Pi*r*r
		
		for(int i=0;i<=5;i++) {
			
			double r=Math.random();
			double Pi= Math.PI;
			double Area= Pi*r*r;
			System.out.println("Area of circle "+ Area);
		}
		
		System.out.println("No Found");
		

	}

}
