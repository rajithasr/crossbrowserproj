package a1.a1;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;;

public class login {
	
     @Test
	public void verify()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("https://phptravels.com");
		// driver.findElement(By.xpath("//a[@href='https://phptravels.com/demo']")).click();
		// driver.findElement(By.xpath("//a[@href='https://phptravels.com/order']")).click();
		 Actions a1=new Actions(driver);
		 a1.moveToElement(driver.findElement(By.xpath("//span[contains(.,'Features')]"))).build().perform();
	   // driver.findElement(By.xpath("//a[@href='https://phptravels.com/features']")).click();
	     driver.findElement(By.xpath("//a[@href='https://phptravels.com/hotels-module-features/']")).click();
	
	
	
	}
	
}
