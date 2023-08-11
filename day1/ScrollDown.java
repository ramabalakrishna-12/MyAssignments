package weekn4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		WebElement scrollDown = driver.findElement(By.xpath("//a[text()='Track Your Order']"));
		Actions obj=new Actions(driver);
		obj.scrollToElement(scrollDown).perform();
		scrollDown.click();
		
		

	}

}
