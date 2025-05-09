package Week1.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Create")).click();
		//driver.findElement(By.id("username")).sendKeys("vidhya");
		//driver.findElement(By.id("password")).sendKeys("123");
	}

}
