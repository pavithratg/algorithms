package org.eviac.algorithms;

public class BinarySearch {

	/**
	 * takes a sorted array as an input.
	 * 
	 * @param input
	 * @return
	 */
	public static int binarySearch(int[] input, int item) {
		// low and high keeps track of which part of the list is currently being
		// searched.
		int low = 0;
		int high = input.length - 1;
		int mid = 0;
		int guess = 0;

		while (low <= high) {
			mid = (low + high) / 2;
			guess = input[mid];

			if (guess == item) {
				return mid;
			} else if (guess > item) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return -1;
	}
}
