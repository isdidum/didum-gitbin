package com.revature.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateWithSelenium {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/jchromedriver/chromedriver.exe");
		
		WebDriver dr = new ChromeDriver();
		dr.get("http://localhost:8080");
				
		//Use Selenium Locators to find elements
		WebElement add1 = dr.findElement(By.id("add-input1"));
		WebElement add2 = dr.findElement(By.id("add-input2"));
		WebElement addButton = dr.findElement(By.id("add-btn"));
		add1.sendKeys("10.5"); //writes 10.5 into first input element
		add2.sendKeys("12.5"); //writes 12.5 into the 2nd input element
		addButton.click(); //clicks the buttons
				
		//Use Selenium Locators to find elements
		WebElement sub1 = dr.findElement(By.id("sub-input1"));
		WebElement sub2 = dr.findElement(By.id("sub-input2"));
		WebElement subButton = dr.findElement(By.id("sub-btn"));
		sub1.sendKeys("10.5");
		sub2.sendKeys("12.5");
		subButton.click();
				
		//Use Selenium Locators to find elements
		WebElement pow1 = dr.findElement(By.id("pow-input1"));
		WebElement pow2 = dr.findElement(By.id("pow-input2"));
		WebElement powButton = dr.findElement(By.id("pow-btn"));
		pow1.sendKeys("3.0"); //writes 10.5 into first input element
		pow2.sendKeys("2.0"); //writes 12.5 into the 2nd input element
		powButton.click(); //clicks the buttons
				
		//Use Selenium Locators to find elements
		WebElement mul1 = dr.findElement(By.id("mul-input1"));
		WebElement mul2 = dr.findElement(By.id("mul-input2"));
		WebElement mulButton = dr.findElement(By.id("mul-btn"));
		mul1.sendKeys("3.0");
		mul2.sendKeys("2.0");
		mulButton.click();
				
		//Use Selenium Locators to find elements
		WebElement quo1 = dr.findElement(By.id("quo-input1"));
		WebElement quo2 = dr.findElement(By.id("quo-input2"));
		WebElement quoButton = dr.findElement(By.id("quo-btn"));
		quo1.sendKeys("9.0");
		quo2.sendKeys("2.0");
		quoButton.click();
				
		//Use Selenium Locators to find elements
		WebElement exp1 = dr.findElement(By.id("exp-input1"));
		WebElement expButton = dr.findElement(By.id("exp-btn"));
		exp1.sendKeys("1.0");
		expButton.click();
				
		Thread.sleep(10000); 
		dr.quit();
	}

}
