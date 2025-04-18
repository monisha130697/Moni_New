package org.rev;

import org.testng.annotations.Test;

public class Ignore_Test {
	@Test(enabled = false)
	public void test() {
		System.out.println("user");
	}
	@Test
	public void test2() {
		System.out.println("login");
	}
	@Test
	public void test3() {
		System.out.println("pass");
	}
}
