package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Rama");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Balakrishna");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Rama");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("B");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Automation Testing Assignment");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ramaaican@gmail.com");
		driver.findElement(By.name("submitButton")).click();
		
		System.out.println("Title is "+driver.getTitle());
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("LeafTest");
		
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("YogaMithran");
		
		driver.findElement(By.name("submitButton")).click();
		
		System.out.println("Duplicate Page Title is "+driver.getTitle());
		
		
		

	}

}
/*:Duplicate Lead
1. Launch URL "http://leaftaps.com/opentaps/control/login"
2. Enter UserName and Password Using Id Locator
3. Click on Login Button using Class Locator
4. Click on CRM/SFA Link
5. Click on Leads Button
6. Click on Create Lead 
7. Enter CompanyName Field Using id Locator
8. Enter FirstName Field Using id Locator
9. Enter LastName Field Using id Locator
10. Enter FirstName(Local) Field Using id Locator
11. Enter Department Field Using any Locator of Your Choice
12. Enter Description Field Using any Locator of your choice 
13. Enter your email in the E-mail address Field using the locator of your choice
14. Click on Create Button
15. Get the Title of Resulting Page using driver.getTitle()
16. Click on Duplicate button
17. Clear the CompanyName Field using .clear() And Enter new CompanyName
18.Clear the FirstName Field using .clear() And Enter new FirstName
Bu        19.Click on Create Lead Button
20. Get the Title of Resulting Page using driver.getTitle()
*/