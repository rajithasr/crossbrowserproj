package a1.po;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.WebDriver;

public class browsermanager {
	static WebDriver driver;
public static WebDriver   getDriver(String browsername)
       {
	    
	  if(browsername.equalsIgnoreCase("chrome"))
	     {
	  	 driver=new ChromeDriver();
	     }
	//else if(browsername.equalsIgnoreCase("firefox"))
	     {
	  //     driver=new FirefoxDriver();
	       }
	//else if(browsername.equalsIgnoreCase("IE"))
	      {
	//	 driver=new InternetExplorerDriver();  
		   }
      
      driver.manage().window().maximize();   
      return driver;
       }
}

