package com.instanaceofcake.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	StringHelper helper = new StringHelper();

	@Test
	public void testTruncateAInFirst2Positions_AinFirst2Positions() {

		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
	}

	@Test
	public void testTruncateAInFirst2PositionsAinFirst1Positions() {

		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}
	
	
	@Test
	public void areFirstAndLastTwoCharactersTheSame_Notsame() {
		assertEquals(false, helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	
	@Test
	public void areFirstAndLastTwoCharactersTheSame_same() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}

}
