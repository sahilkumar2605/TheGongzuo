package com.theGongzuo.automationFramework;

import org.testng.annotations.Test;

import com.theGongzuo.pageObjects.homePageSignUpIdeator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class SignUpIdeatorTest {
	
  public static WebDriver driver = null; 
  
  
  @BeforeClass
  public void geturl() {
	  
	  driver = new FirefoxDriver();
	  driver.get("https://www.thegongzuo.com");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
  }
  
  @Test
  public void CreateAccountIdeator() {
	  
	  homePageSignUpIdeator.SignUpClick(driver).click();
	  homePageSignUpIdeator.SignUpIdeator(driver).click();
	  homePageSignUpIdeator.SignUpPageIdeator_FirstName(driver).sendKeys("Sahil");
	  homePageSignUpIdeator.SignUpPageIdeator_LastName(driver).sendKeys("Chumber");
	  homePageSignUpIdeator.SignUpPageIdeator_Email(driver).sendKeys("sahil.kumar2605@gmail.com");
	  homePageSignUpIdeator.SignUpPageIdeator_Password(driver).sendKeys("Nextgentech@123");
	  homePageSignUpIdeator.SignUpPageIdeator_ConfirmPassword(driver).sendKeys("Nextgentech@123");
	  String s = homePageSignUpIdeator.SignUpPageIdeator_CaptchaValue(driver).getText();
	  System.out.println(s);
	  
	  homePageSignUpIdeator.SignUpPageIdeator_clickAgree(driver).click();
	  homePageSignUpIdeator.SignUpIdeator_createAccount(driver).click();
	  
  }
  
 

}
