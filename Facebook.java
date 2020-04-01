package week1.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException  {
		// add system property -> webdriver.chrome.driver
	      System.setProperty("webdriver.chrome.driver", "D:\\Ecllipse\\Learn_Selenium\\Selenium\\drivers\\chromedriver.exe");

		// Open the chrome browser
	     ChromeDriver driver =new ChromeDriver();

		// Load the URL :: get ->
		  driver.get("https://www.facebook.com/");
			
		Thread.sleep(400);
		
		driver.findElementById("email").sendKeys("shivaa");
		
	    WebElement epassword = driver.findElementById("pass");
		epassword.sendKeys("crmsfa");
		driver.findElementById("loginbutton").click();
		Thread.sleep(3000);
		driver.findElementByLinkText("Account Settings").click();
		Thread.sleep(3000);
		
				//Close Browser
			    driver.close();
				
		
		
			
			
			
	}

}
