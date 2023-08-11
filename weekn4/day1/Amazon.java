package weekn4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//1.Load the URL https://www.amazon.in/
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//2.search as oneplus 9 pro
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		//3.Get the price of the first product
		WebElement text = driver.findElement(By.xpath("//span[text()='44,099']"));
		String price = text.getText();
		System.out.println("Price= "+price);
		
		//4. Print the number of customer ratings for the first displayed product
		WebElement text2 = driver.findElement(By.xpath("//span[text()='2.6 out of 5 stars']"));
		String rating=text2.getText();
		System.out.println("Rating= "+rating);
		//Thread.sleep(2000);
		
		//5. Click the first text link of the first image
		WebElement click = driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height']/img)[1]"));
		click.click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String>allLinks=new ArrayList<String>(windowHandles);
		driver.switchTo().window(allLinks.get(1));
		
		//6. Take a screen shot of the product displayed
		 File src = driver.getScreenshotAs(OutputType.FILE);
		 File dest=new File("./snap/amazon.png");
		 FileUtils.copyFile(src, dest);
		 
		 //7. Click 'Add to Cart' button
		 driver.findElement(By.id("add-to-cart-button")).click();
		 
		 //8. Get the cart subtotal and verify if it is correct.
		 WebElement total = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']"));
		 String cart = total.getText(); 
		 System.out.println(cart);
		 //boolean b = total.isDisplayed();
		 //System.out.println(b);
		 
		 
		 
		 //9.close the browser
		 driver.quit();
		 


	}

}
