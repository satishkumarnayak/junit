package com.instanaceofcake.junit;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.Arrays;

import org.junit.Test;

public class ArrayCompareTest {

	@Test
	public void testArrayCompare() {
		int[] numbers = { 12, 32, 2, 4, 55, 16 };
		int[] expected = { 2, 4, 12, 16, 32, 55 };

		Arrays.sort(numbers);
		assertEquals(Arrays.toString(expected), Arrays.toString(numbers));
		assertArrayEquals(expected, numbers);
	}

	@Test(expected = NullPointerException.class)
	public void testArrayExecption() {
		int[] numbers = null;
		Arrays.sort(numbers);
		/*
		 * try { Arrays.sort(numbers); } catch (Exception e) {
		 * System.out.println(e.getMessage()); }
		 */
	}

	@Test(timeout = 1000)
	public void testArrayPerformance() {
		int[] numbers = { 12, 32, 2 };

		for (int i = 0; i < 1000000; i++) {
			numbers[0] = i;
			Arrays.sort(numbers);
		}

	}
}
