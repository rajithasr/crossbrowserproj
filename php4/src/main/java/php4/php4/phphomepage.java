package php4.php4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class phphomepage {
	 WebDriver driver;
	public phphomepage( WebDriver d)
	{
		this.driver=d;
	}

	@FindBy(how=How.XPATH,using="//a[@href='https://phptravels.org/']")
	WebElement login;
	
	public void login1()
	{
		login.click();
	}
	
}

