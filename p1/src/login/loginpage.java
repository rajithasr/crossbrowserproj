package login;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class loginpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty(" webdriver.chrome.driver"," C:\\Users\\pc\\Desktop\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
//driver.get("https://opensource-demo.orangehrmlive.com");
//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//driver.findElement(By.id("txtPassword")).sendKeys("admin123"); 
//driver.findElement(By.id("btnLogin")).click();
	
	driver.get("https://www.facebook.com");
	driver.findElement(By.id("email")).sendKeys("trishita.perna@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("karthik123");
	driver.findElement(By.name("login")).click();
	}

}
