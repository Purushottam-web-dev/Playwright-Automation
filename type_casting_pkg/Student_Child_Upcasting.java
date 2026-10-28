package type_casting_pkg;


class Teacher_Parent_Upcasting{
	
	void add()
	{
		System.out.println("addition");
	}
	void sub()
	{
		System.out.println("subtraction");
	}
}

public class Student_Child_Upcasting extends Teacher_Parent_Upcasting{
	
	public static void main(String[] args) {
		
		Teacher_Parent_Upcasting t1= new Student_Child_Upcasting(); //upcasting
		
		t1.add();
		t1.sub();
	
		
		
	}

	void mul()
	{
		System.out.println("multiplication");
		
	}
	void div()
	{
		System.out.println("division");
	}
}
