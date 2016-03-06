package com.theGongzuo.automationFramework;

import org.testng.annotations.Test;

import com.theGongzuo.pageObjects.homePageSignInIdeator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class SignInIdeatorTest {
  

	public static WebDriver driver = null;
	
  @BeforeTest
  public void geturl() {
	  
	  driver = new FirefoxDriver();
	  driver.get("https://www.thegongzuo.com");
	  
  }
  
  @Test
  public void SignInIdeator() {
	  
	  homePageSignInIdeator.SignInClick(driver).click();
	  homePageSignInIdeator.SignInIdeator(driver).click();
	  homePageSignInIdeator.SignIn_Email(driver).sendKeys("sahilchumber69@gmail.com");
	  homePageSignInIdeator.SignIn_Password(driver).sendKeys("Nextgentech@123");
	  homePageSignInIdeator.SignIn_LogIn(driver).click();
  }
  

}
