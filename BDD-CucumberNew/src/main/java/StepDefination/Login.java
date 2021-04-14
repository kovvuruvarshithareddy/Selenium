package StepDefination;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	WebDriver driver;
	   @Before
	   public void beforeScenario() {
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\jayanth\\Downloads\\chromedriver_win32\\chromedriver.exe");
	        driver=new ChromeDriver();
	        driver.manage().window().maximize();   
	   }
	    @Given("^user should create an account$")
	    public void user_should_create_an_account() throws Throwable {

	        driver.get("https://www.lumens.com/");
	        System.out.println("Page title is : " + driver.getTitle());
	                
	       /* driver.findElement(By.xpath("//header/div[2]/div[4]/ul[1]/li[2]/div[1]")).click();
	        driver.findElement(By.xpath("//a[@id='my_account_hdr_link']")).click();
	        driver.findElement(By.xpath ("//input[@id='dwfrm_profile_customer_firstname']")).sendKeys("Varshitha");
	        
	        driver.findElement(By.xpath("//input[@id='dwfrm_profile_customer_lastname']")).sendKeys("Rohit");
	        
	        driver.findElement(By.xpath("//input[@id='dwfrm_profile_customer_email']")).sendKeys("kovvuruvarshithareddy@gmail.com");
	        
	        driver.findElement(By.xpath("//input[@id='dwfrm_profile_customer_emailconfirm']")).sendKeys("kovvuruvarshithareddy@gmail.com");
	        
	        driver.findElement(By.xpath("//input[@id='dwfrm_profile_login_password']")).sendKeys("Varshi@123");
	        driver.findElement(By.xpath("//input[@id='dwfrm_profile_login_passwordconfirm']")).sendKeys("Varshi@123");
	        
	        driver.findElement(By.xpath("//span[contains(text(),'Create Account')]")).click();*/
	        
	    }

	 

	    @When("^login to application$")
	    public void login_to_application() throws Throwable {  
	         
	                
	          driver.findElement(By.xpath("//header/div[2]/div[4]/ul[1]/li[2]/div[1]")).click();
	          driver.findElement(By.xpath("//a[@id='my_account_hdr_link']")).click();
	          driver.findElement(By.xpath("//input[@id='dwfrm_login_username']")).sendKeys("kovvuruvarshithareddy@gmail.com");
	          
	          driver.findElement(By.xpath("//input[@id='dwfrm_login_password']")).sendKeys("Varshi@123");
	          Thread.sleep(3000);
	        
	    }

	 

	    @Then("^click on submit button$")
	    public void click_on_submit_button() throws Throwable {
	        
	          driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
	                
	        
	    }

	    @Then("^user search the product$")
        public void user_search_product() throws Throwable {
         driver.findElement(By.xpath("//input[@id='searchinput']")).sendKeys("fans");
        driver.findElement(By.xpath("//button[@id='simplesearchbtn']")).click();
        driver.navigate().back();
	    }
	 

	    @Then("^user clicks on ligthing tab$")
	    public void user_clicks_on_ligthing_tab() throws Throwable {
	           
	                
	         WebElement ele= driver.findElement(By.xpath("//span[contains(text(),'lighting')]"));
	         Actions act =new Actions(driver);
	         act.moveToElement(ele).perform();
	         driver.findElement(By.xpath("//*[@id=\"nav-tab-01\"]/ul/li/div[1]/span/a")).click();
	        
	    }

	 

	    @Then("^user select on Chandeliers$")
	    public void user_select_on_Chandeliers() throws Throwable {
	         
	         driver.findElement(By.xpath("//span[contains(text(),'Chandeliers')]")).click();
	        
	    }

	 

	    @Then("^user selects on LargeChandeliers$")
	    
	    public void user_selects_on_LargeChandeliers() throws Throwable {
	        driver.findElement(By.xpath("//span[contains(text(),'Large Chandeliers')]")).click();    
	    }

	    @Then("^user add filters and check filters$")
	    public void user_add_filters_and_check_filters() throws Throwable {
	        
	        WebElement ele= driver.findElement(By.xpath("//a[@title='Click to Refine By 1 business day']//input[@type='checkbox']"));
	        Actions act =new Actions(driver);
	        act.moveToElement(ele).perform();
	        Thread.sleep(5000);
	       // driver.findElement(By.xpath("//a[@title='Click to Refine By 1 business day']//input[@type='checkbox']")).click();    
	    }
	    
	    @Then("^user add to cart")
	    public void user_add_to_cart() throws Throwable {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	      js.executeScript("window.scrollBy(5,500)");
	      driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	      driver.findElement(By.xpath("//body/div[@id='wrapper']/div[@id='main']/div[5]/div[2]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[4]/a[1]")).click();
	      JavascriptExecutor java = (JavascriptExecutor) driver;
	      java.executeScript("window.scrollBy(15,500)");
	      Thread.sleep(1000);
	      driver.findElement(By.id("add-to-cart")).click();
	    }
	    
	      @Then("^user click on checkout")
		    public void user_click_on_checkout() throws Throwable {
	      Thread.sleep(1000);
	      driver.findElement(By.linkText("CHECKOUT")).click();
	     driver.findElement(By.xpath("//header/div[2]/div[4]/ul[1]/li[2]/div[1]")).click();
	      
	    }
	     
	      
	    @And("^user will logout$")
	    public void user_will_logout() throws Throwable {
	         WebElement ele= driver.findElement(By.xpath("//header/div[2]/div[4]/ul[1]/li[2]/div[1]"));
	            Actions act =new Actions(driver);
	            act.moveToElement(ele).perform();
	        Thread.sleep(3000);
	            driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]")).click();        
	
	}
	
	    @After
	    public  void meantforfailed_testcases(Scenario scenario) throws Exception{
	    	Thread.sleep(3000);
	    	
	    	if(scenario.isFailed()) {
	    		String screenshotName=scenario.getName().replaceAll(" ", " ");
	    		
	    		byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	    		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    		FileUtils.copyFile(src,new File("C:\\Users\\jayanth\\eclipse-workspace\\BDD-CucumberNew\\Screenshot" + screenshotName + ".png" ));
	    		System.out.println("testing screenshotName:"+ screenshotName);
	    		scenario.embed(screenshot, "png");
	    	
	    	}
	    
}
	
	    
}
