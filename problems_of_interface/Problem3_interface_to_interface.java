package problems_of_interface;


interface Pincode1{
	
	abstract void one();
	
	
}

interface Pincode2 extends Pincode1{
	
	abstract void two();
	
}

public class Problem3_interface_to_interface implements Pincode2{
	
	public static void main(String[] args) {
		Problem3_interface_to_interface p3= new Problem3_interface_to_interface();
		p3.one();
		p3.two();
		
		
	}

	@Override
	public void one() {
		// TODO Auto-generated method stub
		
		System.out.println("One interface");
	}

	@Override
	public void two() {
		// TODO Auto-generated method stub
		
		System.out.println("Two interface");
	}

}
