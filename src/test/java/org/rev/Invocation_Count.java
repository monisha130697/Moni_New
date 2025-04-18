package org.rev;

import org.testng.annotations.Test;

public class Invocation_Count {
	@Test(invocationCount = 10)
	public void test() {
		System.out.println("sample test");
	}
	
}
