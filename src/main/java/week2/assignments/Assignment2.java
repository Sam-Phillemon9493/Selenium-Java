package week2.assignments;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElementByXPath("//button[text()='✕']").click();
		Actions builder = new Actions(driver);
		WebElement webElement = driver.findElementByXPath("//span[text()='Electronics']");
		WebElement miElement = driver.findElementByXPath("//a[@title='Mobiles']/following::a[1]");
		Thread.sleep(2000);
		builder.moveToElement(webElement).pause(2000).click(miElement).perform();
		Thread.sleep(2000);
		if(driver.getTitle().contains("Mi"))
		{
			System.out.println("Landed on the Mi Page");
		}
		Thread.sleep(2000);
		List<WebElement> ele = driver.findElementsByXPath("//div[@class='col col-7-12']/div[1]");
		for(int i=0;i<ele.size();i++)
		{
			String text = ele.get(i).getText();
			System.out.println("Mobile Name " +i+"is: "+text);
		}
		System.out.println(ele.size());
	}

}
