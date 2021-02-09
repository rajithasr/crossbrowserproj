package postore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class po_storehomepage {
	WebDriver driver;
	
	public po_storehomepage( WebDriver d)
	{
	    this.driver=d;

	}
	
@FindBy(how=How.XPATH,using="//a[@class='login']")
WebElement sign_in;

public void login()

{
	sign_in.click();
}
}


