package for_loop_package;

public class Problem_4_forloop {
	
    public static void main(String[] args) {

        String str = "EDCBA";

        for (int i = str.length()-1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }

}
