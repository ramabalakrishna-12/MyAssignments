package weekn4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable");
		driver.switchTo().frame(0);
		WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dest = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions drop=new Actions(driver);
		drop.dragAndDrop(src, dest).perform();
		
		
		driver.get("https://jqueryui.com/draggable");
		driver.switchTo().frame(0);
		WebElement src1 = driver.findElement(By.xpath("//div[@id='draggable']"));
		Actions drag=new Actions(driver);
		drag.dragAndDropBy(src1,400,59 ).perform();
		
		
		driver.get("https://jqueryui.com/selectable");
		driver.switchTo().frame(0);
		WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement item2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
		WebElement item3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
		
		Actions select=new Actions(driver);
		select.keyDown(Keys.CONTROL).click(item1).click(item2).click(item3).keyUp(Keys.CONTROL).perform();
		


	}

}
/*


*/