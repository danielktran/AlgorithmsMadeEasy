import java.util.Scanner;

/**
 * Class to check user input
 * @author Dano
 *
 */

public class Util 
{
	/**
	 * Displays prompt along with valid choices and continuously checks user input
	 * @param prompt is printed menu
	 * @param choices is an array of given options
	 * @return valid selection
	 */
	
	public static int checkUserInput(String prompt, String[] choices) 
	{
		Scanner in = new Scanner(System.in);
		int answer = -1;
		
		do 
		{
			System.out.println("\n" + prompt);
			
		} while (answer <= 0 || answer > choices.length);
	}
}
