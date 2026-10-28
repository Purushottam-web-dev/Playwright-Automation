package first_package;

public class Method_Overloading_NonStatic {
	
/*Problem 2 - Add student name, roll number, subject - 
	english, maths, percentage, grade , whether pass or fail
*/
	
 
	public void student(String name)
	{
		System.out.println("Student name :- " + name);
	}
	public void student(int roll_number)
	{
		System.out.println("Student roll number :- " + roll_number);
	}
	public void student(String subject1 , String subject2)
	{
		System.out.println("subject1 :- " + subject1);
		System.out.println("subject2 :- " + subject2);
	}
	public void student(double percentage)
	{
		System.out.println("Total Percentage (%) :- " + percentage);
	}
	public void student(char grade) //A, B, C
	{
		System.out.println("Grade :- " + grade);
	}
	
	public void student(boolean pass) {
		System.out.println("Pass :- " + pass);
		
	}

	public static void main(String[] args) {
		
		
		Method_Overloading_NonStatic m1= new Method_Overloading_NonStatic(); //object
		
		m1.student("Pooja");
		m1.student(123);
		m1.student("Science", "Maths");
		m1.student(55.56);
		m1.student('B');
		m1.student(true);
		
		
	}
}
