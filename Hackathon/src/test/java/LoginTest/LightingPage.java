package LoginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LightingPage {
	WebDriver driver;
	
	public LightingPage(WebDriver driver) throws Exception {
   this.driver=driver;
         
         //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
         
         driver.findElement(By.xpath("//input[@id='searchinput']")).sendKeys("fans");
         driver.findElement(By.xpath("//button[@id='simplesearchbtn']")).click();
         driver.navigate().back();
         
         WebElement ele= driver.findElement(By.xpath("//span[contains(text(),'lighting')]"));
         Actions act =new Actions(driver);
         act.moveToElement(ele).perform();
       driver.findElement(By.xpath("//*[@id=\"nav-tab-01\"]/ul/li/div[1]/span/a")).click();
       driver.findElement(By.xpath("//span[contains(text(),'Chandeliers')]")).click();
       driver.findElement(By.xpath("//span[contains(text(),'Large Chandeliers')]")).click();
       JavascriptExecutor js = (JavascriptExecutor) driver;
       //driver.findElement(By.xpath("//a[@title='Click to Refine By 1 business day']//input[@type='checkbox']")).click();
       js.executeScript("window.scrollBy(5,500)");
     driver.findElement(By.xpath("//body/div[@id='wrapper']/div[@id='main']/div[5]/div[2]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[4]/a[1]")).click();
     JavascriptExecutor java = (JavascriptExecutor) driver;
     java.executeScript("window.scrollBy(15,500)");
     Thread.sleep(1000);
     driver.findElement(By.id("add-to-cart")).click();
     /*Thread.sleep(1000);
     driver.findElement(By.xpath("//a[contains(text(),'CHECKOUT')]")).click();
   
   
    driver.findElement(By.xpath("//header/div[2]/div[4]/ul[1]/li[2]/div[1]")).click();
   driver.findElement(By.linkText("Sign Out")).click();*/
     
}
}
