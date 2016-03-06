package com.theGongzuo.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.*;

public class candidatePostIdea {
	
	private static WebElement element = null;
	
	public static WebElement postIdea(WebDriver driver) {
		
		element = driver.findElement(By.xpath(".//*[@id='form1']/footer/div[1]/div/div/div[2]/div/ul/li[1]/a"));
		return element;
	}
	
	public static WebElement emailAddress(WebDriver driver) {
		
		element = driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_txtUserId']"));
		return element;
	}
	
	public static WebElement password(WebDriver driver) {
		
		element = driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_txtPassword']"));
		return element;
	}
	
	public static WebElement loginButton(WebDriver driver) {
		
		element = driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_btnlogin']"));
		return element;
	}
	
	public static WebElement IdeaTitle(WebDriver driver) {
		
		element = driver.findElement(By.id("txtIdeaTitle"));
		return element;
	}
	
	public static WebElement IdeaCategory(WebDriver driver) {
		
		element = driver.findElement(By.xpath(".//*[@id='dropdownlistArrowddlIdeaCategory']/div"));
		return element;
	}
	
	public static WebElement IdeaCategorySelector(WebDriver driver) {
		
		element = driver.findElement(By.id("listitem2innerListBoxddlIdeaCategory"));
		return element;
	}
	
	public static WebElement ShareIdea(WebDriver driver) {
		
		element = driver.findElement(By.id("txtShareIdea"));
		return element;
	}
	
	public static WebElement IdeaSkills(WebDriver driver) {
		
		element = driver.findElement(By.id("txtIdeaSkill"));
		return element;
	}
	
	public static WebElement PostIdeaNow(WebDriver driver) {
		
		element = driver.findElement(By.id("btnPromoteIdea"));
		return element;
	}

}
