package org.rev;

import org.testng.annotations.Test;

public class Group1 {
	@Test(groups = {"smoke","reg"})
	public void test() {
		System.out.println("user");
	}
	@Test(groups = {"sanity","reg"})
	public void test2() {
		System.out.println("login");
	}
	@Test(groups = {"sanity","reg"})
	public void test3() {
		System.out.println("pass");
	}
}
