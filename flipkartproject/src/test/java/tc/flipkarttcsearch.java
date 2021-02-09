package tc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class flipkarttcsearch {
	
	@Test
	public void serachitem()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		flipkartsearch obj4=PageFactory.initElements(driver, flipkartsearch.class);
		obj4.search("mobile");
		obj4.searchclick();
	}
}
