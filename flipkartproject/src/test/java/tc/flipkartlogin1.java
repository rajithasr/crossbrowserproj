package tc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class flipkartlogin1 {
	WebDriver driver;
public flipkartlogin1( WebDriver d)
{
	this.driver=d;
}
	@FindBy(how=How.XPATH,using="//a[@href='/account/login?ret=/']")
	WebElement login;
	
	public void logintest()
	{
		login.click();
	}
}
