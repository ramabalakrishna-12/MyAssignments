package weekn4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		WebElement mouseOver = driver.findElement(By.xpath("//span[@class='catText']"));
		Actions obj=new Actions(driver);
		obj.moveToElement(mouseOver).perform();
		

	}

}
