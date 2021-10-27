package com.revature.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomateWithSeleniumII {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/jchromedriver/chromedriver.exe");
		
		WebDriver dr = new ChromeDriver();
		dr.get("http://localhost:8080");
		dr.manage().window().setPosition(new Point(300, 200));
		dr.manage().window().setSize( new Dimension(840,470) );
		
		try {
			//Use Selenium Locators to find elements
			dr.findElement(By.id("add-input1")).sendKeys("10.5"+Keys.ENTER); //uses explicit wait
			dr.findElement(By.id("add-input2")).sendKeys("12.25"+Keys.ENTER);
			new WebDriverWait(dr, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(By.id("add-btn"))).click();
			// if success, repeat for the rest
			println("Addition of (10.5 + 12.5) = "+dr.findElement(By.id("i-add")).getText());
			dr.switchTo().frame("i-add");
			dr.switchTo().defaultContent();
			
			//Use Selenium Locators to find elements
			dr.findElement(By.id("sub-input1")).sendKeys("10.5"+Keys.ENTER);
			dr.findElement(By.id("sub-input2")).sendKeys("12.75"+Keys.ENTER);
			new WebDriverWait(dr, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(By.id("sub-btn"))).click();
			println("Subtraction of (10.5 - 12.5) = "+dr.findElement(By.name("subtract")).getText());
			
			//Use Selenium Locators to find elements
			dr.findElement(By.id("pow-input1")).sendKeys("3.0"+Keys.ENTER);
			dr.findElement(By.id("pow-input2")).sendKeys("2.0"+Keys.ENTER);
			new WebDriverWait(dr, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(By.id("pow-btn"))).click();
			println("Power of (3.0 + 2.0) = "+dr.findElement(By.name("power")).getText());
			
			//Use Selenium Locators to find elements
			dr.findElement(By.id("mul-input1")).sendKeys("3.0"+Keys.ENTER);
			dr.findElement(By.id("mul-input2")).sendKeys("4.0"+Keys.ENTER);
			new WebDriverWait(dr, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(By.id("mul-btn"))).click();
			println("Multiplication of (10.5 + 12.5) = "+dr.findElement(By.name("multiply")).getText());
					
			//Use Selenium Locators to find elements
			dr.findElement(By.id("quo-input1")).sendKeys("9.0"+Keys.ENTER);
			dr.findElement(By.id("quo-input2")).sendKeys("2.0"+Keys.ENTER);
			new WebDriverWait(dr, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(By.id("quo-btn"))).click();
			println("Division of (9.0 / 2.0) = "+dr.findElement(By.name("divide")).getText());
					
			//Use Selenium Locators to find elements
			dr.findElement(By.id("exp-input1")).sendKeys("1.0"+Keys.ENTER);
			new WebDriverWait(dr, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(By.id("exp-btn"))).click();
			println("Exponent of (1.0) = "+dr.findElement(By.name("exponent")).getText());
			
			//-------------------		
			Thread.sleep(15000);
			//-------------------
		} finally {
			println("");
			dr.quit();
		}
	}
	
	/**
	 * println(): Facilitator prints a new line (this is a static method)
	 * 
	 * @implNote To use, println(...)
	 * @param strings - accepts object-type variable arguments (var-args) as parameter
	 */
	public static void println(Object...strings) {
		try {
			for(Object obj : strings) {
				System.out.println(obj);
			}
		} catch(Exception err) {
			err.printStackTrace();
		}
	}

}
