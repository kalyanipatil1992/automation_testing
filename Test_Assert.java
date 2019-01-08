package com.jiffy;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Test_Assert {

	
		@Test
		public void test1(){
			
			System.out.println("Test case 1 started ");
			Assert.assertEquals(12,13);
			System.out.println("values are not same");
			System.out.println("Test case 1 completed");
			
		}

		@Test
		public void test2(){
			
			System.out.println("Test case 2 started ");
			Assert.assertEquals(12,12);
			System.out.println("Values are same");
			System.out.println("Test case 2 completed");
			
		}
		@Test
		public void test3(){
			
			System.out.println("Test case 3 started ");
			Assert.assertTrue(true);
			System.out.println("Values are same");
			System.out.println("Test case 3 completed");
			
		}
		
		@Test
		public void test4(){
			
			System.out.println("Test case 4 started ");
			Assert.assertTrue(false);
			System.out.println("Values are same");
			System.out.println("Test case 4 completed");
			
		}
		
	}


