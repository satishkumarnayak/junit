package com.instanaceofcake.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeAfterTest {
	
	@BeforeClass
	public static void  beforeClass() {
		System.out.println("beforeClass");
	}

	@Before
	public void setup() {
		System.out.println("setup");
	}

	@Test
	public void test1() {
		System.out.println("test1");
	}

	@Test
	public void test2() {
		System.out.println("test2");
	}
	
	@After
	public void teardown() {
		System.out.println("teardown");
	}
	
	@AfterClass
	public static void  afterClass() {
		System.out.println("afterClass");
	}
}
