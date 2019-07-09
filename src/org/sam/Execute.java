package org.sam;

import org.openqa.selenium.WebDriver;

public class Execute extends Employee {
	public static void main(String[] args) {
		WebDriver driver = getdriver();
		driver.manage().window().maximize();
		loadurl("https://www.redbus.in/");
		Loginpage page = new Loginpage();
		source(page.getSrc(), "Chennai");
		dest(page.getDes(), "Mayiladuthurai");
		
	}
}
