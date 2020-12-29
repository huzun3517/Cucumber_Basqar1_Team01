package Runners;


import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;


@CucumberOptions(
        tags ={"@SmokeTest"},
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"},
        dryRun = false,
        plugin = { //basit rapor oluşturan plugin  // bu bölüm sonradan jenkins report için eklendi
                "html:target/cucumber-report",
                "json:target/cucumber.json"
        }
)


public class SmokeTest extends AbstractTestNGCucumberTests {

    @AfterClass
    public static void afterClass()
    {
        Reporter.loadXMLConfig("src/test/java/XMLFiles/extentReportSet.xml");
        //ayarlar alindi cucumber extent reporttan haberi oldu
        Reporter.setSystemInfo("User Name","Ömer Göker");
        Reporter.setSystemInfo("Application Name","Basqar");
        Reporter.setSystemInfo("Application Name","Basqar");
        Reporter.setSystemInfo("Operating System Info",System.getProperty("os.name"));
        Reporter.setSystemInfo("Department","QA");
        Reporter.setTestRunnerOutput("Test execution Cucumber report");


    }



}
