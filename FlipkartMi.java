package weektwo.thur;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartMi {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// set the system property
					System.setProperty("webdriver.chrome.driver", "C:\\Testleaf\\Selenium\\driver\\chromedriver\\chromedrivernew.exe");
		//url
		driver.get("https://www.flipkart.com/");
		//close btn
		driver.findElementByXPath("//button[text()='✕']").click();
		driver.manage().window().maximize();
		//Hover the cursor on Electronics
		WebElement electronics = driver.findElementByXPath("//span[text()='Electronics']");
		WebElement mi = driver.findElementByXPath("//a[text()='Mi']");
		
		//actions
		
		Actions builder=new Actions(driver);
		builder.moveToElement(electronics).perform();
		
		Thread.sleep(1000);
		//mi
		builder.moveToElement(mi).click().perform();
		//
		Thread.sleep(4000);
		String title = driver.getTitle();
		System.out.println(title);
		if (title.contains("Mi")) {
			System.out.println("mi page is re directed");
			
		}
		else {
			System.out.println("mi page is not re directed");
		}
	}

}
