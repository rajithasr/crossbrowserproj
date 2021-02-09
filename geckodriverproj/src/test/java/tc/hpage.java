package tc;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class hpage {
	@Test
	public void login()
	{				
		//WebDriverManager.iedriver().setup();	
		System.setProperty("webdriver.ie.driver","C:\\Users\\pc\\Desktop\\drivers\\IEDriverServer.exe");
		WebDriver driver=new  InternetExplorerDriver();
		driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS) ;		 
		driver.get("https://www.amazon.com");
	}
}
