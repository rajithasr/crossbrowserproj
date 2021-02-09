package po;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class po_homepage {
	
	WebDriver driver;
	
	public  po_homepage(WebDriver d)
	{
		this.driver=d;
	}
		@FindBy(how=How.XPATH,using ="//input[@placeholder='First Name']")
		WebElement txt_firstname;
		@FindBy(how=How.XPATH,using="//input[@ placeholder='Last Name']")
	    WebElement txt_lastname;
		@FindBy(how=How.XPATH,using="//textarea[@rows='3']")
		WebElement txt_adress;
		@FindBy(how=How.XPATH,using="//input[@type='email']")
		WebElement txt_email;
		@FindBy(how=How.XPATH,using="//input[@type='tel']")
		WebElement txt_phone;
		@FindBy(how=How.XPATH,using="//select[@id='Skills']")
		WebElement txt_skills;
		@FindBy(how=How.XPATH,using="//span[@class='select2-selection select2-selection--single']")
		WebElement txt_slectcountry;
		public void setfirstname(String arg )
	 	    {
		      txt_firstname.sendKeys(arg);
	        }
       public void lastname(String arg)
           {
    	   txt_lastname.sendKeys(arg);
           }

       public void Adress(String arg)
       {
    	  txt_adress.sendKeys(arg); 
       }
     
       public void email(String arg)
       {
    	   txt_email.sendKeys(arg);
       }
       
       public void phone(String arg)
       {
    	   
    	   txt_phone.sendKeys(arg);
       }
       public void selectskills(String arg)
       {
          Select s1=new Select(txt_skills);
          s1.selectByValue(arg);
       }
    public void selectcountry(String arg)
    {
    	Select s2=new Select(txt_slectcountry);
    	s2.selectByVisibleText(arg);
    }
}




