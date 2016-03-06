package com.theGongzuo.automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdvancedJobSearch {
	
	private static WebElement element = null;
	
	public static WebElement AdvancedJobSearchClick(WebDriver driver) {
		
		element = driver.findElement(By.xpath(".//*[@id='form1']/footer/div[1]/div/div/div[2]/div/ul/li[4]/a"));
		return element;
	}
	
	public static WebElement AdvancedJobLogin(WebDriver driver) {
		
		element = driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_txtUserId']"));
		return element;
	}
	
	public static WebElement AdvancedJobPassword(WebDriver driver) {
		
		element = driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_txtPassword']"));
		return element;
	}
	
	public static WebElement AdvancedJobLoginClick(WebDriver driver) {
		
		element = driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_btnlogin']"));
		return element;
	}
	
	public static WebElement JobKeywords(WebDriver driver) {
		
		element = driver.findElement(By.id("txtSkills"));
		return element;
	}
	
	public static WebElement FindJobNowButton(WebDriver driver) {
		
		element = driver.findElement(By.id("btnFindJobNow"));
		return element;
	}
	
	public static WebElement KeywordValidation(WebDriver driver) {
		
		element = driver.findElement(By.xpath(".//*[@id='ulAppAdvSearchkw']/p"));
		return element;
	}
	
	

}
