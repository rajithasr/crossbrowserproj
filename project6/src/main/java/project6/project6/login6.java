package project6.project6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login6 {

	@Test
	public void st()
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Desktop\\chromedriver.exe");	
	WebDriver driver= new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("shirts");
	driver.findElement(By.name("submit_search")).click();
	//driver.findElement(By.xpath("//select[@id='selectProductSort']")).click();
	
	}
	
	
}
