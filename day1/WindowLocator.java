package weekn4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/auth.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String>allLinks=new ArrayList<String>(windowHandles);
		
		String title = driver.getTitle();
		System.out.println(title);
		driver.switchTo().window(allLinks.get(0));
		driver.close();
		
		
		

	}

}
