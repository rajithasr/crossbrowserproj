package amazontc;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import amazonpo.amazonpo_Todaydeal;

public class amazontc_Todaydeal {
	
	     @BeforeClass
		public void browser2()
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Desktop\\chromedriver.exe");
			
		}
		@Test
		public void amazonTodaydealmenu()
		  {
			 WebDriver driver = new ChromeDriver();
			 driver.get("https://www.amazon.com");
			 driver.manage().timeouts().implicitlyWait(1000,TimeUnit.MILLISECONDS);	
			 amazonpo_Todaydeal obj3=PageFactory.initElements(driver,amazonpo_Todaydeal.class);
			 obj3.todaydeal();
          }
       }
