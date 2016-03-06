package com.theGongzuo.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePageSignUpBusiness {
	
	private static WebElement element = null;
	
	public static WebElement SignUpClick(WebDriver driver) {
		
		element = driver.findElement(By.xpath(".//*[@id='ucWelcome_dvSignIn']/ul/li[2]/a"));
		return element;
	}
	
	public static WebElement SignUpBusiness(WebDriver driver) {
		
		element = driver.findElement(By.xpath(".//*[@id='ucWelcome_dvSignIn']/ul/li[2]/ul/li[2]/a"));
		return element;
	}
	
	public static WebElement SignUp_firstName(WebDriver driver) {
		
		element = driver.findElement(By.id("TxtFirstName"));
		return element;
	}
	
	public static WebElement SignUp_lastName(WebDriver driver) {
		
		element = driver.findElement(By.id("TxtLastName"));
		return element;
	}
	
	public static WebElement SignUp_businessName(WebDriver driver) {
		
		element = driver.findElement(By.id("txtCompanyName"));
		return element;
	}
	
	public static WebElement SignUp_businessEmail(WebDriver driver) {
		
		element = driver.findElement(By.id("TxtEmail"));
		return element;
	}
	
	public static WebElement SignUp_userId(WebDriver driver) {
		
		element = driver.findElement(By.id("txtUsername1"));
		return element;
	}
	
	public static WebElement SignUp_password(WebDriver driver) {
		
		element = driver.findElement(By.id("pwdUser1"));
		return element;
	}
	
	public static WebElement SignUp_phoneNum(WebDriver driver) {
		
		element = driver.findElement(By.xpath(".//*[@id='TxtMainPhone']/input"));
		return element;
	}

	public static WebElement SignUp_phoneExt(WebDriver driver) {
		
		element = driver.findElement(By.id("txtExt"));
		return element;
	}
	
	public static WebElement SignUp_businessAddress(WebDriver driver) {
		
		element = driver.findElement(By.id("TxtAddress"));
		return element;
	}
	public static WebElement SignUp_businessState(WebDriver driver) {
		
		element = driver.findElement(By.id("txtState"));
		return element;
	}
	
	public static WebElement SignUp_businessCity(WebDriver driver) {
		
		element = driver.findElement(By.id("txtCity"));
		return element;
	}
	
	public static WebElement SignUp_Zip(WebDriver driver) {
		
		element = driver.findElement(By.id("txtZipCode"));
		return element;
	}
	
	public static WebElement SignUp_agree(WebDriver driver) {
		
		element = driver.findElement(By.xpath(".//*[@id='chkAcceptTerms']/div[1]/div"));
		return element;
	}
	
	public static WebElement SignUp_createAccount(WebDriver driver) {
		
		element = driver.findElement(By.id("btnPayment"));
		return element;
	}
	
}

