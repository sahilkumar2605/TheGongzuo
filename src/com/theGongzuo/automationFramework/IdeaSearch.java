package com.theGongzuo.automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IdeaSearch {
	
	private static WebElement element = null;
	
	public static WebElement IdeaSearchClick(WebDriver driver) {
		
		element = driver.findElement(By.xpath(".//*[@id='form1']/footer/div[1]/div/div/div[2]/div/ul/li[2]/a"));
		return element;
	}
	
	public static WebElement SearchIdeaTitle(WebDriver driver) {
		
		element = driver.findElement(By.id("txtIdeaKeyword"));
		return element;
	}
	
	public static WebElement SearchIdeaButton(WebDriver driver) {
		
		element = driver.findElement(By.id("btnIdeaBasicSearch"));
		return element;
	}
	
	public static WebElement SeachIdeaLogin(WebDriver driver) {
		
		element = driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_txtUserId']"));
		return element;
	}
	
	public static WebElement SearchIdeaPassword(WebDriver driver) {
		
		element = driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_txtPassword']"));
		return element;
	}
	
	public static WebElement SearchIdeaLoginClick(WebDriver driver) {
		
		element = driver.findElement(By.id("ContentPlaceHolder1_btnlogin"));
		return element;
	}
	
	

}
