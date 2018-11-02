package SmokeTest;

import org.openqa.selenium.WebDriver;

public class SafariDriver {

    public static void main (String[] args) {

        String baseURL = "http://www.google.com";

        WebDriver driver;

        driver = new org.openqa.selenium.safari.SafariDriver();
        driver.get(baseURL);
        driver.quit();
    }
}
