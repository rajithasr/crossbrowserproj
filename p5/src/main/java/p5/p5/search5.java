package p5.p5;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.testng.annotations.*;

public class search5 {
	
	@Test
	public void search()
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Desktop\\chromedriver.exe");	
	WebDriver driver= new ChromeDriver();
	driver.get("http://automationpractice.com/index.php?");
	driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("T-shirts");
	driver.findElement(By.xpath("//button[@name='submit_search']")).click();
	}

}
