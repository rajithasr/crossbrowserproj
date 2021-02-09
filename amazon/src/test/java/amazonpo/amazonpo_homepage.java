package amazonpo;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

  public class amazonpo_homepage {
	
	WebDriver driver;
  
	public   amazonpo_homepage (WebDriver d)
	  {		
		this.driver=d;
		
	  }

	@FindBy(how=How.XPATH,using ="//span[contains(@id,'nav-link-accountList-nav-line-1')]")
	WebElement signin;
	@FindBy(how=How.XPATH,using="//a[@class='nav-a']")
	WebElement newuser;
	@FindBy(how=How.XPATH,using="//input[@name='customerName']")
	WebElement txt_yourname;
	@FindBy(how=How.ID,using="ap_email" )              
	WebElement txt_email;
	@FindBy(how=How.NAME,using="password")
	WebElement txt_password;
	@FindBy(how=How.ID,using="ap_password_check")
	WebElement txt_reenterpassword;
	@FindBy(how=How.ID,using="continue")
	WebElement txt_createaccount;
	
	public void login()
	 {
		Actions a1=new Actions(driver);
		a1.moveToElement(signin).build().perform();
		
	}
	 public void newuser()
	 {
		newuser.click(); 
	 }
	 
	 public void yourname(String arg)
	  {
		 txt_yourname.sendKeys(arg);
	   }
	  
	 public void email(String arg)
	 {
		 txt_email.sendKeys(arg);
	 }
	 public void password( String arg)
	 {
		 txt_password.sendKeys(arg);
	 }
	 
	 public void reenterpass(String arg)
	 {
		 txt_reenterpassword.sendKeys(arg);
	 }
	 
	 public void createaccount()
	 
	 {
		txt_createaccount.click();
	 }
	
	 
	 
	 }
  
  
	
	

