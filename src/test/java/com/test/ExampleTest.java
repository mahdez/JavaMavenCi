package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class ExampleTest {

	@Test 
	public void test() {
		//int value
		int socre = 80;
		
		//expected
		String expected = "A";
		
		//actual
		String actual = "B";
		
		//test
		Assert.assertEquals(expected, actual);
	}

}
