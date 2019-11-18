package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopPage extends BasePage{

	//ロゴ
	@FindBy(className = "lang-logo")
	private WebElement logo;

	//リンク
	@FindBy(linkText = "Source on GitHub")
	private WebElement link;

	public TopPage (WebDriver driver) {
		super(driver);
	}

	//リンクをクリック
	public void link() {
		link.click();
	}
}
