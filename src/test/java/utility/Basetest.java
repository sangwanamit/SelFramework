package utility;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Basetest {
	
	public static Logger log = null;
	public static WebDriver driver = null;
	public static WebDriverWait wait = null;
	
	public static void initLogs(String Logclass){
			
			// Initialize Log4j logs 
			DOMConfigurator.configure(System.getProperty("user.dir")+File.separator+"logs"+File.separator+"log4j.xml");
			log = Logger.getLogger(Logclass);
					
		}
	
	protected static WebDriver initDriver (){
			
		// Initialize Web Driver 
		
	         log.info("Initialize Firefox WebDriver");
	         driver = new FirefoxDriver(); 
	         
	         
	   //Implicit Wait
	         
	 		String waitTime = "30";
	 		driver.manage().timeouts().implicitlyWait(Long.parseLong(waitTime), TimeUnit.SECONDS);
	 		driver.manage().window().setPosition(new Point(0, 0));
	 		driver.manage().window().setSize(new Dimension(1024, 768));
	
	 		
	 	//Explicit Wait + Expected Conditions
	 		
	 		wait = new WebDriverWait(driver, 120);
	 		return driver;
		}
	

}
