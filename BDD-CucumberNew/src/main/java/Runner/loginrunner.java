package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



    @RunWith(Cucumber.class)
    @CucumberOptions(
            features="C:\\Users\\jayanth\\eclipse-workspace\\BDD-CucumberNew\\src\\main\\java\\Feature\\Login.Feature",

                    glue={"StepDefination"},
                    
                    plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html","html:test-output",
                    			"json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
                    //plugin={"com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html "},
                    		//plugin = {"com.cucumber.listener.ExtentCucumberFormatter:"},      
                    
                        monochrome=true,
                       strict=true,
                       dryRun=false
                        )
public class loginrunner {
        
}