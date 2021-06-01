package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://training-support.net/selenium/simple-form");
	
		String PageTitle = driver.getTitle();
		
		System.out.println(PageTitle);
		
		WebElement FirstName = driver.findElement(By.id("firstName"));
		
		FirstName.sendKeys("Twinkle");
		
		WebElement LastName = driver.findElement(By.id("lastName"));
		
		LastName.sendKeys("Kumari");
		
		WebElement email = driver.findElement(By.id("email"));
		
		email.sendKeys("twinkle@gmail.com");
		
		WebElement Contact = driver.findElement(By.id("number"));
		
		
		Contact.sendKeys("1234567890");
		
		WebElement Submit = driver.findElement(By.className("ui green button"));
		
		
		
		Submit.click();
		
		driver.close();
		
		
		
		


	}

}
