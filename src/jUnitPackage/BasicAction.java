package jUnitPackage;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public class BasicAction {
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
    public void test() {
        driver.get(baseURL);
        System.out.println("Step1: Open The Website");
        driver.findElement(xpath("//div[@id='navbar']//a[@href='/sign_in']")).click();
        System.out.println("Step2: Click on Log In");
        driver.findElement(xpath("//input[@id='user_email']")).sendKeys("zakirfara@gmail.com");
        System.out.println("Step3: Enter The User Name");
        driver.findElement(xpath("//input[@id='user_email']")).clear();
        System.out.println("Step4: Cleared the Email ");
        driver.findElement(xpath("//input[@id='user_email']")).sendKeys("zakirfara@gmail.com");
        System.out.println("Step5: Entered the email again");
        driver.findElement(id("user_password")).sendKeys("TEST");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Completed Test");
        driver.quit();
    }
}
