package amazontc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import amazonpo.amazonpo_Allpage;

public class amazontc_Allpage {
	
	     @BeforeClass
		public void browser1()
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Desktop\\chromedriver.exe");
			
		}
		@Test
		public void amazonAllmenu()
		    {
			 WebDriver driver = new ChromeDriver();
			 driver.get("https://www.amazon.com");
			 driver.manage().timeouts().implicitlyWait(1000,TimeUnit.MILLISECONDS);	
			 amazonpo_Allpage obj2=PageFactory.initElements(driver,amazonpo_Allpage.class);
			 obj2.all();
			 obj2.amazonmusic();
            }
}