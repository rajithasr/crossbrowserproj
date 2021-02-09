package amazontc;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import amazonpo.amazonpo_homepage;

public class amazontc_homepage {
    @BeforeClass
	public void browser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Desktop\\chromedriver.exe");
		
	}
	@Test
	public void amazonhomevalidate()
	{
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.com");
		 driver.manage().timeouts().implicitlyWait(1000,TimeUnit.MILLISECONDS);
		 amazonpo_homepage obj1=PageFactory.initElements(driver,amazonpo_homepage.class);
		 obj1.login();
		 obj1.newuser();
		 obj1.yourname("Trishita");
		 obj1.email("trishita.perna@gmail.com");
		 obj1.password("Nanisr123");
		 obj1.reenterpass("Nanisr123");
		 obj1.createaccount();
		 
		 
		
	}
	
	
	}
	
	

