package jUnitPackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FaceBook {
    String baseURL;
    WebDriver driver;


    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "/Users/zakirfarajee/Desktop/JavaSelenium/Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        baseURL = "https://www.facebook.com";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void test() throws InterruptedException {
        driver.get(baseURL);
        System.out.println("This is facebook website");
        driver.findElement(By.id("email")).sendKeys("cocacolacoolio");
        driver.findElement(By.id("pass")).sendKeys("TestPass");
        driver.findElement(By.xpath("//input[@id='u_0_2']")).click();

        driver.findElement(By.xpath("//input[@id='u_9_2']")).sendKeys("Fahmida");
        driver.findElement(By.xpath("//input[@id='u_a_1']")).click();

    }
    

    @After
    public void tearDown() throws Exception {
        System.out.println("This is the After Method");
        driver.quit();
    }
}
