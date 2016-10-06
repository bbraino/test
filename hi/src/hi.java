import java.util.Scanner;


public class hi {

	public static void main(String[] args)
	{
		try
		{
			Scanner UserInput = new Scanner(System.in);
			System.out.println("Please enter starting position e.g 1 2 N");
			String roverPosition = UserInput.nextLine();
		}
		catch (Exception e)
		{
			System.out.println("Exception thrown  :" + e);
		}
	}
}
