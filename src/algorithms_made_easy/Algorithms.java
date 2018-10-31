package algorithms_made_easy;

/**
 * Class with all different algorithms including description and example
 * @author Dano
 *
 */
public class Algorithms 
{
	/**
	 * Function for a linear search of an unsorted list
	 */
	public void linearSearch()
	{
		boolean running = true;
		System.out.println("Linear Search:\n"
				+ "The simplest search algorithm that iterates through a given array\n"
				+ "looking for the targetted element within the array\n"
				+ "BigO: O(n) - great for short lists, not so much for long lists");
		
		while(running)
		{
			int response = Util.checkUserInputInt("How many integers would you like in your list?");
			int [] array = createArray(response);
			int searchFor = Util.checkUserInputChoice("What number would you like to search for?");
			int check = 0;	// Used to determine if a value is ever found in the list
			
			for(int i = 0; i < array.length; i++)
			{
				if(searchFor == array[i])
				{
					System.out.println(searchFor + " found at index " + i);
					check++;
				}
			}
			
			if(check == 0)
			{
				System.out.println(searchFor + " is not contained within the list");
			}
			
			int repeatResponse = Util.repeatFunction();
			if(repeatResponse == 2)
			{
				running = false;
			}
		}
		
	}
	/**
	 * Function for a binary search using an efficient sort method for small short lists
	 */
	public void binarySearch()
	{
		boolean running = true;
		System.out.println("Binary Search:\n"
				+ "An efficient algorithm that repeatedly divides a sorted list\n"
				+ "in half to narrow down a specific entity within the list.\n"
				+ "Will eliminate the half portion that does not contain the\n"
				+ "specified element being searched comparing if value is\n"
				+ "larger or smaller.\n"
				+ "BigO: O(logn)\n");
		
		while(running)
		{
			int response = Util.checkUserInputInt("How many integers would you like in"
					+ " your list?");
			int [] array = createArray(response);
			sortArray(array);
			int searchFor = Util.checkUserInputChoice("What number would you like to"
					+ " search for?");
			int check = 0;	// Used to determine if a value is ever found in the list
			
			
		}
	}
	
	public void radixSort()
	{
		
	}
	
	public void selectionSort()
	{
		
	}
	
	public void insertionSort()
	{
		
	}
	
	/**
	 * Function for a merge sort, will print out unsorted and sorted
	 */
	public void mergeSort()
	{
		boolean running = true;
		System.out.println("Merge Sort:\n"
				+ "An efficient sorting algorithm with an average low\n"
				+ "computation time even in the worst case scenario.\n"
				+ "Using a divide and conquer strategy, the algorithm\n"
				+ "divides the list in half and is placed back together\n"
				+ "in a sorted manner.\n"
				+ "BigO: O(nlogn)\n");
		
		while(running)
		{
			int response = Util.checkUserInputInt("How many integers would you like in"
					+ " your list?");
			int [] array = createArray(response);
			System.out.println("Sorting started");
			
			
			System.out.println("Left array: ");
			
			System.out.println("Right array: ");
			
			System.out.println("Sorted array: ");
		}
	}
	
	public void quickSort()
	{
		
	}
	
	public void heapSort()
	{
		
	}
	
	public void bubbleSort()
	{
		
	}
	
	public void countingSort()
	{
		
	}
	
	/**
	 * Function to create a list of random numbers specified by 
	 * the user.
	 * @param arrayLength, the number of elements within list
	 * @return 
	 */
	public int[] createArray(int arrayLength)
	{
		int [] array = new int[arrayLength];
		
		System.out.println("Unsorted list: ");
		for(int i = 0; i < arrayLength; i++)
		{
			array[i] = (int) (Math.random()*50);
			System.out.print(array[i] + " ");
		}
		return array;
	}
	
	/**
	 * This sort function uses a merge sort algorithm as a way
	 * to sort arrays for other algorithms
	 * @param array, randomly created array from previous function
	 */
	public void sortArray(int [] array)
	{
		
	}
}
