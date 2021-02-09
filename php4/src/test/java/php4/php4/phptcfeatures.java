package php4.php4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class phptcfeatures {
	
@Test
public  void featuretest()
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();		
	driver.get("https://phptravels.com");
	phpfeatures obj2=PageFactory.initElements(driver,phpfeatures.class);
	obj2.featuresmenu();
	obj2.main();
}

}
