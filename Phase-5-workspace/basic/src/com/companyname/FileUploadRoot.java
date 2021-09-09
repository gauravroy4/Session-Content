package com.companyname;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadRoot {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.gecko.driver", "/home/roygaurav000gma/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();  //maximize the window
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);  //load the page within timeout
		driver.get("https://www.grammarly.com/plagiarism-checker");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0, 200)");
		
		Thread.sleep(2000);
		
		WebElement browse = driver.findElement(By.className("_3255a-uploadButton"));
		browse.click();
		Thread.sleep(2000);
		
		Robot rb = new Robot();
		
		StringSelection str = new StringSelection("/home/roygaurav000gma/Downloads/sample.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		

	}

}
