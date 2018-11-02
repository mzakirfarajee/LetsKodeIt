package SmokeTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDriver {

    public static void main (String[] args) {

        System.out.println("This is a test");

        String baseURL = "http://www.google.com";

        WebDriver driver;

        System.setProperty("webdriver.gecko.driver", "//Users/zakirfarajee/Desktop/JavaSelenium/Drivers/geckodriver");

        driver = new FirefoxDriver();
        driver.get(baseURL);
        driver.quit();

    }
}
