/**
 * Created by Shushma on 12/03/19.
 */


package StepsDefinition;

import Controllers.Functions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class Steps {

    private WebDriver driver;
    private Functions functions = Functions.getInstance();

    @Given( "^Open the Chrome and launch the application site as '(.*)'$" )
    public void open_the_Chrome_and_launch_the_application(String site)
    {
        driver = functions.getChromeDriver();
        functions.navigateToURL(driver, site);
    }

    @When( "^Enter '(.*)' in search box and click Enter$" )
    public void enter_searchtext_in_search_box_click_enter(String searchText) throws InterruptedException
    {
        functions.enterTextByName(driver, "q", searchText);
        functions.clickEnterByName(driver,"q");
    }

    @Then( "^Open 'website' and validate keyword '(.*)'$" )
    public void open_website_and_validate_keyword(String expectedWelcomeMessage) throws Throwable
    {
        functions.clickByContainsText(driver,"Coviam Technologies - Innovate Digital");
        String actualWelcomeMessage = functions.getTextById(driver,"homeHeading");
        actualWelcomeMessage = actualWelcomeMessage.replaceAll("\\r\\n|\\r|\\n", " ");
        Assert.assertEquals("Welcome Text on screen is Not as Expected",actualWelcomeMessage,expectedWelcomeMessage);
        functions.quitDriver(driver);
    }
}