package amazonpo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class amazonpo_Allpage {
	WebDriver driver;
	
	public amazonpo_Allpage( WebDriver d )
	{
		this.driver=d;
	}
	
	@FindBy(how=How.CLASS_NAME,using="hm-icon-label")
	WebElement txt_All;
	@FindBy(how=How.XPATH,using="//a[@data-menu-id=\"2\"]")
	WebElement txt_music;
	public void all()
	 {
		 txt_All.click();
	 }
	
	public void amazonmusic()
	{
		txt_music.click();
		
	}
}
