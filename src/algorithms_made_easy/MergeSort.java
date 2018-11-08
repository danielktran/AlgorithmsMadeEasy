package algorithms_made_easy;

/**
 * Class for merge sort
 * @author Dano
 *
 */

public class MergeSort 
{	
	/**
	 * Merges two subarrays; 1) array[left .. mid] 2) array[mid+1 .. right]
	 * @param leftIndex; the leftmost index used to figure out mid
	 * @param midIndex; the mid index to divide the array
	 * @param rightIndex; rightmost index used to figure out mid
	 * @param array; given array
	 */
	public static void mergeSort(int leftIndex, int midIndex, int rightIndex, int [] array)
	{
		//Find the sizes of both subarrays
		int arr1 = midIndex - leftIndex + 1;
		int arr2 = rightIndex - midIndex;
		
		//Create both subarrays
		int first[] = new int [arr1];
		int second[] = new int [arr2];
		
		//Copy data from array to subarrays
		for(int i = 0; i < arr1; i++)
		{
			first[i] = array[leftIndex + i];
		}
		for(int j = 0; j < arr2; j++)
		{
			second[j] = array[midIndex + 1 + j];
		}
		
		//Merge temp arrays
		int i = 0, j = 0;
		
		//Initial index of merged subarray
		int k = leftIndex;
		while(i < arr1 && j < arr2)
		{
			if(first[i] <= second[j])
			{
				array[k] = first[i];
				i++;
			}
			else
			{
				array[k] = second[j];
				j++;
			}
			k++;
		}
		
		//Copy rest of elements into array
		while(i < arr1)
		{
			array[k] = first[i];
			i++;
			k++;
		}
		while(j < arr2)
		{
			array[k] = second[j];
			j++;
			k++;
		}
	}
	
	public static int[] sort(int leftIndex, int rightIndex, int [] array)
	{
		if(leftIndex < rightIndex)
		{
			//Find the midIndex
			int midIndex = (leftIndex + rightIndex) / 2;
			
			//Sort the first and second halves
			sort(leftIndex, midIndex, array);
			sort(midIndex + 1, rightIndex, array);
			
			//Merge sorted halves
			mergeSort(leftIndex, midIndex, rightIndex, array);
		}
		return array;
	}
}
