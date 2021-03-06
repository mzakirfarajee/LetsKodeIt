package workingwithelements;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropdownSelect {

    WebDriver driver;
    String baseUrl;


    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver", "//Users/zakirfarajee/Desktop/JavaSelenium/Drivers/geckodriver");
        driver = new FirefoxDriver();
        baseUrl = "https://learn.letskodeit.com/p/practice";
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @Test
    public void test() throws Exception {
        driver.get(baseUrl);
        WebElement element = driver.findElement(By.id("carselect"));
        Select sel = new Select(element);

        Thread.sleep(2000);
        System.out.println("Select Benz by value");
        sel.selectByValue("benz");

        Thread.sleep(2000);
        System.out.println("Select Honda by value");
        sel.selectByIndex(2);

        Thread.sleep(2000);
        System.out.println("Select BMW by value");
        sel.selectByVisibleText("BMW");

        Thread.sleep(2000);
        System.out.println("Print the list of all options");
        List<WebElement> options = sel.getOptions();

        int size = options.size();
        System.out.println("+++++++++++Listing all options Name++++++++++");

        for (int i=0; i<size; i++){
            String optionName = options.get(i).getText();
            System.out.println(optionName);
        }
    }

    @After

    public void tearDown() throws Exception {
        System.out.println("This is the firebox browser closing");
        driver.quit();
        Thread.sleep(2000);

    }
}
