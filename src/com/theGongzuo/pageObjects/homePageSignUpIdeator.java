package com.theGongzuo.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePageSignUpIdeator {
	
	private static WebElement element = null;
	
	public static WebElement SignUpClick(WebDriver driver) {
		
		element = driver.findElement(By.xpath(".//*[@id='ucWelcome_dvSignIn']/ul/li[2]/a"));
		return element;
	}
	
	public static WebElement SignUpIdeator(WebDriver driver) {
		
		element = driver.findElement(By.xpath(".//*[@id='ucWelcome_dvSignIn']/ul/li[2]/ul/li[1]/a"));
		return element;
	}
	
	public static WebElement SignUpPageIdeator_FirstName(WebDriver driver) {
		
		element = driver.findElement(By.id("txtFirstName"));
		return element;
	}
	
	public static WebElement SignUpPageIdeator_LastName(WebDriver driver) {
		
		element = driver.findElement(By.id("txtLastName"));
		return element;
	}
	
	public static WebElement SignUpPageIdeator_Email(WebDriver driver) {
		
		element = driver.findElement(By.id("txtEmail"));
		return element;
	}
	
	public static WebElement SignUpPageIdeator_Password(WebDriver driver) {
		
		element = driver.findElement(By.id("txtPassword"));
		return element;
	}
	
	public static WebElement SignUpPageIdeator_ConfirmPassword(WebDriver driver) {
		
		element = driver.findElement(By.id("txtConfirmPassword"));
		return element;
	}
	
	public static WebElement SignUpPageIdeator_CaptchaValue(WebDriver driver) {
		
		element = driver.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_lblCaptcha']"));
		return element;
	}
	
	public static WebElement SignUpPageIdeator_Captcha(WebDriver driver) {
		
		element = driver.findElement(By.id("txtCaptchaValidate"));
		return element;
	}
	
	public static WebElement SignUpPageIdeator_clickAgree(WebDriver driver) {
		
		element = driver.findElement(By.xpath(".//*[@id='chkAcceptTerms']/div[1]/div"));
		return element;
	}
	
	public static WebElement SignUpIdeator_createAccount(WebDriver driver) {
		
		element = driver.findElement(By.id("btnSignUp"));
		return element;
	}
	
	
}
	
