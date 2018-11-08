package algorithms_made_easy;

/**
 * Class for binary search function
 * @author Dano
 *
 */
public class BinarySearch 
{
	/**
	 * Recursive function for binary search; returns index of searchFor if present
	 * and returns -1 if not
	 * @param leftIndex, the leftmost index of array
	 * @param rightIndex, the rightmost index of array
	 * @param searchFor, number user specified to be searched for
	 * @param array, randomly generated array to be searched through
	 * @return, index of searchFor or -1
	 */
	public static int binarySearch(int leftIndex, int rightIndex, int searchFor, int [] array)
	{
		if (leftIndex <= rightIndex)
		{
			int midIndex = (leftIndex + rightIndex) / 2;
			
			//Check midIndex if searchFor
			if(array[midIndex] == searchFor)
			{
				return midIndex;
			}
			//Number found to be in the left subarray
			if(array[midIndex] > searchFor)
			{
				return binarySearch(leftIndex, midIndex - 1, searchFor, array);
			}
			//number found to be in the right subarray
			if(array[midIndex] < searchFor)
			{
				return binarySearch(midIndex + 1, rightIndex, searchFor, array);
			}
		}
		return -1;
	}
}
