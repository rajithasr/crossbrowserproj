package p5.p5;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class registrationpage5 {
	
@Test 

public void registration()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Desktop\\chromedriver.exe");	
	WebDriver driver= new ChromeDriver();
	driver.get("http://automationpractice.com/index.php?");
	driver.findElement(By.xpath("//a[@class='login']")).click();
	driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("trishita.perna@gmail.com");
    driver.findElement(By.xpath("//span[contains(.,'Create an account')]")).click();
	//driver.findElement(By.xpath("//label[contains(.,'Mrs.')]")).click();  
    driver.findElement(By.xpath("//input[@id=\"customer_firstname\"]")).sendKeys("trishita");
    
}  

}
