package tc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class flipkartsearch {
	WebDriver driver;
	public flipkartsearch(WebDriver d)
	{
		this.driver=d;
	}
@FindBy(how=How.XPATH, using="//input[@name='q']")
WebElement txt_search;
@FindBy(how=How.XPATH,using="      ")
WebElement search_icon;
public void search(String arg)
{
    txt_search.sendKeys(arg);
}
public void searchclick()
{
	search_icon.click();
}

}

