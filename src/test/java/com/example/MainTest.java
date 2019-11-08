package com.example;


import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class MainTest extends Main {

	private ChromeDriver driver;


	@Before
	public void setUp() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless", "--disable-gpu");

		driver = new ChromeDriver(options);
	}

	@After
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

	@Test
	public void test3() {
		driver.get("https://ancient-journey-46819.herokuapp.com/");

		//150 add-on servicesをクリック
		driver.findElement(By.linkText("150 add-on services")).click();

		WebElement search = driver.findElement(By.name("q"));
		search.click();
		search.sendKeys("heroku");
		driver.findElement(By.className("search-submit")).click();
	}

}
