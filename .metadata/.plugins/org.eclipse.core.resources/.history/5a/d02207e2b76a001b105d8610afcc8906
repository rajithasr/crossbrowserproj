package tc;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class h2page {
	@Test
	public void h2test()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\pc\\Desktop\\drivers\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com");
	}

}
