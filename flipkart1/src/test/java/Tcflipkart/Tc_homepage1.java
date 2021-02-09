package Tcflipkart;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import poflipkart.po_homepage1;
public class Tc_homepage1 {
	@Test
	public void searchitem()
	{                    
		WebDriverManager.iedriver().setup();
		WebDriver driver=new  InternetExplorerDriver();
		 	driver.get("https://www.flipkart.com");		 	
		 	 driver.manage().timeouts().implicitlyWait(1000,TimeUnit.MILLISECONDS);
		 	 po_homepage1 obj2=PageFactory.initElements(driver,po_homepage1.class);
		 	 obj2.search("computer");
       }
    }
