package ruturaj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//import org.openqa.selenium.firefox.FirefoxDriver;

public class Rutu {  
	  
    public static void main(String[] args) {  
        
    	// declaration and instantiation of objects/variables  
	    System.setProperty("webdriver.chrome.driver", "G:\\Velocity Software Class\\Chromedrivers\\chromedriver_win32\\chromedriver.exe");  
	    ChromeOptions ops = new ChromeOptions();
	    
	    ops.addArguments("--remote-allow-origins=*");
	    
	    WebDriver driver = new ChromeDriver(ops);  
	      
	    // Launch website  
	    driver.navigate().to("http://www.google.com/");  
	          
	    // Click on the search text box and send value  
	    driver.findElement(By.id("lst-ib")).sendKeys("javatpoint tutorials");  
	          
	    // Click on the search button  
	    driver.findElement(By.name("btnK")).click();  
      
    }  
  
}  


    
