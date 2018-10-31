package algorithms_made_easy;
import java.util.Scanner;

/**
 * Class to check user input
 * @author Dano
 *
 */

public class Util 
{
	/**
	 * Displays prompt along with valid choices and continuously checks
	 * user input; restricted to specific range of numbers
	 * @param prompt is printed menu
	 * @param choices is an array of given options
	 * @return valid selection
	 */
	public static int checkUserInputMenu(String prompt, String[] choices) 
	{
		Scanner in = new Scanner(System.in);
		int answer = -1;
		
		do 
		{
			System.out.println("\n" + prompt);
			for(int i = 0; i < choices.length; i++)
			{
				System.out.println(i+1 + ") " + choices[i]);
			}
			if(!in.hasNextInt())
			{
				System.out.println("Error: Please enter a valid choice.");
				in.next();
			}
			else
			{
				answer = in.nextInt();
				if(answer <= 0 || answer > choices.length)
				{
					System.out.println("Error: Please enter a valid choice.");
				}
				else
				{
					break;
				}
			}
		} while (answer <= 0 || answer > choices.length);
		
		return answer;
	}
	
	/**
	 * Continuously checks user input for a valid integer; restricted to
	 * specific range of numbers
	 * @param prompt is the printed question
	 * @return valid integer selection
	 */
	public static int checkUserInputInt(String prompt)
	{
		Scanner in = new Scanner(System.in);
		int answer = -1;
		
		do
		{
			System.out.println("\n" + prompt);
			if(!in.hasNextInt())
			{
				System.out.println("Error: Please enter a valid integer.");
				in.next();
			}
			else
			{
				answer = in.nextInt();
				if(answer <= 0)
				{
					System.out.println("Error: Please enter a valid choice.");
				}
				else
				{
					break;
				}
			}
			
		} while (answer <= 0);
		
		return answer;
	}
	
	/**
	 * Continuously checks for valid integer provided by user; not as
	 * restrictive and allows 0 as valid choice
	 * @param prompt
	 * @return
	 */
	public static int checkUserInputChoice(String prompt)
	{
		Scanner in = new Scanner(System.in);
		int answer = -1;
		
		do
		{
			System.out.println("\n" + prompt);
			if(!in.hasNextInt())
			{
				System.out.println("Error: Please enter a valid integer.");
				in.next();
			}
			else
			{
				answer = in.nextInt();
				if(answer < 0)
				{
					System.out.println("Error: Please enter a valid choice.");
				}
			}
			
		} while (answer < 0);
		
		return answer;
	}
	
	public static int repeatFunction()
	{
		String [] menu = {"Yes", "No"};
		int answer = checkUserInputMenu("Would you like to create a new list and"
				+ " try again?", menu);
		return answer;
	}
}
