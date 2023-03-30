package day_01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class deneme {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.ebay.com");
        WebElement fiyat=driver.findElement(By.xpath("//*[text()='$379.99']"));


        System.out.println(fiyat);
        System.out.println("***************************");
        System.out.println(fiyat.getText());
        String fiyatstring=fiyat.getText();
        String tagname =fiyat.getTagName();
        System.out.println(tagname);

        ////*[text()='$379.99']
    }
}
