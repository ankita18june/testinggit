package com.test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InvocationCountTest {
	
	@Test(invocationCount=2)
	public void sum() {
		int a=12;
		int b=14;
		int c=a+b;
		System.out.println("sum is"+c);
		Assert.assertTrue(false);
	}

}
