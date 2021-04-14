package LoginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


public class LiveChat {
	WebDriver driver;
	
	public LiveChat(WebDriver driver) {
		this.driver=driver;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(5,500)");
		driver.findElement(By.tagName("div")).click();
		JavascriptExecutor java = (JavascriptExecutor) driver;
	     java.executeScript("window.scrollBy(15,500)");
	}


	public  void enterYourName(String yname) {
		 driver.findElement(By.xpath("//input[@id='txt_4616424']")).sendKeys(yname);
		 }
	
	public  void enterYourEmail(String ename) {
		 driver.findElement(By.xpath("//input[@id='txt_4616425']")).sendKeys(ename);
		 }

	 public  void clickSubmit() {
		 driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
		 }
	 
	
}
