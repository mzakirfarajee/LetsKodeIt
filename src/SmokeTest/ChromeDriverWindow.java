package SmokeTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverWindow {

    public static void main (String[] args) {

        String baseURL = "http://www.google.com";

        WebDriver driver;

        System.setProperty("webdriver.chrome.driver", "/Users/zakirfarajee/Desktop/JavaSelenium/Drivers/chromedriver");

        driver = new ChromeDriver();
        driver.get(baseURL);
    }
}
