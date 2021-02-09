package tc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class flipkarttclogin {

	@Test
	public void verify()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		flipkartlogin1 obj3=PageFactory.initElements(driver, flipkartlogin1.class);
		obj3.logintest();
	}
}
