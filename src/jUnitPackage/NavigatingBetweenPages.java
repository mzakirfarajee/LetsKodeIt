package jUnitPackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class NavigatingBetweenPages {
    String baseURL;
    WebDriver driver;


    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "/Users/zakirfarajee/Desktop/JavaSelenium/Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        baseURL = "http://letskodeit.teachable.com";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void test() throws InterruptedException {
        driver.get(baseURL);
        String title = driver.getTitle();
        System.out.println("The title of the page is:  " + title);

        String currentURL = driver.getCurrentUrl();
        System.out.println("The current page is : " + currentURL);

        System.out.println("Navigating to LOG IN page");
        String navigateTo = "https://letskodeit.teachable.com/sign_in";
        driver.navigate().to(navigateTo);

        Thread.sleep(8000);

        driver.navigate().back();
        System.out.println("Navigated Back");
        currentURL = driver.getCurrentUrl();
        System.out.println("The current URL is: " + currentURL);

        Thread.sleep(4000);

        driver.navigate().forward();
        System.out.println("Navigated Forward");
        currentURL = driver.getCurrentUrl();
        System.out.println("The current URL is: " + currentURL);

        driver.navigate().back();
        System.out.println("Navigated Back Again");
        currentURL = driver.getCurrentUrl();
        System.out.println("The current URL is" + currentURL);

        driver.navigate().refresh();
        System.out.println("Just Refreshed the Page");
        String refreshTitle = driver.getTitle();
        System.out.println("The Page is refreshed to : " + refreshTitle);

        System.out.println("Regresh the page again");
        driver.get(currentURL);

        String pageSource = driver.getPageSource();
        System.out.println("The page source is :" + pageSource);

    }




    @After
    public void tearDown() throws Exception {
        System.out.println("This is the After Method");
        driver.quit();
    }

}
