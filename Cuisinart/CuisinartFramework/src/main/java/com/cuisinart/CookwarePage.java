package com.cuisinart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CookwarePage extends CategoryPage{
	
	@FindBy(how = How.CSS, using = "h1.text-uppercase")
	WebElement pageElement;

	@Override
	public void goTo() {
		
		String xp = "//h3[contains(.,'Cookware')]";
		
		Browser.driver.findElement(By.xpath(xp))
		.click();
		
	}

	@Override
	public String categoryName() {	
		String pgElement = pageElement.getText();
		return pgElement;
		
	}
}
