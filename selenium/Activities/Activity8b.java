package Examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8b {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/tables");
		
		List<WebElement> Cols = driver.findElements(By.xpath("//*[@id=\"sortableTable\"]/tbody/tr[1]/td"));
		
		
		List<WebElement> Rows = driver.findElements(By.xpath("//*[@id=\"sortableTable\"]/tbody/tr/"));
		
		System.out.println("Number of columns are:" +Cols.size());
		System.out.println("Number of Rows are:" +Rows.size());
		
		//Cell value of second Row and second column
		WebElement CellvalueBefore = driver.findElement(By.xpath("//*[@id=\"sortableTable\"]/tbody/tr[2]/td[2]"));
        System.out.println("Second row, second column value(Before sorting): " + CellvalueBefore.getText());
        
        driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr/th[2]")).click();

        WebElement cellValueAfter = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
        System.out.println("Second row, second column value(After sorting): " + cellValueAfter.getText());

        WebElement footer = driver.findElement(By.xpath("//table[@id='sortableTable']/tfoot/tr"));
        System.out.println("Table footer values: " + footer.getText());
        
        driver.close();


		
		

	}

}
