package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5b {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
	    driver.get("https://training-support.net/selenium/dynamic-controls");
	    
	    String Title = driver.getTitle();
	    
	    System.out.println("The title of the page is:" +Title);
	    
	    WebElement input = driver.findElement(By.xpath("//*[@id=\"dynamicCheckbox\"]/input"));
	    
	    System.out.println("The checkbox is selected:" +input.isSelected());
	    
	    input.click();
	    
	    System.out.println("The checkbox is selected:" +input.isSelected());
	    
	    driver.close();
	    
	    
	    
	    
	    
	    
	    

	}

}
