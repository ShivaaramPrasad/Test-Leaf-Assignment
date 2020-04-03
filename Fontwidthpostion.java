package week1.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fontwidthpostion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// set the system property

		System.setProperty("webdriver.chrome.driver", "D:\\Ecllipse\\Learn_Selenium\\Selenium\\drivers\\chromedriver.exe");
		//open the chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		// Open the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		// Implicit wait for 10 seconds
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Background color of LeafTaps Login
		String color = driver.findElementByTagName("h2").getCssValue("background-color");
		System.out.println(color);
		
		// Font size of username
		String size = driver.findElementByXPath("//label[@for='username']").getCssValue("font-size");
		System.out.println(size);
		
		// Width of Login button
		int width = driver.findElementByClassName("decorativeSubmit").getSize().getWidth();
		System.out.println(width);
		
		// X position of Username textbox
		int x = driver.findElementById("username").getLocation().getX();
		System.out.println(x);
		
		driver.close();
	}

	
	}