package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity {

	public static void main(String[] args) {
     
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/Selenium");
		
		WebElement xpathLocator = driver.findElement(By.xpath("//button[contains(@class, 'blue')]"));
		
        System.out.println(xpathLocator.getText());
        
        xpathLocator.click();
        
        WebElement heading = driver.findElement(By.xpath("//div[contains(@class, 'content')]"));
        
        System.out.println(heading.getText());
       
        
        driver.close();
	}

}
