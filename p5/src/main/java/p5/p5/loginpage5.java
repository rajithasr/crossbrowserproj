package p5.p5;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class loginpage5 {

	@Test
	 
	public void loginverify5()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Desktop\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?");
		driver.findElement(By.xpath("//a[@class='login']")).click();
	}	
}