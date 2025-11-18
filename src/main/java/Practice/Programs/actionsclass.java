package Practice.Programs;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.apache.commons.io.FileUtils;

public class actionsclass {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement tabel2=driver.findElement(By.cssSelector(".tableFixHead"));
		//System.out.println(tabel2.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
		
		List<WebElement> fourthRow=tabel2.findElements(By.tagName("tr")).get(3).findElements(By.tagName("td"));
		
		System.out.println(fourthRow.get(1).getText());
		
		
		
		
		
	}

}
