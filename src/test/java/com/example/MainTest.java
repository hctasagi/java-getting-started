
package com.example;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MainTest extends Main {

	private ChromeDriver driver;

	@BeforeClass
	public void setUp() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless", "--disable-gpu");

		driver = new ChromeDriver(options);

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void test1() throws InterruptedException {

		driver.get("https://ancient-journey-46819.herokuapp.com/");

		//Getting Started with Javaをクリック
		driver.findElement(By.linkText("Getting Started with Java")).click();

		//タイトルを取得
		System.out.println(driver.getTitle());


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

		System.out.println(driver.getTitle());

	}

}


