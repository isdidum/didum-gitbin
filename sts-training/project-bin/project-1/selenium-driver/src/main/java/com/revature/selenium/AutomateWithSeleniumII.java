package com.revature.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**  
 * @author A., Didum
 * @version 0.0.2
 * @since Friday, October 22, 2021
 * @implNote Selenium WebDriver - Browser automation
 */
public class AutomateWithSeleniumII {
	
    /*
	 * Application entry point
	 */
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/jchromedriver/chromedriver.exe");
		
		// Configuring Chrome Browser
		WebDriver dr = new ChromeDriver();
		dr.get("http://localhost:8080");
		dr.manage().window().setPosition(new Point(300, 200));
		dr.manage().window().setSize( new Dimension(840,470) );
		
		try {
			//Use Selenium Locators to find elements
			dr.findElement(By.id("add-input1")).sendKeys("10.5"+Keys.ENTER); //uses explicit wait
			dr.findElement(By.id("add-input2")).sendKeys("12.25"+Keys.ENTER);
			new WebDriverWait(dr, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(By.id("add-btn"))).click();
			dr.switchTo().frame("add");
			println("Addition of (10.5 + 12.5) = "+dr.findElement(By.tagName("pre")).getText());
			dr.switchTo().defaultContent();
			
			//Use Selenium Locators to find elements
			dr.findElement(By.id("sub-input1")).sendKeys("10.5"+Keys.ENTER);
			dr.findElement(By.id("sub-input2")).sendKeys("12.75"+Keys.ENTER);
			new WebDriverWait(dr, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(By.id("sub-btn"))).click();
			dr.switchTo().frame("subtract");
			println("Subtraction of (10.5 - 12.5) = "+dr.findElement(By.tagName("pre")).getText());
			dr.switchTo().defaultContent();
			
			//Use Selenium Locators to find elements
			dr.findElement(By.id("pow-input1")).sendKeys("3.0"+Keys.ENTER);
			dr.findElement(By.id("pow-input2")).sendKeys("2.0"+Keys.ENTER);
			new WebDriverWait(dr, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(By.id("pow-btn"))).click();
			dr.switchTo().frame("power");
			println("Power of (3.0 ^ 2.0) = "+dr.findElement(By.tagName("pre")).getText());
			dr.switchTo().defaultContent();
			
			//Use Selenium Locators to find elements
			dr.findElement(By.id("mul-input1")).sendKeys("3.0"+Keys.ENTER);
			dr.findElement(By.id("mul-input2")).sendKeys("4.0"+Keys.ENTER);
			new WebDriverWait(dr, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(By.id("mul-btn"))).click();
			dr.switchTo().frame("multiply");
			println("Multiplication of (3.0 x 4.0) = "+dr.findElement(By.tagName("pre")).getText());
			dr.switchTo().defaultContent();
			
			//Use Selenium Locators to find elements
			dr.findElement(By.id("quo-input1")).sendKeys("9.0"+Keys.ENTER);
			dr.findElement(By.id("quo-input2")).sendKeys("2.0"+Keys.ENTER);
			new WebDriverWait(dr, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(By.id("quo-btn"))).click();
			dr.switchTo().frame("divide");
			println("Division of (9.0 / 2.0) = "+dr.findElement(By.tagName("pre")).getText());
			dr.switchTo().defaultContent();
					
			//Use Selenium Locators to find elements
			dr.findElement(By.id("exp-input1")).sendKeys("1.0"+Keys.ENTER);
			new WebDriverWait(dr, Duration.ofSeconds(25)).until(ExpectedConditions.elementToBeClickable(By.id("exp-btn"))).click();
			dr.switchTo().frame("exponent");
			println("Exponent of (1.0) = "+dr.findElement(By.tagName("pre")).getText());
			dr.switchTo().defaultContent();
			
			//-------------------		
			Thread.sleep(15000);
			//-------------------
		} finally {
			println("");
			dr.quit();
		}
	}
	
	/**
	 * println(): This is a static facilitator method that is used to print a new line
	 * 
	 * @param strings - accepts object-type variable arguments (var-args) as parameter
	 * @implNote To use, println(message)
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
