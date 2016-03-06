package com.theGongzuo.automationFramework;

import org.testng.annotations.Test;

import com.theGongzuo.pageObjects.candidatePostIdea;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class postIdeaTest {
	
	public static WebDriver driver = null;
	
  @BeforeTest
  public void geturl() {
	  
	  driver = new FirefoxDriver();
	  driver.get("https://www.thegongzuo.com");
	  
  }
  
  @Test
  public void postCandidateT() {
	  
	  candidatePostIdea.postIdea(driver).click();
	  candidatePostIdea.emailAddress(driver).sendKeys("sahilchumber69@gmail.com");
	  candidatePostIdea.password(driver).sendKeys("Nextgentech@123");
	  candidatePostIdea.loginButton(driver).click();
	  candidatePostIdea.IdeaTitle(driver).sendKeys("Review My Professor");
	  candidatePostIdea.IdeaCategory(driver).click();
	  candidatePostIdea.IdeaCategorySelector(driver).click();
	  candidatePostIdea.ShareIdea(driver).sendKeys("A review My Professor iPhone & Android App");
	  candidatePostIdea.IdeaSkills(driver).sendKeys("iOS Developer / Android Developer");
	  candidatePostIdea.PostIdeaNow(driver).click();
	 
  }

}
