package org.extent;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_One {
	public static final Logger logger = LogManager.getLogger(Test_One.class);
	
	@Test
	public void user() {
		logger.info("user");
		Assert.assertFalse(true);
		System.out.println("TestOne");
	}
	@Test
	public void pass() {
		logger.info("pass");
		System.out.println("TestTwo");
	}
	@Test
	public void login() {
		logger.info("login");
		System.out.println("TestThree");
	}
}
