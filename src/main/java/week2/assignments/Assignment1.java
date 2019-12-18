package week2.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;





public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElementById("src").clear();
		driver.findElementByXPath("//div[@class='fl search-box clearfix']//input").sendKeys("Chennai");
		Thread.sleep(2000);
		driver.findElementById("src").sendKeys(Keys.TAB);
		driver.findElementById("dest").sendKeys("Trichy");
		Thread.sleep(2000);
		driver.findElementById("dest").sendKeys(Keys.TAB);
		//Thread.sleep(3000);
		//To Calculate current date for the Onward Calendar
		WebElement findElementByXPath = driver.findElementByXPath("//div[@id='rb-calendar_onward_cal']//tbody");
		List<WebElement> findElements = findElementByXPath.findElements(By.tagName("td"));
		for(int i=1;i<=findElements.size();i++)
		{
			if(findElements.get(i).getAttribute("class").equalsIgnoreCase("current day"))
			{
				System.out.println(findElements.get(i).getText());
				findElements.get(i).click();
				break;
			}
		}

		driver.findElementByXPath("//label[@for='return_cal']").click();
		
		//To calculate current date for return calendar
		
		WebElement findElementByXPath2 = driver.findElementByXPath("//div[@id='rb-calendar_return_cal']//tbody");
		List<WebElement> findElements2 = findElementByXPath2.findElements(By.tagName("td"));
		for(int i=1;i<=findElements2.size();i++)
		{
			if(findElements2.get(i).getAttribute("class").equalsIgnoreCase("current day"))
			{
				System.out.println(findElements2.get(i).getText());
				findElements2.get(i).click();
				break;
			}
		}
		
		driver.findElementByXPath("//button[@id='search_btn' and @class='fl button']").click();
		
		Thread.sleep(3000);
		driver.findElementByXPath("//ul[@class='dept-time dt-time-filter']//label[@for='dtAfter 6 pm' and @class='custom-checkbox']").click();
		driver.findElementByXPath("//ul[@class='list-chkbox']//label[@for='bt_AC' and @class='custom-checkbox']").click();

		System.out.println("Total Number of Buses Found :"+ driver.findElementByXPath("//span[@class='f-bold busFound']").getText());




	}

}
