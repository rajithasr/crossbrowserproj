package tc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import po.hompage1;
public class tchompage {
@Test
public void verify()
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://phptravels.com");
	hompage1 obj3=PageFactory.initElements(driver, hompage1.class);
	obj3.login1();
}

}
