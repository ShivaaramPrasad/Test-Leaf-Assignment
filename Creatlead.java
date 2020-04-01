package week1.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Creatlead {

	public static void main(String[] args) throws InterruptedException  {
		// add system property -> webdriver.chrome.driver
	      System.setProperty("webdriver.chrome.driver", "D:\\Ecllipse\\Learn_Selenium\\Selenium\\drivers\\chromedriver.exe");

		// Open the chrome browser
	     ChromeDriver driver =new ChromeDriver();

		// Load the URL :: get ->
		  driver.get("http://leaftaps.com/opentaps/control/main");
			
		Thread.sleep(400);
		
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
	    WebElement epassword = driver.findElementByName("PASSWORD");
		epassword.sendKeys("crmsfa");
		
		//driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByLinkText("Create Lead").click();
		Thread.sleep(800);
		// Enter Company Name
				driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
				
				// Enter First Name
				driver.findElementById("createLeadForm_firstName").sendKeys("shivaaram");
				
				// Enter Last Name
				driver.findElementById("createLeadForm_lastName").sendKeys("Prasad");
				
				// Click Create Lead button
				driver.findElementByName("submitButton").click();	

				String viewLeadtitle = driver.getTitle();
				System.out.println(viewLeadtitle);
				WebElement firstName = driver.findElementById("viewLead_firstName_sp");
				String inputName = firstName.getText();
				System.out.println(inputName);
				String expectedName = "Shivaaram";
				if (inputName.equalsIgnoreCase(expectedName))
						{
					System.out.println("Result is verified");
				}
				else {
					System.out.println("Result cannot be verified");
				}
				driver.close();
				
				//Close Browser
			    //driver.close();
				
		
		
			
			
			
	}

}
