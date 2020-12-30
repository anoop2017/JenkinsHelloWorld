package com.anoop;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestMyFirstJava {
	int a;
	int b;

	@Before
	public void setUp() throws Exception {
		a=10;
		b=5;
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddTwoNumbers() {
		
		
		int val = new MyFirstJava().addTwoNumbers(a, b);
		assertTrue("the addition is wrong", val==15);
		
		
	}

	@Test
	public void testSubstractwoNumbers() {
		int v = 6;
		System.out.println("iiiiiii---"+ (v==6));
		int val = new MyFirstJava().substractwoNumbers(a, b);
		assertTrue("the substration is wrong --" + val, val==5);
	}

}
