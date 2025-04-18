package org.rev;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Failed_Test_Two {
	@Test
	public void user() {
		String a = "Monisha";
		Assert.assertEquals(a, "monisha");
		System.out.println("user");
	}
	@Test
	public void pass() {
		System.out.println("pass");
	}
	@Test
	public void login() {
		System.out.println("login");
	}
}
