import org.junit.runner.RunWith;
            import cucumber.api.CucumberOptions;
            import cucumber.api.junit.Cucumber;

/**
 * Created by Shushma on 12/03/19.
 */
    @RunWith(Cucumber.class)
    @CucumberOptions(features="src/test/resources/features/" ,
plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
        "junit:target/cucumber-reports/Cucumber.xml",
        "html:target/cucumber-reports"},
        monochrome = true)
public class CucumberRunner
    {

    }
