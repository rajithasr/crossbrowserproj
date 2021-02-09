package logintest;
 import org.openqa.*;
 import org.openqa.selenium.*;
 import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;
 import org.testng.annotations.Test;
public class loginverify {
	 @Test
	public  void usertest()
	{
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Desktop\\chromedriver.exe");
  		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.flipkart.com");
		//driver.findElement(By.name("q")).sendKeys("georgette dress");
		//driver.findElement(By.xpath("//button[@type='submit'")).click();
  		driver.get("https://www.amazon.com");
  		driver.findElement(By.name("field-keywords")).sendKeys("kurtis for girls");
  		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
