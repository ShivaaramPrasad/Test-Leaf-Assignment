package weektwo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Testleaf\\Selenium\\driver\\chromedriver\\chromedrivernew.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	   
	      driver.manage().window().maximize();
	      driver.get("http://leaftaps.com/opentaps/control/main");
	      
	      
	}

}
