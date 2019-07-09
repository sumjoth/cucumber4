package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends Employee {
	public Loginpage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "src")
	private WebElement src;
	@FindBy(id = "dest")
	private WebElement des;

	public WebElement getSrc() {
		return src;
	}

	public void setSrc(WebElement src) {
		this.src = src;
	}

	public WebElement getDes() {
		return des;
	}

	public void setDes(WebElement des) {
		this.des = des;
	}

}
