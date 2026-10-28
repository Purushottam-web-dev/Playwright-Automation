package first_package;

public class Movie_Ticket {
	
	//Problem 10: Show movie details: movieName (String), rating (double), year (int)
	
	//Solving problem in non-static method
	
	public void picture(String movieName)
	{
		System.out.println(movieName);
	}
	
	public void picture(double rating)
	{
		System.out.println(rating);
	}
	
	public void picture(int year)
	{
		System.out.println(year);
	}
	
	public static void main(String[] args) {
		
		Movie_Ticket m1= new Movie_Ticket();
		m1.picture("Dhurandar");
		m1.picture(2026);
		m1.picture(5.0);
	}

}
