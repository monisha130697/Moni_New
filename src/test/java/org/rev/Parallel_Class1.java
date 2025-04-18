package org.rev;

import org.testng.annotations.Test;

public class Parallel_Class1 {
	@Test
	public void user() {
		System.out.println(Thread.currentThread().threadId());
		System.out.println("user");
	}
	@Test
	public void login() {
		System.out.println(Thread.currentThread().threadId());
		System.out.println("login");
	}
	@Test
	public void pass() {
		System.out.println(Thread.currentThread().threadId());
		System.out.println("pass");
	}
}
