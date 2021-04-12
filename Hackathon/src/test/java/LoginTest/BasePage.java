package LoginTest;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Excel.lib.util.xls_Reader;

public class BasePage{
	 WebDriver driver;
	
	public BasePage( WebDriver driver) {
		this.driver=driver;
		
	     driver.findElement(By.xpath("//header/div[2]/div[4]/ul[1]/li[2]/div[1]")).click();
         driver.findElement(By.xpath("//a[@id='my_account_hdr_link']")).click();  
	     //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
         xls_Reader reader = new xls_Reader("C:\\Users\\jayanth\\eclipse-workspace\\Hackathon\\src\\main\\java\\com\\Excel\\lib\\util\\SampleExcel.xlsx");
			String sheetName = "login";
			
			int rowCount = reader.getRowCount(sheetName);

			for(int rowNum=2; rowNum<=rowCount; rowNum++){
				String loginId = reader.getCellData(sheetName, "username", rowNum);
				String passsword = reader.getCellData(sheetName, "password", rowNum);

				System.out.println(loginId + " " + passsword);
				
				WebElement userName=driver.findElement(By.xpath("//input[@id='dwfrm_login_username']"));
				userName.clear();
				userName.sendKeys(loginId);
				
				WebElement password=driver.findElement(By.xpath("//input[@id='dwfrm_login_password']"));
				password.clear();
				password.sendKeys(passsword);
			}  
    
		      
	}
	
    
    public  void enterEmail(String em) {
    	driver.findElement(By.xpath("//input[@id='dwfrm_login_username']")).sendKeys(em);
   	 }
   	
    public  void enterPassword(String pass) {
		
		 driver.findElement(By.xpath("//input[@id='dwfrm_login_password']")).sendKeys(pass);
		 }
    public  void clickLogout() {
		 driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
		 }
    
    public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
    	TakesScreenshot scrShot =((TakesScreenshot)webdriver);
    	
    	File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
    	
    	File DestFile=new File("C:\\Users\\jayanth\\eclipse-workspace\\Hackathon\\ScreenShot");
    	
    	FileUtils.copyFile(SrcFile, DestFile);
    	}
}
