package encapsulation_problems;

class NameSurname
{
	private String name="Puru";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class Problem1_getter_setter {
	
	public static void main(String[] args) {
		
		NameSurname n1= new NameSurname();
		n1.setName("Pooja");
		System.out.println(n1.getName());
		
	}

}
