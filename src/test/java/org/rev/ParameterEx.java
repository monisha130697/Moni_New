package org.rev;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterEx {
	@Parameters({"user"})
	@Test
	public void test(String user) {
		System.out.println(user);
	}
	@Test
	public void test2() {
		System.out.println("login");
	}
	@Parameters({"pass"})
	@Test
	public void test3(String pass) {
		System.out.println(pass);
	}
}
