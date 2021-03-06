package algorithms_made_easy;

import algorithms_made_easy.MergeSort;
import algorithms_made_easy.Util;

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
				+ "looking for the targetted element; not a sorted list.\n"
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
	 * Function for a binary search using merge sort method for small short lists
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
				+ "BigO: O(logn)");
		
		while(running)
		{
			int response = Util.checkUserInputInt("How many integers would you like in"
					+ " your list?");
			int [] array = createArray(response);
			int searchFor = Util.checkUserInputChoice("What number would you like to"
					+ " search for?");
			
			//Using merge sort to sort list before searching
			int [] sort = MergeSort.sort(0, array.length-1, array);
			printSortedArray(array);
			System.out.println();	//Formatting
			
			int binarySearch = BinarySearch.binarySearch(0, array.length-1, searchFor, array);
			if(binarySearch == -1)
			{
				System.out.println(searchFor + " is not contained within the list");
			}
			else
			{
				System.out.println(searchFor + " found at index " + binarySearch);
			}
			
			int repeatResponse = Util.repeatFunction();
			if(repeatResponse == 2)
			{
				running = false;
			}
		}
	}
	
	public void radixSort()
	{
		
	}
	
	public void selectionSort()
	{
		
	}
	
	/**
	 * Function for insertion sort
	 */
	public void insertionSort()
	{
		boolean running = true;
		System.out.println("Insertion Sort:\n"
				+ "Simple sorting algorithm similar to how a person\n"
				+ "sorts a hand of cards."
				+ "BigO: O(n^2) - can be much faster if only a few\n"
				+ "elements out of order, but on average, slow.");
		
		while(running)
		{
			int response = Util.checkUserInputInt("How many integers would you like in"
					+ " your list?");
			int [] array = createArray(response);
			
			int [] sort = InsertionSort.insertionSort(array);
			printSortedArray(sort);
			
			System.out.println();	//Formatting
			int repeatResponse = Util.repeatFunction();
			if(repeatResponse == 2)
			{
				running = false;
			}
		}
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
				+ "divides the list in half repeatedly until each"
				+ "array contains only one element each and is placed "
				+ "back together in a sorted manner.\n"
				+ "BigO: O(nlogn) - considered one of the best in all"
				+ "aspects due to the runtime.");
		
		while(running)
		{
			int response = Util.checkUserInputInt("How many integers would you like in"
					+ " your list?");
			int [] array = createArray(response);
			
			int [] sort = MergeSort.sort(0, array.length-1, array);
			printSortedArray(sort);
			
			System.out.println();	//Formatting
			int repeatResponse = Util.repeatFunction();
			if(repeatResponse == 2)
			{
				running = false;
			}
		}
	}
	
	public void quickSort()
	{
		
	}
	
	public void heapSort()
	{
		
	}
	
	/**
	 * Function for bubble sort
	 */
	public void bubbleSort()
	{
		boolean running = true;
		System.out.println("Bubble Sort:\n"
				+ "One of the simplest sort algorithms. Continuously\n"
				+ "swaps adjacent elements until list is sorted. \n"
				+ "Inefficient due to the nature of having to \n"
				+ "continuously pass through the list to make sure\n"
				+ "that the list has been sorted properly.\n"
				+ "BigO: O(n^2) - Can be fast at O(n) for best \n"
				+ "case, but on average, passing through too \n"
				+ "many times.");
		
		while(running)
		{
			int response = Util.checkUserInputInt("How many integers would you like in"
					+ " your list?");
			int [] array = createArray(response);
			
			int [] sort = BubbleSort.bubbleSort(array);
			printSortedArray(sort);
			
			System.out.println();	//Formatting
			int repeatResponse = Util.repeatFunction();
			if(repeatResponse == 2)
			{
				running = false;
			}
		}
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
	 * Function to print out a sorted array
	 * @param array. sorted array
	 */
	public static void printSortedArray(int [] array)
	{
		int [] sortedArray = new int[array.length];
		
		System.out.println("\n\nSorted list: ");
		for(int i = 0; i < array.length; i++)
		{
			sortedArray[i] = array[i];
			System.out.print(sortedArray[i] + " ");
		}
	}
}
