package com.edurekatraining;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {

	
      public static void main(String[] args) {
	        
	        // Create a new instance of the ChromeDriver
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        // Task 1: Launch https://www.rediff.com/ and click on the Sign in link
	        driver.get("https://www.rediff.com/");
	        WebElement signInLink = driver.findElement(By.className("signin"));
	        signInLink.click();
	        // Task 2: Click on the Sign in button without entering username and password
	        WebElement signInButton = driver.findElement(By.name("proceed"));
	        signInButton.click();
	        

	        // Handle the alert
	        Alert alert = driver.switchTo().alert();
	        System.out.println("Alert Text: " + alert.getText());
	        alert.accept();

	        // Close the browser window
	        driver.quit();
	    }
	}





	
	
	
	

