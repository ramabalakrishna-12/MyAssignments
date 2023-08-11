package weekn4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf$1234");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//button[@class='slds-button slds-button--neutral navButton newWindow uiButton']/span")).click();
		Thread.sleep(2000);
				
		Set<String> windowHandles = driver.getWindowHandles();
		List<String>allLinks=new ArrayList<String>(windowHandles);
	    driver.switchTo().window(allLinks.get(1));
	    driver.findElement(By.xpath("//button[text()='Confirm']")).click();
	    driver.findElement(By.id("onetrust-accept-btn-handler")).click();
	   
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
		
		

	}

}
/*1.Launch the browser
2.Load the url as " https://login.salesforce.com/ "
3.Enter the username as "hari.radhakrishnan@qeagle.com"
4. Enter the password as " Testleaf$321 "
5.click on the login button
6.click on the learn more option in the Mobile publisher
7.Switch to the next window using Windowhandles.
8.click on the confirm button in the redirecting page
9.Get the title
10.Get back to the parent window
11.close the browser*/