package weektwo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDeleteLead {


		public static void main(String[] args) throws InterruptedException {
			//add  system property : webdriver.chrome.driver, system is a java class which is in built, setproperty is the method available in the system class(again which is a static class and no need to create an object/reference for the class and we can call the class by its name directly)
			System.setProperty("webdriver.chrome.driver", "C:\\Testleaf\\Selenium\\driver\\chromedriver\\chromedrivernew.exe");
			//Open the Chrome brower
			ChromeDriver driver = new ChromeDriver();

			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//Open the webpage using the get method available in the ChromeDriver class by calling a reference object(driver)
			driver.get("http://leaftaps.com/opentaps/control/main");

			//Find the UserName
			WebElement eleUserName = driver.findElementById("username");
			eleUserName.sendKeys("DemoSalesManager");

			//Find the Password
			WebElement elePassword = driver.findElementByName("PASSWORD");
			elePassword.sendKeys("crmsfa");

			//Click on Login
			driver.findElementByClassName("decorativeSubmit").click();

			//Click on CRMFS Link in the Welcome Page
			driver.findElementByLinkText("CRM/SFA").click();

			//Click on leads
			driver.findElementByXPath("//a[text()='Leads']").click();

			Thread.sleep(4000);

			//Click on Find Leads
			driver.findElementByXPath("//a[text()='Find Leads']").click();

			//Click on Phone
			driver.findElementByXPath("//span[text()='Phone']").click();

			//Enter Phone Number
			driver.findElementByName("phoneNumber").sendKeys("1234567890");

			//Find Leads
			driver.findElementByXPath("//button[text()='Find Leads']").click();

			Thread.sleep(4000);
			//Click First Resulting lead
			WebElement firstLead = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]");
			String fLead = firstLead.getText();
			System.out.println(fLead);

			driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]").click();

			//Click on Delete button
			driver.findElementByXPath("(//a[contains(@class,'subMenuButton')])[4]").click();

			Thread.sleep(3000);
			//Find Leads
			driver.findElementByXPath("//a[text()='Find Leads']").click();

			//Find the deleted Lead
			driver.findElementByName("id").sendKeys(fLead);

			//Find Leads
			driver.findElementByXPath("//button[text()='Find Leads']").click();

			Thread.sleep(1000);
			//Find No Records display message
			String errorMessage = driver.findElementByXPath("//div[@class='x-paging-info']").getText();
			System.out.println(errorMessage);

			if (errorMessage.equals("No records to display")) {
				System.out.println("Lead is deleted");		
			}
			driver.close();
		}
	}
