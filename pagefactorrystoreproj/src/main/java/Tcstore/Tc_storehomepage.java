package Tcstore;
import org.openqa.selenium.*;
import org.testng.annotations.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import postore.po_storehomepage;
public class Tc_storehomepage {
@Test
public void loginvalidate()
{
	 WebDriverManager.chromedriver().setup();
	 	WebDriver driver=new ChromeDriver();
	 	driver.get("http://automationpractice.com/index.php?");
	 	po_storehomepage obj1= PageFactory.initElements(driver,po_storehomepage.class);
	 	obj1.login();
}

}


