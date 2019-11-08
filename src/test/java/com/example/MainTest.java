package com.example;


import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class MainTest extends Main {

	private ChromeDriver driver;


	@Before
	public void setUp() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless", "--disable-gpu");

		driver = new ChromeDriver(options);
		driver.get("https://ancient-journey-46819.herokuapp.com/");

	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void test1() {


		//タイトルを取得
		System.out.println(driver.getTitle());

		//Getting Started with Javaをクリック
		driver.findElement(By.linkText("Getting Started with Java")).click();
		String title = driver.getTitle();
		assertThat(title, containsString("Getting Started on Heroku with Java"));

	}

	@Test
	public void test2() {

		//Source on GitHubをクリック
		driver.findElement(By.linkText("Source on GitHub")).click();
		System.out.println(driver.getTitle());

	}


}
