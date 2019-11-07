package com.example;


import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class MainTest extends Main {

	@Test
	public void test1() {

		System.setProperty("webdriver.chrome.driver", "/app/.chromedriver/bin/chromedriver");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless", "--disable-gpu");

		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://ancient-journey-46819.herokuapp.com/");

		//タイトルを取得
		System.out.println(driver.getTitle());

		//Getting Started with Javaをクリック
		driver.findElement(By.linkText("Getting Started with Java")).click();
		String title = driver.getTitle();
		assertThat(title, containsString("Getting Started on Heroku with Java"));

		driver.close();

	}

}
