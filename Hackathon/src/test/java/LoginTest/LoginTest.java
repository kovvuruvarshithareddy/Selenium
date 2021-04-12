package LoginTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import LoginPage.LoginPage;


public class LoginTest{
	public static Properties prop;
	public static WebDriver driver;
	@Test(priority=0)
public void launchingBrowser()
{
			prop= new Properties();
			FileInputStream file;
			try {
				file= new FileInputStream("C:\\Users\\jayanth\\eclipse-workspace\\Hackathon1\\Config\\Configuration.properties");
				prop.load(file);
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\jayanth\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.manage().deleteAllCookies();
			 driver.get(prop.getProperty("url"));
			 System.out.println("Page title is : " + driver.getTitle());
	}
		@Test(priority=1,groups="Regression")
		//@Test(enabled=false)
	public void createAccountDetails()  {
		LoginPage obj= new LoginPage(driver);
		 
		obj.enterFirstName(prop.getProperty("FirstName"));
		obj.enterLastName(prop.getProperty("LastName"));
		 
		 obj.enterEmail(prop.getProperty("Email"));
		 obj.enterConformEmail(prop.getProperty("ConformEmail"));
		 
		 obj.enterPassword(prop.getProperty("Passwd"));
		 obj.enterConformPassword(prop.getProperty("Conform"));
		 
		 obj.clickCreateAccount();
		}
		@Test(priority=2)
		//@Test(enabled=false)
			public void loginAccountDetails()  {
      BasePage bp=new BasePage(driver);
	
		 bp.enterEmail(prop.getProperty("Email"));
		 bp.enterPassword(prop.getProperty("Passwd"));
		 bp.clickLogout();
		}
		 @Test(priority=3)
		 public void lightingBrowserSuccessfully() throws Exception {
		 LightingPage lp=new LightingPage(driver);
			}
	}
		
	

