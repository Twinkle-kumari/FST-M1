package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5c {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.training-support.net/selenium/dynamic-controls");
		
		String Title = driver.getTitle();
		
		System.out.println("The page Title is" +Title);
		
		WebElement Inputfield = driver.findElement(By.id("dynamicText"));
		
		System.out.println("The text in the input is Enabled:" +Inputfield.isEnabled());
		
		
		
		
		
		
		

	}

}
