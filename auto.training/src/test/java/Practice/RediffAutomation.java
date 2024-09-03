package Practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class RediffAutomation 
{
	
	
             public static void main(String[] args) {
		        // Create a new instance of the ChromeDriver
		        WebDriver driver = new ChromeDriver();

		        // Navigate to the Rediff.com website
		        driver.get("https://www.rediff.com/");
		        driver.manage().window().maximize();
		        
		        
		     // Task 1
		     // A) Inspect with class locator
		     driver.findElement(By.className("moneyicon")).click();

		     // B) Inspect with XPath locator
		     driver.findElement(By.xpath("//a[text()='Money']")).click();

		     // C) Inspect with CSS locator
		     driver.findElement(By.cssSelector("a[title='Money']"));
		    
		    // Task 2
	        // A) Inspect with name locator
		     
		      driver.findElements(By.name("srchquery_tbox"));
		      
		      // B) Inspect with id locator
		      driver.findElement(By.id("textboxId"));
		      
		      
		   // Task 3
		        // A) Inspect the mentioned elements
		        driver.findElement(By.linkText("Rediffmail.com"));
		        driver.findElement(By.linkText("Enterprise Email"));
		        
		        // Task 4
		        // Inspect the "Sign In" link and click on it
		        driver.findElement(By.linkText("Sign In"));
		        
		       

		        // Close the browser window
		        driver.quit();
		      
		        
		        
	      }
	}


