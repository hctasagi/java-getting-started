package com.example;


import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class MainTest extends Main {

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
	public void test1() {

		driver.get("https://ancient-journey-46819.herokuapp.com/");

		//タイトルを取得
		System.out.println(driver.getTitle());

		//Getting Started with Javaをクリック
		driver.findElement(By.linkText("Getting Started with Java")).click();
		String title = driver.getTitle();
		assertThat(title, containsString("Getting Started on Heroku with Java"));

	}

	@Test
	public void test2() {

		driver.get("https://ancient-journey-46819.herokuapp.com/");

		//Source on GitHubをクリック
		driver.findElement(By.linkText("Source on GitHub")).click();
		System.out.println(driver.getTitle());

	}


}
