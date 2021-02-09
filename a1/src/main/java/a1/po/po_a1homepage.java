package a1.po;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
public class po_a1homepage {
	
@Test
public void search()
{
System.setProperty("webdriver.chrome.driver","C:\\Users\\pc\\Desktop\\chromedriver.exe");

WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.com");
	
}
}