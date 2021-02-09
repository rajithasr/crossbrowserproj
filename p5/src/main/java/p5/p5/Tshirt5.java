package p5.p5;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.testng.annotations.*;
public class Tshirt5 {
	
	@Test
	 public void tshirtmenu()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Desktop\\chromedriver.exe");	
		WebDriver driver= new ChromeDriver();		
		driver.get("http://automationpractice.com/index.php");
		Actions a1=new Actions(driver);
		a1.moveToElement(driver.findElement(By.xpath("//a[@title='T-shirts']"))).build().perform();
		 
	}

}
