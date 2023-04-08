package ODEV;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.TestBase;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class emoji extends TestBase {
    public static void main(String[] args) throws InterruptedException {

        // https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/ sitesine gidin
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");
        driver.switchTo().frame(driver.findElement(By.xpath("(//iframe)[2]")));

        WebElement elemet =driver.findElement(By.xpath("(//span[@class='mdl-tabs__ripple-container mdl-js-ripple-effect'])[2]"));
        elemet.click();


        // İkinci emoji öğelerini yazdırınız
        WebElement ikinci_emoji_ogeleri_locati =driver.findElement(By.xpath("//div[@class='mdl-tabs__panel is-active']"));

        System.out.println("ikinci_emoji_ogeleri_locati.getText() = " + ikinci_emoji_ogeleri_locati.getText());


        // Parent iframe e geri donun
        driver.switchTo().parentFrame();
        Thread.sleep(3000);
        ArrayList<String> isimler = new ArrayList<String>(Arrays.asList("ahmet","dasd","asdasd","adss"));



        String sabit="(//input[@class='mdl-textfield__input'])[";
        for (int i = 1; i <4 ; i++) {
            String dinamik =sabit+i+"]";

            System.out.println(dinamik);
            driver.findElement(By.xpath(dinamik)).sendKeys(isimler.get(i));
        }


        // Formu doldurun,(Formu istediğiniz metinlerle doldurun    )

        // Apply button a basiniz



    }
}
