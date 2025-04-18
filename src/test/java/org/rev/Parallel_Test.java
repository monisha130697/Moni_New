package org.rev;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parallel_Test {
	@Parameters({"browser"})
	@Test
	public void chrome(String browser) {
		if(browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
		}else if(browser.equals("Firefox")) {
				WebDriverManager.firefoxdriver().setup();
				WebDriver driver = new FirefoxDriver();
				driver.get("https://www.google.com/");
	}
	}
}
