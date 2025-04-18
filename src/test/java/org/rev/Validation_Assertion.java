package org.rev;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Validation_Assertion {
	@Test
	public void user() {
		//hardAssert
		String a = "Monisha";
		Assert.assertEquals(a, "monisha");
		System.out.println("user");
	}
	@Test()
	public void login() {
		//softAssert
		String a = "monisha";
		SoftAssert sa = new SoftAssert();
		sa.assertAll();
		sa.assertEquals(a, "Monisha");
		System.out.println("login");
	}
	@Test()
	public void pass() {
		System.out.println("pass");
	}
}
