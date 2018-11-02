package jUnitPackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class WorkingWithElementList {

    String baseUrl;
    WebDriver driver;


    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "/Users/zakirfarajee/Desktop/JavaSelenium/Drivers/chromedriver");
        driver = new ChromeDriver();
        baseUrl = "https://learn.letskodeit.com/p/practice";
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @Test

    public void testListOfElements() throws Exception {
        boolean isChecked = false;
        List<WebElement> radioButton= driver.findElements(By.id("carselect"));


        int size = radioButton.size();
        System.out.println("Size of the List" + size);
        for (int i = 0; i < size; i ++) {
            isChecked = radioButton.get(i).isSelected();


            if (!isChecked) {
                radioButton.get(i).click();
                Thread.sleep(2000);
            }
        }
    }



    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();

    }
}
