package poflipkart;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class po_homepage1 {
	WebDriver driver;
	public po_homepage1(WebDriver d)
	{
		this.driver=d;
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='q']")
	WebElement txt_search;
	
	public void search(String arg)
	{
		txt_search.sendKeys(arg);
	}
	
		
	}
	
	


