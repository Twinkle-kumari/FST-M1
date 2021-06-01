package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity10c {

	public static void main(String[] args) {
     WebDriver driver = new FirefoxDriver();
     
     WebDriverWait wait = new WebDriverWait(driver, 10);
        
        driver.get("https://www.training-support.net/selenium/drag-drop");
        
        String Title = driver.getTitle();
        System.out.println("The Title of the page is:"  +Title);
        
        //wait for the ball to load
        wait.until(ExpectedConditions.elementToBeClickable(By.id("draggable")));
        
        WebElement ball = driver.findElement(By.id("draggable"));
        WebElement drop1 = driver.findElement(By.id("droppable"));
        WebElement drop2 = driver.findElement(By.id("dropzone2"));

        Actions dragdrop = new Actions(driver);
        
        dragdrop.dragAndDrop(ball, drop1).build().perform();
        
        //wait for the dropzone color to change
        
        wait.until(ExpectedConditions.attributeToBeNotEmpty(drop1, "background-color"));
        System.out.println("ENTERTED DROPZONE1");
        
        
        dragdrop.dragAndDrop(ball, drop2).build().perform();
        wait.until(ExpectedConditions.attributeToBeNotEmpty(drop2, "background-color"));
        System.out.println("ENTERTED DROPZONE2");
        
        driver.close();
        
	}
	
}
        
        
        
        
        
        

	


