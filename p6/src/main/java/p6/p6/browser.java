package p6.p6;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
public class browser {
	  @Test
      public void launchbrowser()
      {
    	
		  
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\eclipse-workspace\\p6\\Resource\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("http://automationpractice.com/index.php");
	 
		  
      }
}
