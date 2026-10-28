package arrray_problems;

public class MathClassProblems {
	
	public static void main(String[] args) {
		
		int add=Math.addExact(10, 10);
		int sub=Math.subtractExact(25, 10);
		int mul= Math.multiplyExact(25, 10);
		int div=Math.floorDiv(100, 10);
		
		System.out.println("Addition " +add);
		System.out.println("Subtraction "+ sub);
		System.out.println("Multiplication "+ mul);
		System.out.println("Division " +div);
	}

}
