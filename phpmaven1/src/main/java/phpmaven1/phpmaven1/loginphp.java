package phpmaven1.phpmaven1;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;
public class loginphp {
	@Test
	public void login1()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://phptravels.com/demo");
	}
	}


