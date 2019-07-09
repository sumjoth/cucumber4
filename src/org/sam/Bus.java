package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Bus extends Employee {
	public static void main(String[] args) {
		WebDriver driver = getdriver();
		loadurl("https://www.redbus.in/");
		WebElement text = driver.findElement(By.id("src"));
		source(text, "Chennai");
		WebElement text1 = driver.findElement(By.id("dest"));
		dest(text1, "Mayiladuthurai");

	}
}
