package com.theGongzuo.pageObjects;

import org.testng.annotations.Test;

import com.theGongzuo.automationFramework.AdvancedJobSearch;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class AdvancedJobTest {
 
	public static WebDriver driver = null;
	
	
  @BeforeTest
  
  public void geturl() {
	  
	  driver = new FirefoxDriver();
	  driver.get("https://www.thegongzuo.com");
  }
  
  @Test
  public void AdvancedJobTestT() {
	  
	  AdvancedJobSearch.AdvancedJobSearchClick(driver).click();
	  AdvancedJobSearch.AdvancedJobLogin(driver).sendKeys("sahilchumber69@gmail.com");
	  AdvancedJobSearch.AdvancedJobPassword(driver).sendKeys("Nextgentech@123");
	  AdvancedJobSearch.AdvancedJobLoginClick(driver).click();
	  AdvancedJobSearch.JobKeywords(driver).sendKeys("Software Engineer");
	  AdvancedJobSearch.FindJobNowButton(driver).click();
	  
	  String v = AdvancedJobSearch.KeywordValidation(driver).getText();
	  
	  Assert.assertEquals(v, "Keyword: Software Engineer");
  }

  
  
}
