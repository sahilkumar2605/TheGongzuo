package com.theGongzuo.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePageSignInIdeator {
	
	private static WebElement element = null;
	
	public static WebElement SignInClick(WebDriver driver) {
		
		element = driver.findElement(By.xpath(".//*[@id='ucWelcome_dvSignIn']/ul/li[1]/a"));
		return element;
	}
	
	public static WebElement SignInIdeator(WebDriver driver) {
		
		element = driver.findElement(By.xpath(".//*[@id='ucWelcome_dvSignIn']/ul/li[1]/ul/li[1]/a"));
		return element;
	}
	
	public static WebElement SignIn_Email(WebDriver driver) {
		
		element = driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_txtUserId']"));
		return element;
	}
	
	public static WebElement SignIn_Password(WebDriver driver) {
		
		element = driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_txtPassword']"));
		return element;
	}

	public static WebElement SignIn_LogIn(WebDriver driver) {
		
		element = driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_btnlogin']"));
		return element;
	}
}
