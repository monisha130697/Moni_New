package org.rev;

import org.testng.annotations.Test;

public class Test_Priority {
	@Test(priority=1)
	public void test() {
		System.out.println("user");
	}
	@Test(priority=3)
	public void test2() {
		System.out.println("login");
	}
	@Test(priority=2)
	public void test3() {
		System.out.println("pass");
	}
}
