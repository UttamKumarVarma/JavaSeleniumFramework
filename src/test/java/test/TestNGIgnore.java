package test;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestNGIgnore {
	
	@Test
	@Ignore
	public void test() {
		System.out.println("parameter");
	}
	
	@Test
	public void test2() {
		System.out.println("parameter1");
	}


}
