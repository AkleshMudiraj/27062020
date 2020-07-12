package collections;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CollectionInSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver dr = new ChromeDriver();
		
		// List in Selenium
		
		List<WebElement> elements = dr.findElements(By.xpath(""));
		
		//set in Selenium
		
		Set<String> wins = dr.getWindowHandles();
		
		
	}

}
