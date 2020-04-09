package weektwo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErailWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Testleaf\\Selenium\\driver\\chromedriver\\chromedrivernew.exe");
		ChromeDriver driver = new ChromeDriver();
		//Launch the browser
		driver.get("https://erail.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	  //pass the from and to be clearing the values
		driver.findElementById("txtStationFrom").click();
	 driver.findElementById("txtStationFrom").sendKeys("SBC",Keys.TAB);
	 driver.findElementById("txtStationTo").click();
	 driver.findElementById("txtStationTo").sendKeys("MAS",Keys.TAB);
	 
	 boolean selected = driver.findElementById("chkSelectDateOnly").isSelected();
	 if(selected==true)
		 driver.findElementById("chkSelectDateOnly").click();
	 
	 //1. Find the correct table
	 WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
	 
	 //2. Find the rows 
	 
	List<WebElement> row = table.findElements(By.tagName("tr"));
	 
	//3.row count
	 int rowsize = row.size();
	 System.out.println("Count of Rows: "+(rowsize));
	 
	 //4.Find the index to print first row 
	 
	WebElement frow = row.get(0);
	 
	 //5. To find no of columns in the row
	List<WebElement> col = frow.findElements(By.tagName("td"));
	
	//6. col count
	 int colsize = col.size();
	 System.out.println("Count of col: "+(colsize));
	 
	 //7. to print the 2nd col as per requiremnt form col
	 
	  WebElement SecondCol = col.get(1);
	  String output = SecondCol.getText();  
	  System.out.println(output);
	  
	  //To print all the train names means all the values in 2 col
	  for(int i=0;i<=rowsize-1;i++)
	  {  List<WebElement> rows = table.findElements(By.tagName("tr"));
		  WebElement frows = rows.get(i);
		  List<WebElement> cols = frows.findElements(By.tagName("td"));
		  WebElement SecondCols = cols.get(1);
		  String outputs = SecondCols.getText();
		  System.out.println(outputs);
		  
	  }
	  }

	}
