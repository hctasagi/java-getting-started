package com.example;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

@RunWith(ParallelParameterized.class)
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

	@Test
	public void test3() {

		driver.get("https://ancient-journey-46819.herokuapp.com/");

		System.out.println(3);

	}

}
