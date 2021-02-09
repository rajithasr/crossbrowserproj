package po;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class hompage1 {
	WebDriver driver;
 public hompage1(WebDriver d) 
 {
	 this.driver=d;
 }
	@FindBy(how=How.XPATH, using="//a[@href='https://phptravels.org/']")
	WebElement login;
	
	public void login1()
	{
		login.click();
	}
}
