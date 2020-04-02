package week1.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leafgroundtest {

	public static void main(String[] args) throws InterruptedException  {
		// add system property -> webdriver.chrome.driver
	      System.setProperty("webdriver.chrome.driver", "D:\\Ecllipse\\Learn_Selenium\\Selenium\\drivers\\chromedriver.exe");

		// Open the chrome browser
	     ChromeDriver driver =new ChromeDriver();

		// Load the URL :: get ->
		  driver.get("http://www.leafground.com/pages/Edit.html");
		  driver.findElementById("email").sendKeys("shivaa.ram25@gmail.com");
		  driver.findElementByXPath("//input[@value='Append ']").sendKeys("Shivaa",Keys.TAB);
		  String attribute = driver.findElementByName("username").getAttribute("value");
		  System.out.println(attribute);
		driver.findElementByXPath(("(//input[@name='username'])[2]")).clear();
		boolean enabled = driver.findElementByXPath("(//input[@name='username'])[2]").isEnabled();
		System.out.println(enabled);
		
		
		
			
			
			
	}

}
