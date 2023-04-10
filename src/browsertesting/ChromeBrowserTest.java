package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {

    public static void main(String[] args) {

        // 1. Set up the Chrome browser
        WebDriver driver = new ChromeDriver();
        // 2. Open URL
        String baseUrl = "https://www.saucedemo.com/";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        //giving implicitly wait to driver by using implicitly method
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // 3. Print the title of the page
        System.out.println("Page title: " + driver.getTitle());

        // 4. Print the current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // 5. Print the Page source
        System.out.println("Page source: " + driver.getPageSource());

        // 6. Enter the email into the email field
        WebElement emailField = driver.findElement(By.id("user-name"));
        emailField.sendKeys("mvthakur2011@gmail.com");
        // 7. Enter the password into the password field
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("Mv123");

        // 8. Close the browser
        driver.close();
    }
}
