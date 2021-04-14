package LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage{
	
 WebDriver driver;
	 

	 public LoginPage(WebDriver driver) {
		 this.driver=driver;
		 
	          driver.findElement(By.xpath("//header/div[2]/div[4]/ul[1]/li[2]/div[1]")).click();
		      driver.findElement(By.xpath("//a[@id='my_account_hdr_link']")).click();
		     // driver.findElement(By.xpath("//body/div[@id='ltkpopup-container']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/*[1]")).click();
		      //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);   
		      
		     
	 }
	 
	 
	 public  void enterFirstName(String fname) {
	 driver.findElement(By.xpath("//input[@id='dwfrm_profile_customer_firstname']")).sendKeys(fname);
	 }
	 
	 public  void enterLastName(String lname) {
	 driver.findElement(By.xpath("//input[@id='dwfrm_profile_customer_lastname']")).sendKeys(lname);
	 }
	 
	 public  void enterEmail(String em) {
	 driver.findElement(By.xpath("//input[@id='dwfrm_profile_customer_email']")).sendKeys(em);
	 }
	 
	 public  void enterConformEmail(String cem) {
		 driver.findElement(By.xpath("//input[@id='dwfrm_profile_customer_emailconfirm']")).sendKeys(cem);
		 }
	 
	 public  void enterPassword(String pass) {
		 driver.findElement(By.xpath("//input[@id='dwfrm_profile_login_password']")).sendKeys(pass);
		 }

	 public  void enterConformPassword(String cpass) {
		 driver.findElement(By.xpath("//input[@id='dwfrm_profile_login_passwordconfirm']")).sendKeys(cpass);
		 }

	 public  void clickCreateAccount() {
		 driver.findElement(By.xpath("//span[contains(text(),'Create Account')]")).click();
		 }
	 
	 
}
