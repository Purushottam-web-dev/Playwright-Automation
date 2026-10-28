package for_loop_package;

public class This_keyword {
	
	int age;
	String name;
	double salary;
	
	void test21(int age, String name, double salary)
	
	{
		System.out.println("test 21");
		this.age=age;
		this.name=name;
		this.salary=salary;
	}
	
	public static void main(String[] args) {
		
		This_keyword t1= new This_keyword();
		t1.test21(30, "Puru", 100.10);
		System.out.println(t1.age);
		System.out.println(t1.name);
		System.out.println(t1.salary);
	}

}
