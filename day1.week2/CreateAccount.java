package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		//driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Debit Limit Account");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Rama");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("TestLeaf NKPM");
		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("20,000,000");
		
		WebElement element = driver.findElement(By.name("industryEnumId"));
		Select option=new Select(element);
		option.selectByVisibleText("Computer Software");
		
		WebElement ownerElement = driver.findElement(By.name("ownershipEnumId"));
		Select oe=new Select(ownerElement);
		oe.selectByVisibleText("S-Corporation");
		
		
		WebElement sourceElement = driver.findElement(By.id("dataSourceId"));
		Select se=new Select(sourceElement);
		se.selectByValue("LEAD_EMPLOYEE");
		
		
		WebElement mcElement = driver.findElement(By.id("marketingCampaignId"));
		Select mc=new Select(mcElement);
		mc.selectByIndex(6);
		
		WebElement stateElement = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select s =new Select(stateElement);
		s.selectByValue("TX");
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		
		
		
	}

}
/* 	     
	      
		   
		   15. Select Marketing Campaign as eCommerce Site Internal Campaign using SelectbyIndex
		   
		   16. Select State/Province as Texas using SelectByValue 
		   
		   17. Click on Create Account using Xpath Locator
		   1. Launch URL "http://leaftaps.com/opentaps/control/login"
		   
		   2. Enter UserName and Password Using Id Locator
		   
		   3. Click on Login Button using Class Locator
		   
		   4. Click on CRM/SFA Link
		   
		   5. Click on Accounts Button
		   
		   6. Click on Create Account
		    7. Enter AccountName Field Using Xpath Locator value as Debit Limited Account
		   
		   8. Enter DEscriptiion as "Selenium Automation Tester"
		   
		   9. Enter LocalName Field Using Xpath Locator
		   10. Enter SiteName Field Using Xpath Locator
		   
		   11. Enter value for AnnualRevenue Field using Xpath Locator but class as Attribute
		   
		   12. Select Industry as ComputerSoftware
		    13. Select OwnerShip as S-Corporation using SelectByVisibletext
		   
		   14. Select Source as Employee using SelectByValue
		  
		
		
		    
	
 */
