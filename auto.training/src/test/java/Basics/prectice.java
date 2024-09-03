package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prectice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("www.facebook.com");
	
		driver.manage().window().maximize();
		
		
		
	}
}
