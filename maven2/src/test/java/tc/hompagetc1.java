package tc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class hompagetc1 {
	
	@Test
	public void logintest1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
	}

}
