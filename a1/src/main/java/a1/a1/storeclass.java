package a1.a1;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
public class storeclass {
	
	@Test
	public void storetest()
	{
	System.setProperty("webdriver.gecko.driver","C:\\Users\\pc\\Desktop\\geckodriver.exe");	
	WebDriver driver= new FirefoxDriver();		
	driver.get("http://automationpractice.com/index.php");
	//driver.findElement(By.xpath("//input[@id='search_query_top']")).click();
	}
	
	
	
	
	
	

}
