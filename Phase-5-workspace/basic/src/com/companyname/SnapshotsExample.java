package com.companyname;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SnapshotsExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "/home/roygaurav000gma/Downloads/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.flipkart.com");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File scr = ts.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(scr, new File("/home/roygaurav000gma/Downloads/ScreenShots/screenshot.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
