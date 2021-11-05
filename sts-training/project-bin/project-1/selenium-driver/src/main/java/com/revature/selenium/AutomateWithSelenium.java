package com.revature.selenium;

//import org.openqa.selenium.firefox.FirefoxDriver; ... don't have this driver setup
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.didum.callable.CallableUtil;

public class AutomateWithSelenium {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/jchromedriver/chromedriver.exe");
		//CallableUtil out = new CallableUtil();
		
		WebDriver dr = new ChromeDriver();
		dr.get("http://localhost:8080");
		dr.manage().window().setPosition(new Point(300, 200));
		dr.manage().window().setSize( new Dimension(840,470) );
		
		//Use Selenium Locators to find elements
		WebElement add1 = dr.findElement(By.id("add-input1"));
		WebElement add2 = dr.findElement(By.id("add-input2"));
		WebElement addButton = dr.findElement(By.id("add-btn"));
		add1.sendKeys("10.5"); //writes 10.5 into first input element
		add2.sendKeys("12.5"); //writes 12.5 into the 2nd input element
		addButton.click(); //clicks the buttons
		//String sum = dr.findElement(By.name("add")).getAttribute("name");
		//String sum = dr.findElement(By.tagName("iframe")).getText();
		//String sum = dr.findElement(By.name("add")).getText();
		//println("Addition of (10.5 + 12.5) = "+sum); //System.out.println
		
		//Use Selenium Locators to find elements
		WebElement sub1 = dr.findElement(By.id("sub-input1"));
		WebElement sub2 = dr.findElement(By.id("sub-input2"));
		WebElement subButton = dr.findElement(By.id("sub-btn"));
		sub1.sendKeys("10.5");
		sub2.sendKeys("12.5");
		subButton.click();
		//String sub = dr.findElement(By.name("subtract")).getText();
		//println("Subtraction of (10.5 - 12.5) = "+sub);
		
		//Use Selenium Locators to find elements
		WebElement pow1 = dr.findElement(By.id("pow-input1"));
		WebElement pow2 = dr.findElement(By.id("pow-input2"));
		WebElement powButton = dr.findElement(By.id("pow-btn"));
		pow1.sendKeys("3.0"); //writes 10.5 into first input element
		pow2.sendKeys("2.0"); //writes 12.5 into the 2nd input element
		powButton.click(); //clicks the buttons
		//String pow = dr.findElement(By.name("power")).getText();
		//println("Power of (3.0 + 2.0) = "+pow);
				
		//Use Selenium Locators to find elements
		WebElement mul1 = dr.findElement(By.id("mul-input1"));
		WebElement mul2 = dr.findElement(By.id("mul-input2"));
		WebElement mulButton = dr.findElement(By.id("mul-btn"));
		mul1.sendKeys("3.0");
		mul2.sendKeys("2.0");
		mulButton.click();
		//String mul = dr.findElement(By.name("multiply")).getText();
		//println("Multiplication of (10.5 + 12.5) = "+mul);
				
		//Use Selenium Locators to find elements
		WebElement quo1 = dr.findElement(By.id("quo-input1"));
		WebElement quo2 = dr.findElement(By.id("quo-input2"));
		WebElement quoButton = dr.findElement(By.id("quo-btn"));
		quo1.sendKeys("9.0");
		quo2.sendKeys("2.0");
		quoButton.click();
		//String quo = dr.findElement(By.name("divide")).getText();
		//println("Division of (9.0 / 2.0) = "+quo); 
				
		//Use Selenium Locators to find elements
		WebElement exp1 = dr.findElement(By.id("exp-input1"));
		WebElement expButton = dr.findElement(By.id("exp-btn"));
		exp1.sendKeys("1.0");
		expButton.click();
		//String exp = dr.findElement(By.name("exponent")).getText();
		//println("Exponent of (1.0) = "+exp);
		//-------------------		
		Thread.sleep(20000);
		//-------------------
		
		//Addition: console statement
		dr.switchTo().frame("add");
		String sum = dr.findElement(By.name("add")).getText();
		println("Addition of (10.5 + 12.5) = "+sum);
		
		//Subtraction
		dr.switchTo().frame("subtract");
		String sub = dr.findElement(By.name("subtract")).getText();
		println("Subtraction of (10.5 - 12.5) = "+sub);
		
		//Power
		dr.switchTo().frame("power");
		String pow = dr.findElement(By.name("power")).getText();
		println("Power of (3.0 + 2.0) = "+pow);
		
		//Multiplication
		dr.switchTo().frame("multiply");
		String mul = dr.findElement(By.name("multiply")).getText();
		println("Multiplication of (10.5 + 12.5) = "+mul);
		
		//Division
		dr.switchTo().frame("divide");
		String quo = dr.findElement(By.name("divide")).getText();
		println("Division of (9.0 / 2.0) = "+quo);
		
		//Exponent
		dr.switchTo().frame("exponent");
		String exp = dr.findElement(By.name("exponent")).getText();
		println("Exponent of (1.0) = "+exp); //System.out.println
		
		dr.quit();
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
