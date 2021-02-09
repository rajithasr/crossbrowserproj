package amazonpo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class amazonpo_Todaydeal
{
	WebDriver driver;
	public amazonpo_Todaydeal(WebDriver d )
	{
		this.driver=d;
	}
	@FindBy(how=How.XPATH,using ="//a[@data-csa-c-slot-id=\"nav_cs_0\"]")
	WebElement txt_todaydeal;
	
	public void todaydeal()
	{
		txt_todaydeal.click();
	}
	
	}
	

