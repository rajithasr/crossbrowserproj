package logintest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import  org.testng.annotations.Test;
public class logonpages1 {
	@Test
	public void verify()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\pc\\Desktop\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.name("q")).sendKeys("georgette dress");
		driver.findElement(By.xpath("//button[@type='submit' ")).click();
	}

}
