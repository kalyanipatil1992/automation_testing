package com.jiffy;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class Test_SoftAssert {
	
	@Test
	public void test_soft(){
		
		SoftAssert s=new SoftAssert();
		System.out.println("Test case1 started ");
		s.assertEquals(12,13);
		System.out.println("Test case1 completed ");
		s.assertAll();
		
	}

	
	@Test
	public void test_hard(){
		
		
		System.out.println("Test case2 started ");
		Assert.assertEquals(12,13);
		System.out.println("Test case2 completed ");
	
		
	}
}
