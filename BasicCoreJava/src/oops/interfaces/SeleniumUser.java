package oops.interfaces;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		lounchBrowser(new ChromeDriver());
		lounchBrowser(new FirefoxDriver());
		lounchBrowser(new EdgeDriver());
	}
	
	public static void lounchBrowser(WebDriver dr)
	{
		dr.get("https://www.google.com/");
	}

}
