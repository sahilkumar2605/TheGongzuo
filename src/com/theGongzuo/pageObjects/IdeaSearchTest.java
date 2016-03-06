package com.theGongzuo.pageObjects;

import org.testng.annotations.Test;

import com.theGongzuo.automationFramework.IdeaSearch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class IdeaSearchTest {
	
	public static WebDriver driver = null;
	
	String Idea = "Review My Professor";
	
	
  @BeforeTest
  public void geturl()
  {
	  driver = new FirefoxDriver();
	  driver.get("https://www.thegongzuo.com");
  }
  
  @Test
  public void IdeaSearchT() {
	  
	  IdeaSearch.IdeaSearchClick(driver).click();
	  IdeaSearch.SearchIdeaTitle(driver).sendKeys(Idea);
	  IdeaSearch.SearchIdeaButton(driver).click();
	  IdeaSearch.SeachIdeaLogin(driver).sendKeys("sahilchumber69@gmail.com");
	  IdeaSearch.SearchIdeaPassword(driver).sendKeys("Nextgentech@123");
	  IdeaSearch.SearchIdeaLoginClick(driver).click();
	  
	  
  }

}
