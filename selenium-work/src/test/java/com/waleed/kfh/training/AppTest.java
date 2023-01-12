package com.waleed.kfh.training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest{
	
	@Test
	void testLogin() throws InterruptedException {
//		Load the Driver
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
		
		WebDriver theDriver = new ChromeDriver();
		
//		Open the page for testing
		String urlToTest = "http://the-internet.herokuapp.com/login";
		theDriver.get(urlToTest);
		System.out.println("Internet Login page opened");
		
		Assert.assertEquals("http://the-internet.herokuapp.com/login",
				urlToTest);
		
		
		
		
//		Enter username automatically : by id
		WebElement userName = theDriver.findElement(By.id("username"));
		userName.sendKeys("tomsmith");
		
//		Enter password automatically : by id
		WebElement userPassword = theDriver.findElement(By.id("password"));
		userPassword.sendKeys("SuperSecretPassword!");
		
//		Click the login button automatically : by xpath
		WebElement loginButton = theDriver.findElement(By.tagName("button"));
		Assert.assertTrue(loginButton.isDisplayed(), "The login button isn't displayed");
		loginButton.click();
		
		System.out.println("Login success, navigating to the success page now...");
		
//		Logout button : by xpath
		
		WebElement logoutButton = theDriver.findElement(By.xpath("//a[@class='button secondary radius']"));
		
//		success message after login : by cssSelector
		WebElement successMessage = theDriver.findElement(By.cssSelector("#flash"));
		
		String actualMessage = successMessage.getText();
		Assert.assertTrue(actualMessage.contains("securesssss"), "Actual and expected success messages aren't the same");
		
		System.out.println("Testing complete, closing down the browser now...");
		
		
//	Close the browser
		theDriver.close();

	}
}
