package day_05_RelativeLocators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class deneme1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");

        driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("city bike" + Keys.ENTER);
        //Relative Locator kullanarak hybrid bike altındaki webelemente tıklayalım
        Thread.sleep(3000);
        driver.findElement(with(By.xpath("(//span[@class='a-size-base a-color-base'])[6]"))).click();



    }//main
}//class
