package com.test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {
	
	WebDriver driver;
  @BeforeMethod
  public void start() {
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	    
  }
  
  @Test
  public void loginTest() {
	  
	  driver.get("https://www.google.com/");
	  Assert.assertEquals(driver.getTitle(), "Google");
	  driver.close();
	  
	  
  }
}
