package Examples;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11d {
    public static void main(String[] args) {
    	
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, 5);
           
        driver.get("https://www.training-support.net/selenium/tab-opener");
          
        System.out.println("Page title is: " + driver.getTitle());
         
        //Get parent window handle
         String parentWindow = driver.getWindowHandle();
         System.out.println("Parent Window: " + parentWindow);

         //Find link to open new tab and click it
         driver.findElement(By.linkText("Click Me!")).click();
         wait.until(ExpectedConditions.numberOfWindowsToBe(2));
          
         //Get Window handles
            


        
    }
    
}