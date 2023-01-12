package Controllers;

import com.google.common.base.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.NoSuchElementException;

/**
 * Created by Shushma on 16/03/19.
 */
public class Functions {

    /**
     * Singleton pattern to create the object
     */
    private Functions()
    {
    }

    public static Functions getInstance()
    {
        return SingletonHelper.INSTANCE;
    }

    public WebDriver getChromeDriver()
    {
        System.setProperty("webdriver.chrome.driver", "/Users/coviam/Documents/MyAutomationFramework/api-cucumber/src/test/resources/ChromeDriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    public void navigateToURL(WebDriver driver, String site)
    {
        driver.get(site);
    }

    public void enterTextByName(WebDriver driver, String name, String value) throws InterruptedException
    {
        String path = "//*[@name='"+name+"']";
        WebElement element = fluentWait(driver,path);
        if(element != null)
        {
            driver.findElement(By.name(name)).sendKeys(value);
            driver.findElement(By.name(name)).sendKeys(Keys.ENTER);
        }
        else
            System.out.println("Element does not exist");
    }

    public void clickByContainsText(WebDriver driver, String containText) throws InterruptedException
    {
        String path = "//*[contains(text(),'"+containText+"')]";
        //*[contains(text(),'Coviam Technologies - Innovate Digital')]

        WebElement element = fluentWait(driver,path);
        if(element != null)
        {
            driver.findElement(By.xpath(path)).click();
        }
        else
            System.out.println("Element does not exist");
    }

    public void clickEnterByName(WebDriver driver, String name) throws InterruptedException
    {
        String path = "//*[@name='"+name+"']";
        WebElement element = fluentWait(driver,path);
        if(element != null)
        {
            driver.findElement(By.name(name)).sendKeys(Keys.ENTER);
        }
        else
            System.out.println("Element does not exist");
    }

    public String getTextById(WebDriver driver, String id)
    {
        String text = null;
        String path = "//*[@id='"+id+"']";
        WebElement element = fluentWait(driver,path);
        if (element != null)
        {
            text = driver.findElement(By.id(id)).getText();
        }
        return text;
    }

    public void quitDriver(WebDriver driver)
    {
        driver.quit();
    }


    //fluent wait function driver.findBy
    public WebElement fluentWait(WebDriver driver, final String path)
    {
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

        return wait.until(new Function<WebDriver, WebElement>()
        {

            public WebElement apply(WebDriver driver)
            {
                return driver.findElement(By.xpath(path));
            }
        });
    }


    private static class SingletonHelper
    {
        private static final Functions INSTANCE = new Functions();
    }
}
