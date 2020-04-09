package weektwo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImagesAssignment {

	public static void main(String[] args) throws InterruptedException {
		//add  system property : webdriver.chrome.driver, system is a java class which is in built, setproperty is the method available in the system class(again which is a static class and no need to create an object/reference for the class and we can call the class by its name directly)
		System.setProperty("webdriver.chrome.driver", "C:\\Testleaf\\Selenium\\driver\\chromedriver\\chromedrivernew.exe");

		//Open the Chrome brower
		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Open the webpage using the get method available in the ChromeDriver class by calling a reference object(driver)
		driver.get("http://www.leafground.com/pages/Image.html");


		//find all the images List<WebElement> allImages 
		List<WebElement> allImages = driver.findElementsByTagName("img"); 
		int imageCount = allImages.size();
		System.out.println(imageCount);

		//Click the last image 
//		allImages.get(imageCount-1).sendKeys(Keys.ENTER);
		allImages.get(imageCount-1).click();
		System.out.println(driver.getTitle());

		//Navigate back 
		driver.navigate().back();


		//find all the images
		List<WebElement> allImagesAgain = driver.findElementsByXPath("//label[text()='Click me using Keyboard or Mouse']/following::img");
		int imageCountAgain = allImagesAgain.size();
		System.out.println(imageCountAgain);
		allImagesAgain.get(imageCountAgain-1).click();
		System.out.println(driver.getTitle());

	}
}

