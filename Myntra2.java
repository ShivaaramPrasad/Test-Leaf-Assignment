package weektwo.thur;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Testleaf\\Selenium\\driver\\chromedriver\\chromedrivernew.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		
		WebElement women = driver.findElementByXPath("//div[@data-reactid='178']/a");
		WebElement jacketcoat = driver.findElementByXPath("//a[text()='Jackets & Coats']");
		//actions
		
		Actions builder=new Actions(driver);
		
		builder.moveToElement(women).perform();
		Thread.sleep(3000);
		builder.moveToElement(jacketcoat).click().perform();
		Thread.sleep(3000);
		//total count
		
		String totalcount = driver.findElementByXPath("//span[@class='title-count']").getText().replaceAll("\\D", "");
		System.out.println(totalcount);
		
		int total = Integer.parseInt(totalcount);
	
		//validate sum of categories
		
	 String jacketscount = driver.findElementByXPath("(//span[@class='categories-num'])[1]").getText().replaceAll("\\D", "");
	 System.out.println(jacketscount);
	
	 int totaljackets = Integer.parseInt(jacketscount);
//		coats count
	 String coatscount = driver.findElementByXPath("(//span[@class='categories-num'])[2]").getText().replaceAll("\\D", "");
	 System.out.println(coatscount);
	 //total 
	 int totalcoats = Integer.parseInt(coatscount);
	 
	 if(total==(totaljackets+totalcoats))
			
		{
			System.out.println("Sum of the categories match the total count");
		}
	 
	 
		
	
 	 
	 //check coats
	 driver.findElementByXPath("//label[text()='Coats']/div").click();
	 
//	 
//	 //click + option
//	 
	 driver.findElementByXPath("//div[@class='brand-more']").click();
	 //sendkeys
	driver.findElementByXPath("//div[@class='FilterDirectory-panel FilterDirectory-expanded']//input").sendKeys("MANGO");
	
	 Thread.sleep(1000);
	 
	 //click mango
	 
	 WebElement mangocheckbox = driver.findElementByXPath("//label[@class=' common-customCheckbox']/input");
	 builder.moveToElement(mangocheckbox).click().perform();
	 
	 //click close
	 
	 driver.findElementByXPath("//span[@class='myntraweb-sprite FilterDirectory-close sprites-remove']").click();
	 
		
//
	 
//	 List<WebElement> brand = driver.findElementsByTagName("h3");
//	 for (WebElement displaybrand : brand) {
//		
//		 if (displaybrand.getText().equalsIgnoreCase("MANGO")) {
//		
//			 System.out.println("all items displayed are brand mango");
//		}
	 
	 List<WebElement> brand = driver.findElementsByXPath("//h3[text()='MANGO']");

		int i=0;
		
		Thread.sleep(6000);

		for (WebElement displaybrand : brand) 
		{
			if(displaybrand.getText().equalsIgnoreCase("mango"))
				
			{
				System.out.println("All items displayed are from brand mango");
				i++;

			}

		}
		
		System.out.println(i);
	
	 
	//
	
		String mangocount = driver.findElementByXPath("//*[@id='mountRoot']/div/div/main/div[3]/div[1]/section/div/div[3]/ul/li[3]/label/span").getText().replaceAll("\\D","");
		System.out.println(mangocount);
		
		int totalmangocount = Integer.parseInt(mangocount);
		
		
		if(i==totalmangocount)
		{
			System.out.println("Selected mango brand count matches with the displayed items");
		}
		//sort by better discount
		
		driver.findElementByClassName("sort-sortBy").click();
		driver.findElementByXPath("//label[text()='Better Discount']").click();

		Thread.sleep(4000);
		/*WebElement sortby = driver.findElementByXPath("//div[@class='sort-sortBy']");
		WebElement betterdiscount = driver.findElementByXPath("//label[contains(text(),'Better Discount')]");
		
		builder.moveToElement(sortby).perform();
		Thread.sleep(4000);
		builder.moveToElement(betterdiscount).click().perform();
	*/	
		//String firstproductprice = driver.findElementsByXPath("//li[1]//a[1]//div[2]//div[1]//span[1]//span[1]").getText();
		
		//Getting first price of the item displayed
		String firstItem = driver.findElementByXPath("(//span[@class='product-discountedPrice'])[1]")
				.getText().replaceAll("\\D", "");
		System.out.println("Price of the first discounted item: "+ Integer.parseInt(firstItem));


		Thread.sleep(3000);


		//Adding the first item to wishlist
		builder.moveToElement(driver.findElementByXPath("(//h3[text()='MANGO'])[1]")).perform();
		driver.findElementByXPath("(//span[text()='wishlist now'])[1]").click();


		
			Thread.sleep(4000);
	driver.close();
	
	}
}

	

