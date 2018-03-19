package com.h2k.rmnot.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {


	WebDriver driver; 

	public HomePage(WebDriver driver) {
		this.driver=driver;
	}

	public SpringDealsPage navigateToSpringDeals() throws InterruptedException
	{
		
		//Click on Spring Deals
		driver.findElement(By.xpath("//nav/ul/li[5]/a/span")).click();
		SpringDealsPage dealsPage = new SpringDealsPage(driver);
		return dealsPage;

	}
}
