package weektwo.thur;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AUIclasswork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Testleaf\\Selenium\\driver\\chromedriver\\chromedrivernew.exe");
		ChromeDriver driver = new ChromeDriver();
		//Launch the browser
		driver.get("http://www.leafground.com/pages/selectable.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//select
		WebElement item7 = driver.findElementByXPath("//ol[//@id='selectable']/li[7]");
		WebElement item4 = driver.findElementByXPath("//ol[//@id='selectable']/li[4]");
		
		Actions builder=new Actions(driver);
		builder.clickAndHold(item7).release(item4).perform();


	}

}
