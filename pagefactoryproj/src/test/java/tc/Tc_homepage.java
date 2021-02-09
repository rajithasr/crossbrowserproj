package tc;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import po.po_homepage;
public class Tc_homepage {
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Desktop\\chromedriver.exe");
	}
		
	 @Test
	 public void t_01_validateform()
	  {
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://demo.automationtesting.in/Register.html");
		 driver.manage().timeouts().implicitlyWait(1000,TimeUnit.MILLISECONDS);
		po_homepage obj=PageFactory.initElements(driver, po_homepage.class);
		obj.setfirstname("Akash");
		obj.lastname("perna");
		obj.Adress("2-3-4,street number 6");
		obj.email("akash.perna@gmail.com");
		obj.phone(" 6787990789");
		obj.selectskills("Andriod");
		obj.selectcountry("india");
	  }
	
}
