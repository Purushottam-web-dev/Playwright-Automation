package abstract_method;

import access_specifier_programs.Parent_Access_Specifier;

public class Parent_Access_Specifier_Child extends Parent_Access_Specifier{
	
	public static void main(String[] args) {
		
		Parent_Access_Specifier_Child p2= new Parent_Access_Specifier_Child();
		
		p2.testcase21();//public
		p2.testcase23();//protected
		
		
	
	}

}
