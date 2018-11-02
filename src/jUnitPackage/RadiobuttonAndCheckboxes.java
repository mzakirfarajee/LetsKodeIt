package jUnitPackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RadiobuttonAndCheckboxes {

    String baseUrl;
    WebDriver driver;

    @Before

    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "/Users/zakirfarajee/Desktop/JavaSelenium/Drivers/chromedriver");
        driver = new ChromeDriver();
        baseUrl = "https://learn.letskodeit.com/p/practice";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get(baseUrl);
    }


    @Test
    public void test() throws InterruptedException {

        WebElement bmwRadioBtn = driver.findElement(By.id("bmwradio"));
        bmwRadioBtn.click();


        Thread.sleep(2000);
        WebElement benzRadioBtn = driver.findElement(By.id("benzradio"));
        benzRadioBtn.click();

        Thread.sleep(2000);
        WebElement bmwCheckBox = driver.findElement(By.id("bmwcheck"));
        bmwCheckBox.click();

        Thread.sleep(2000);
        WebElement benzCheckBox = driver.findElement(By.id("benzcheck"));
        benzCheckBox.click();

        System.out.println("BMW Radio button is selected? " + bmwRadioBtn.isSelected());
        System.out.println("Benz Radio button is selected? " + benzRadioBtn.isSelected());
        System.out.println("BMW Check Box is selected? " + bmwCheckBox.isSelected());
        System.out.println("Benz Check Boex is selected? " + benzCheckBox.isSelected());
    }


    @After
    public void tearDown() throws Exception {

        driver.quit();

    }
}
