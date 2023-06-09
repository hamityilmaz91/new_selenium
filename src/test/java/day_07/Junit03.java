package day_07;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Junit03 {

    WebDriver driver;

    @Before
    public void driver_kurulum() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @After
    public void sayfa_kapama() throws InterruptedException {
        Thread.sleep(3);
        driver.close();
    }


    @Test
    public void googleac(){
        driver.get("https://www.google.com");
    }

    @Test
    public void youtubeac() {

        driver.get("https://www.youtube.com");
    }






}//class
