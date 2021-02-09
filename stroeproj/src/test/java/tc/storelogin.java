package tc;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class storelogin {
	
	@Test
	
	public void userlogin()
	{

System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\Desktop\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.j2store.org/demo-stores.html");

	}

}

