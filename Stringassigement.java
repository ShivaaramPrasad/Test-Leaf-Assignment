package week1.day3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stringassigement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// add system property -> webdriver.chrome.driver
	      System.setProperty("webdriver.chrome.driver", "D:\\Ecllipse\\Learn_Selenium\\Selenium\\drivers\\chromedriver.exe");

		// Open the chrome browser
	     ChromeDriver driver =new ChromeDriver();

		// Load the URL :: get ->
		  driver.get("http://leaftaps.com/opentaps/control/main");
			
		Thread.sleep(400);
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		
	    driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		String text = driver.findElementByTagName("h2").getText();
		 
        System.out.println(text);
        
        String substring2 = text.substring(8, text.length());
		System.out.println(substring2);

	}

}
