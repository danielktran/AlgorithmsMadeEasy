package algorithms_made_easy;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		boolean running = true;
		Algorithms algorithms = new Algorithms();
		
		System.out.println("Algorithms Made Easy");
		String[] menu = {"Linear Search", "Binary Search", "Radix Sort",
				"Selection Sort", "Insertion Sort", "Merge Sort", "Quick Sort",
				"Heap Sort", "Bubble Sort", "Counting Sort", "Quit"};
		
		while(running)
		{
			int response = Util.checkUserInputMenu("Please make a selection:", menu);
			
			switch(response)
			{
			case 1:
				algorithms.linearSearch();
				break;
			case 2:
				algorithms.binarySearch();
				break;
			case 3:
				algorithms.radixSort();
				break;
			case 4:
				algorithms.selectionSort();
				break;
			case 5:
				algorithms.insertionSort();
				break;
			case 6:
				algorithms.mergeSort();
				break;
			case 7:
				algorithms.quickSort();
				break;
			case 8:
				algorithms.heapSort();
				break;
			case 9:
				algorithms.bubbleSort();
				break;
			case 10:
				algorithms.countingSort();
				break;
			case 11:
				running = false;
				System.out.println("Exiting.");
				break;
			}
		}
	}
}
