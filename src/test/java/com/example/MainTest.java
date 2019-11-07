package com.example;


import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class MainTest extends Main {

	@Test
	public void test1() {

		System.setProperty("webdriver.chrome.driver", "/app/.chromedriver/bin/chromedriver");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless", "--disable-gpu");

		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com");
		driver.close();

		System.out.println("aa");

	}

}
