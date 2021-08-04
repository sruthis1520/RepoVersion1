package com.yash;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestNumberCheck {

	@Test
	public void testCheckNumberType() {
		
		//assertEquals(true,NumberCheck.isEven(58));
		assertTrue(NumberCheck.isEven(122765986));
		//assertFalse(NumberCheck.isEven(57));
		
	}

}
