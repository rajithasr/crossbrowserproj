package p5.p5;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.testng.annotations.*;
public class womenmenu {
	@Test
	
	public void women()
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Desktop\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?");
		//driver.findElement(By.xpath("/a[@title='Women']")).click();
		Actions a1 = new Actions(driver);
		a1.moveToElement(driver.findElement(By.xpath("//a[contains(@title,'Women')]"))).build().perform();
	}
}
