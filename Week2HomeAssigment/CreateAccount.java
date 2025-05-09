package Week1.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

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
driver.findElement(By.id("accountName")).sendKeys("Testleaf sri");
driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
WebElement industryDD = driver.findElement(By.name("industryEnumId"));
Select select=new Select(industryDD);
select.selectByIndex(3);
WebElement ownershipDD = driver.findElement(By.name("ownershipEnumId"));
Select select1=new Select(ownershipDD);
select1.selectByVisibleText("S-Corporation");
WebElement EmployeeDD = driver.findElement(By.id("dataSourceId"));
Select select2=new Select(EmployeeDD);
select2.selectByValue("LEAD_EMPLOYEE");
WebElement marketingDD = driver.findElement(By.id("marketingCampaignId"));
Select select3=new Select(marketingDD);
select3.selectByIndex(6);
WebElement stateDD = driver.findElement(By.id("generalStateProvinceGeoId"));
Select select4=new Select(stateDD);
select4.selectByValue("TX");
driver.findElement(By.className("smallSubmit")).click();
driver.close();

			}

}
