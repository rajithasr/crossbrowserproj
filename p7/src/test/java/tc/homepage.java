package tc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
public class homepage {

	@Test
	public void verify()
	{ 
	System.setProperty("webdriver.gecko.driver","C:\\Users\\pc\\Desktop\\geckodriver.exe");	
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://phptravels.com/demo/");
	}
}
