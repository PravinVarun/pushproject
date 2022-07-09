package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pravi\\eclipse-workspace\\Sample\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		
		WebElement scrollDown = driver.findElement(By.xpath("(//span[contains(text(),'Greens')])[7]"));
		WebElement scrollUp = driver.findElement(By.xpath("//img[@alt='software training institute in chenni']"));
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", scrollDown);
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView(false)", scrollUp);
	}

}
