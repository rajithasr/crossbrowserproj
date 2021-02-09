package php4.php4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class phphome {
	
	@Test
	public void amazonloginvalidate()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();		
		driver.get("https://phptravels.com");
		phphomepage obj1=PageFactory.initElements(driver, phphomepage.class);
		obj1.login1();
	}
}
