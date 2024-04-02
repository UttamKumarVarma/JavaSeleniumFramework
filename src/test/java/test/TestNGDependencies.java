package test;

import org.testng.annotations.Test;

public class TestNGDependencies {
	
	@Test(dependsOnMethods= {"test2","test3"})
	public void test1() {
		
		System.out.println("test1");
	}
	
	@Test
	public void test2() {
		
		System.out.println("test2");
	}
	
	@Test
	public void test3() {
		
		System.out.println("test3");
	}
	
	
	@Test(dependsOnGroups = {"test","important"})
	public void test4() {
		
		System.out.println("test4");
	}
	
	@Test(groups="test")
	public void test5() {
		
		System.out.println("test5");
	}
	
	@Test(groups="important")
	public void test6() {
		
		System.out.println("test6");
	}

}
