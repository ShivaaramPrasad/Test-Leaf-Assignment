package week1.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ACMEsystem {

	public static void main(String[] args) throws InterruptedException {
		

		 System.setProperty("webdriver.chrome.driver", "D:\\Ecllipse\\Learn_Selenium\\Selenium\\drivers\\chromedriver.exe");

			// Open the chrome browser
		     ChromeDriver driver =new ChromeDriver();

		     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			  driver.get("https://acme-test.uipath.com/account/login");
			  driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com",Keys.TAB);
			  driver.findElementById("password").sendKeys("leaf@12");
			  driver.findElementById("buttonLogin").click();
			  Thread.sleep(4000);
			  WebElement vendorLink = driver.findElementByXPath("//button[text()[normalize-space()='Vendors']]");
				Actions builder = new Actions(driver);
				builder.moveToElement(vendorLink).perform();
				driver.findElementByLinkText("Search for Vendor").click();
			  driver.findElementById("vendorName").sendKeys("Blue Lagoon");
			  driver.findElementById("buttonSearch").click();
			  String text = driver.findElementByXPath("//table[@class='table']/tbody[1]/tr[2]/td[5]").getText();
			  System.out.println(text);
			driver.findElementByLinkText("Log Out").click();
			driver.close();
	}

}
