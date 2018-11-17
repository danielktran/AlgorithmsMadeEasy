package algorithms_made_easy;

/**
 * Class for simple insertion sort
 * @author Dano
 *
 */
public class InsertionSort 
{
	public static int [] insertionSort(int [] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			int tempKey = array[i];
			int j = i-1;
			
			/**
			 * Checks each value within the array and compares the tempKey value
			 * with each element to find where tempKey will go
			 */
			while(j >= 0  && array[j] > tempKey)
			{
				array[j+1] = array[j];
				j = j-1;
			}
			//Moves the tempKey forward to continue the sorting process
			array[j+1] = tempKey;
		}
		
		return array;
	}
}
