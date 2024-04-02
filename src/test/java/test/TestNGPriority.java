package test;

import org.testng.annotations.Test;

public class TestNGPriority {
	
	@Test(priority=1)
	public void test1() {
		System.out.println("I am test 1");
	}
	@Test(priority=2)
	public void test2() {
		System.out.println("I am test 2");
	}
	@Test(priority=3)
	public void test3() {
		System.out.println("I am test 3");
	}
	
	//These tests without priority will be executed first
	@Test
	public void testb() {
		System.out.println("I am test b");
	}
	
	
	//this will be excuted first as this is the non-priority method and first comes in alphabetical order
	//compared to testb
	@Test
	public void testa() {
		System.out.println("I am test a");
	}
	

}
