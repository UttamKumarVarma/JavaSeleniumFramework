package test;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameters {
	
	@Test
	@Parameters("value")
	public void test(@Optional("Uttam") String parameter) {
		System.out.println(parameter);
	}

}
