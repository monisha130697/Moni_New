package org.rev;

import org.testng.annotations.Test;

public class Parallel_Class2 {
	@Test
	public void user1() {
		System.out.println(Thread.currentThread().threadId());
		System.out.println("user1");
	}
	@Test
	public void login1() {
		System.out.println(Thread.currentThread().threadId());
		System.out.println("login2");
	}
	@Test
	public void pass1() {
		System.out.println(Thread.currentThread().threadId());
		System.out.println("pass3");
	}
}
