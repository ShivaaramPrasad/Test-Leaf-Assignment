package weektwo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonAssignment {

		public static void main(String[] args) throws InterruptedException {
			//add  system property : webdriver.chrome.driver, system is a java class which is in built, setproperty is the method available in the system class(again which is a static class and no need to create an object/reference for the class and we can call the class by its name directly)
			System.setProperty("webdriver.chrome.driver", "C:\\Testleaf\\Selenium\\driver\\chromedriver\\chromedrivernew.exe");

			//Open the Chrome brower
			ChromeDriver driver = new ChromeDriver();

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//Open the webpage using the get method available in the ChromeDriver class by calling a reference object(driver)
			driver.get("http://www.leafground.com/pages/radio.html");
			
			//find the number of radio buttons
			List<WebElement> allRadioButtons = driver.findElementsByXPath("//input[@type='radio']");
			System.out.println(allRadioButtons.size());	

		}
	}
