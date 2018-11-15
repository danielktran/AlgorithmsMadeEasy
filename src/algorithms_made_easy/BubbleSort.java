package algorithms_made_easy;

/**
 * Class for bubble sort
 * @author Dano
 *
 */
public class BubbleSort 
{
	public static int[] bubbleSort(int array [])
	{
		//Loop for multiple iterations through the list until sorted
		for(int i = 0; i < array.length - 1; i++)
		{
			//Loop to iterate through the list once
			for(int j = 0; j < array.length - i - 1; j++)
			{
				if(array[j] > array[j + 1])
				{
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}
}
