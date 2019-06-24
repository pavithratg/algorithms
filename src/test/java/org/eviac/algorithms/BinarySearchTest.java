package org.eviac.algorithms;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

class BinarySearchTest {
	private static int[] input = { 1, 3, 5, 7, 9 };

	/**
	 * value searched for greater than mid.
	 */
	@Test
	void testValueGreaterThanMid() {
		int result = BinarySearch.binarySearch(input, 3);
		assertEquals(result, 1);
	}

	/**
	 * value searched for less than mid.
	 */
	@Test
	void testValueLessThanMid() {
		int result = BinarySearch.binarySearch(input, 7);
		assertEquals(result, 3);
	}

	/**
	 * value searched doesn't exist.
	 */
	@Test
	void testNonExistingValue() {
		int result = BinarySearch.binarySearch(input, 8);
		assertEquals(result, -1);
	}

}
