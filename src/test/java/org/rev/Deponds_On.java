package org.rev;

import org.testng.annotations.Test;

public class Deponds_On {
	@Test
	public void user() {
		System.out.println("user");
	}
	@Test(dependsOnMethods = "pass")
	public void login() {
		System.out.println("login");
	}
	@Test(dependsOnMethods = "user")
	public void pass() {
		System.out.println("pass");
	}
}
