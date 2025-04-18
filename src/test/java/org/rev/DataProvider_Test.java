package org.rev;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Test {
	@Test(dataProvider = "test")
	public void test(String one,String two) {
		System.out.println(one);
		System.out.println(two);
	}
	
	@DataProvider(name="test")
	public Object[][] dpMethod() {
		return new Object[][] {{"username","monisha"},{"password","moni123"}};
		
	}
}
