package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.training-support.net");
		
		String PageTitle = driver.getTitle();
		
		System.out.println("The page Title is: " + PageTitle);
		
		driver.findElement(By.xpath("//*[@id=\"about-link\"]")).click();
		
		WebElement Heading = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/h1"));
		
		System.out.println("Page Heading is" + driver.getTitle());
		
		driver.close();
		
		
		
		
	}

}
