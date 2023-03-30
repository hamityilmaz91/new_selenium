package day_07;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Junit04 {

    static WebDriver driver;

    @BeforeClass
    public static void driveryukleme() {
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


    }

    @Test
    public void google(){
        driver.get("https://www.google.com");
    }

    @Test
    public void amazon(){
        driver.get("https://www.amazon.com");
    }
    @AfterClass
    public static void kapama(){
        driver.close();
    }


}//class
