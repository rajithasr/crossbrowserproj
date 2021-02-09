package php4.php4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class phpfeatures {
	WebDriver driver;
	public phpfeatures(WebDriver d  )
	{
		this.driver=d;
	}

	@FindBy(how=How.XPATH,using="//span[contains(.,'Features')])[1]")
	WebElement features;
	@FindBy(how=How.XPATH,using="//a[@class='lvl-1 link nav-link'][contains(.,'Main Features')]")
	WebElement mainfeatures;	
	public void featuresmenu()
	{
	    Actions a1=new Actions(driver);
			a1.moveToElement(features).build().perform();
	}
	
	public void main()
	{
		mainfeatures.click();
	}
	
	
}
