package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafGround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		
		
		WebElement element = driver.findElement(By.className("ui-selectonemenu"));
		Select option=new Select(element);
		option.selectByVisibleText("Selenium");
		
		WebElement courseElement = driver.findElement(By.xpath("//li[@class='ui-autocomplete-input-token']/parent::ul"));
		Select ce=new Select(courseElement);
		ce.selectByVisibleText("Selenium WebDriver");
		
		WebElement selectElement = driver.findElement(By.className("ui-selectonemenu-label ui-inputfield ui-corner-all"));
		Select se =new Select(selectElement);
		se.selectByVisibleText("India");
		
		
		WebElement languageElement = driver.findElement(By.id("j_idt87:lang_label"));
		Select le =new Select(languageElement);
		le.selectByVisibleText("Tamil");
		
		WebElement twoElement = driver.findElement(By.id("j_idt87:value_label"));
		Select te =new Select(twoElement);
		te.selectByVisibleText("இரண்டு");
		
		
	}

}
/*Assignment 4:
DropDown in Leaf Ground:
https://www.leafground.com/select.xhtml */