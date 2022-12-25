package week1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class FirstSeleniumClass {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriverManager.operadriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://practice.cydeo.com/");

        WebDriver driver1 = new OperaDriver();

        driver1.get("https://practice.cydeo.com/");

    }
}
