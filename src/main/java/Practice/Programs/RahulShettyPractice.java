package Practice.Programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RahulShettyPractice {

	public static void main(String[] args) {
		
		String price = null;
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 
		// Get all rows under the Web Table Fixed Header section
	        List<WebElement> rows = driver.findElements(By.cssSelector(".tableFixHead tbody tr"));

	        System.out.println("===== Chennai and Amount =====");

	        for (WebElement row : rows) {
	            List<WebElement> columns = row.findElements(By.tagName("td"));

	            if (columns.size() >= 4) {
	                String city = columns.get(2).getText(); // 3rd column = City
	                String amount = columns.get(3).getText(); // 4th column = Amount

	                // Filter rows for Chennai only
	                if (city.equalsIgnoreCase("Chennai")) {
	                    System.out.println("City: " + city + " | Amount: " + amount);
	                }
	            }
	        }

		
	}

}
