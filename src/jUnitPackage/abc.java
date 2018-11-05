package jUnitPackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

    public class abc {
        String baseURL;
        WebDriver driver;


        @Before
        public void setUp() throws Exception {
            System.setProperty("webdriver.chrome.driver", "/Users/farajeez/SeleniumProject/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            baseURL = "https://www.google.com";
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        }

        @Test
        public void test() throws Exception {
            driver.get(baseURL);
            System.out.println("This is google home page");
            WebElement E1 = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
            E1.sendKeys("abc");

        }


        @After
        public void tearDown() throws Exception {
            System.out.println("Quit the Browser");
            driver.quit();

        }
    }

