package day_08;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class deneme2 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");

        //1. Locate Dropdown Element


        //2. Select objesi oluştur


        //Select objesini kullanarak 3 farklı şekilde seçim yapabiliriz:

        //Ay şeçimi:
        //Gün Seçimi
        // Tüm eyalet isimlerini yazdıralım




    }
}
