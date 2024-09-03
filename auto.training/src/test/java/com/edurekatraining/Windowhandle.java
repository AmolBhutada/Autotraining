package com.edurekatraining;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;



public class Windowhandle 
{
	

	   public static void main(String[] args) {
	        

	        // Create a new instance of the ChromeDriver
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        // Task: Launch the website https://demoqa.com/browser-windows
	        driver.get("https://demoqa.com/browser-windows");

	        // Task 1: Click on New Tab, New Window, and New Window Message
	         WebElement newTabButton = driver.findElement(By.id("tabButton"));
	         WebElement newWindowButton = driver.findElement(By.id("windowButton"));
	         //WebElement newWindowMessageButton = driver.findElement(By.xpath("messageWindowButton"));

	         
	         
	        newTabButton.click();
	        newWindowButton.click();
	        //newWindowMessageButton.click();

	        //Task 2: Print the list of window handles for all the newly opened tabs
	        Set<String> windowHandles = driver.getWindowHandles();
	        System.out.println("Window Handles: " + windowHandles);

	        // Task 3: Print the total window count size
	        int totalWindows = windowHandles.size();
	        System.out.println("Total Window Count: " + totalWindows);

	        // Enhancements for code: Validate if window handles are unique
	        if (totalWindows == windowHandles.stream().distinct().count()) {
	            System.out.println("All Window Handles are Unique.");
	        } else {
	            System.out.println("Duplicate Window Handles Found!");
	        }

	        // Close the browser window
	        driver.quit();
	        
	    }
	}


