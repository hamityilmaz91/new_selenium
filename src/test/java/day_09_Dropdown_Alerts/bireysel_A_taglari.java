package day_09_Dropdown_Alerts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class bireysel_A_taglari {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        //amazon sayfasına gidelim
        driver.get("https://amazon.com");
        WebElement linkler = driver.findElement(By.xpath("//a"));
        System.out.println(linkler.getText());
        System.out.println("************************************************");
         List<WebElement> linkler2 = driver.findElements(By.xpath("//a"));
        for (WebElement webElement : linkler2) {
            System.out.println("webElement.getText() = " + webElement.getText());

        }
        System.out.println("*******************************************************");
        WebElement taglar =driver.findElement(By.tagName("a"));
        System.out.println(taglar);
        System.out.println("*******************************************************");
        List<WebElement> taglar1 =driver.findElements(By.tagName("a"));
        for (WebElement webElement : taglar1) {
            System.out.println("webElement.getText() = " + webElement.getText());
        }


    }
}
