package com.example;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class MainTest extends Main {
	ExecutorService executorService = Executors.newFixedThreadPool(10);

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
		System.out.println(1);

		//Getting Started with Javaをクリック
//		driver.findElement(By.linkText("Getting Started with Java")).click();
//		String title = driver.getTitle();
//		assertThat(title, containsString("Getting Started on Heroku with Java"));

	}

	@Test
	public void test2() {

		driver.get("https://ancient-journey-46819.herokuapp.com/");

		//Source on GitHubをクリック
//		driver.findElement(By.linkText("Source on GitHub")).click();
		System.out.println(2);

	}


}
