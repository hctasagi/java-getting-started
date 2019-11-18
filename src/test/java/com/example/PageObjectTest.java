package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class PageObjectTest {

	private ChromeDriver driver;

	@BeforeEach
	public void setUp() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless", "--disable-gpu");

		driver = new ChromeDriver(options);
	}

	@AfterEach
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void テスト() {

		driver.get("https://ancient-journey-46819.herokuapp.com/");

		assertEquals(driver.getTitle(), "Java Getting Started on Heroku");

		TopPage top = new TopPage(driver);
		top.link();

		System.out.println(driver.getTitle());
	}


}
