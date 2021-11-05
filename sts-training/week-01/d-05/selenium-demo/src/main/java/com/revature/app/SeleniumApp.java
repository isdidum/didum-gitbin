package com.revature.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumApp {

	public static void main(String[] args) throws InterruptedException {
		// specify the location of the web-driver, to start using selenium webdriver
		System.setProperty("webdriver.chrome.driver", "C:/jchromedriver/chromedriver.exe");
		
		//instantiate the Chrome web-driver...web-driver is imported from the dependency in prox.xml file
		WebDriver dr = new ChromeDriver();
		
		//navigate to google website, now right-right here --> Run As --> Java Application
		//this opens up a browser, which says, "Chrome is being controlled by automated test software."
		//dr.get("http://google.com");
		
		//start up CalcApplication.java and run as Java Application
		//then run this file as Java Application
		dr.get("http://localhost:8080");
		
		//Use Selenium Locators to find elements
		WebElement add1 = dr.findElement(By.id("add-input1"));
		WebElement add2 = dr.findElement(By.id("add-input2"));
		WebElement addButton = dr.findElement(By.id("add-btn"));
		
		add1.sendKeys("10.5"); //writes 10.5 into first input element
		add2.sendKeys("12.5"); //writes 12.5 into the 2nd input element
		
		addButton.click(); //clicks the buttons
		
		Thread.sleep(5000); //pauses chrome-browser for a 5-seconds
		// this process namely terminates the process in windows-task, hence, frees memory
		dr.quit(); //
	}

}
