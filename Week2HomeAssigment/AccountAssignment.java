package Week1.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AccountAssignment {
	
	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.partialLinkText("CRM")).click();
driver.findElement(By.linkText("Accounts")).click();
driver.findElement(By.linkText("Create Account")).click();
driver.findElement(By.id("accountName")).sendKeys("Testleaf vidhya");
driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
driver.findElement(By.id("numberEmployees")).sendKeys("30");
driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
driver.findElement(By.className("smallSubmit")).click();
String title=driver.getTitle();
System.out.println(title);
driver.close();		
		
	}
	
}
