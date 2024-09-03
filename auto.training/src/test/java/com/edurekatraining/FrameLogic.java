package com.edurekatraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameLogic {

	public static void main(String[] args) {

		// Create an instance of the ChromeDriver
		WebDriver driver = new ChromeDriver();

		// Step 1: Launch the URL and maximize the window
		driver.get("https://docs.oracle.com/javase/7/docs/api/");
		driver.manage().window().maximize();

		// Step 2: Switch focus to the package frame
		driver.switchTo().frame("packageFrame");

		// Step 3: Count the total number of links under packages
		int totalLinksUnderPackages = driver.findElements(By.tagName("a")).size();
		System.out.println("Total number of links under packages: " + totalLinksUnderPackages);

		// Step 4: Print all the link names under packages
		System.out.println("Link names under packages:");
		for (WebElement link : driver.findElements(By.tagName("a"))) {
			System.out.println(link.getText());
		}

		// Step 5: Count the total number of frames
		int totalFrames = driver.findElements(By.tagName("frame")).size();
		System.out.println("Total number of frames: " + totalFrames);

		// Step 6: Print all the link names from every frame
		for (int i = 0; i < totalFrames; i++) {
			driver.switchTo().defaultContent(); // Switch back to the main content
			driver.switchTo().frame(i);

			System.out.println("Link names from frame " + i + ":");
			for (WebElement link : driver.findElements(By.tagName("a"))) {
				System.out.println(link.getText());
			}
		}

		// Close the browser window
		driver.quit();
	}
}
