package org.sam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Employee {
	static WebDriver driver;

	public static WebDriver getdriver() {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Company\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}

	public static void loadurl(String url) {
		driver.get(url);

	}

	public static void source(WebElement a, String name) {
		a.sendKeys(name);

	}

	public static void dest(WebElement b, String name1) {
		b.sendKeys(name1);

	}

}
