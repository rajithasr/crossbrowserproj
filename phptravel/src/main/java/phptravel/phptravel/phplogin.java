package phptravel.phptravel;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class phplogin {
	
	@Test
	
	public void verify()
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Desktop\\chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.phptravels.net/home");
    driver.findElement(By.xpath("//a[@href='javascript:void(0);'][contains(.,'My Account')]")).click();
	driver.findElement(By.xpath("//a[@class='dropdown-item active tr']")).click();
	driver.findElement(By.xpath("//a[@class='btn btn-success br25 btn-block form-group']")).click();
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("keerti");
	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("sadula");
	driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9885371569");
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("keertisr@gmail.com");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("nanisr123");
	driver.findElement(By.xpath("//input[@name='confirmpassword']")).sendKeys("nanisr123");
	driver.findElement(By.xpath("//button[@class='signupbtn btn_full btn btn-success btn-block btn-lg']")).click();
	
	}

}


