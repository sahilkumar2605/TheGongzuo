package com.theGongzuo.automationFramework;

import org.testng.annotations.Test;

import com.theGongzuo.pageObjects.homePageSignUpBusiness;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class SignUpBusinessTest {
	
	public static WebDriver driver = null;
	
  @BeforeTest
  public void geturl() {
	  
	  driver = new FirefoxDriver();
	  driver.get("https://www.thegongzuo.com");
	 
  }
  
  @Test
  
  public void SignUpBusiness() {
	  
	  homePageSignUpBusiness.SignUpClick(driver).click();
	  homePageSignUpBusiness.SignUpBusiness(driver).click();
	  homePageSignUpBusiness.SignUp_firstName(driver).sendKeys("Sahil");
	  homePageSignUpBusiness.SignUp_lastName(driver).sendKeys("C");
	  homePageSignUpBusiness.SignUp_businessName(driver).sendKeys("Nextgen Technologies");
	  homePageSignUpBusiness.SignUp_businessEmail(driver).sendKeys("mike@nextgentechninc.com");
	  homePageSignUpBusiness.SignUp_userId(driver).sendKeys("sahil.nextgen");
	  homePageSignUpBusiness.SignUp_password(driver).sendKeys("Nextgen@7.");
	  homePageSignUpBusiness.SignUp_phoneNum(driver).sendKeys("408-441-0993");
	  homePageSignUpBusiness.SignUp_phoneExt(driver).sendKeys("111");
	  homePageSignUpBusiness.SignUp_businessAddress(driver).sendKeys("1735 N 1st St #285");
	  homePageSignUpBusiness.SignUp_businessState(driver).sendKeys("California");
	  homePageSignUpBusiness.SignUp_businessCity(driver).sendKeys("San Jose");
	  homePageSignUpBusiness.SignUp_Zip(driver).sendKeys("95112");
	  homePageSignUpBusiness.SignUp_agree(driver).click();
	  homePageSignUpBusiness.SignUp_createAccount(driver).click();
	  
	  
  }

}
