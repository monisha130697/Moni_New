package org.rev;

import org.testng.annotations.Test;

public class Group2 {
	@Test(groups = {"smoke","reg"})
	public void test() {
		System.out.println("Test1");
	}
	@Test(groups = {"smoke","reg"})
	public void test2() {
		System.out.println("Test2");
	}
	@Test(groups = {"sanity","reg"})
	public void test3() {
		System.out.println("Test3");
	}
}
