package day_14_FakerClass_FileExist;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class sevilhanim {

    @Test
    public void sevil() throws InterruptedException { //274-314
        //1)https://the-internet.herokuapp.com/iframe sitesinegidiniz
        //2) sayfadaki toplam iframe sayısını bulunuz.
        //3) Sayfa basliginda '' yazını içerdiğini test edelim.
        //4) Paragrafdaki yaziyi silelim
        //5) Sonrasinda paragrafa "iframein icindeyim" yazisini yazdıralım
        //6) Alt kısımdaki yazının 'Elemental Selenium' yazisini içerdiğini test edeli

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/iframe");
        WebElement element = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
        driver.switchTo().frame(element);
        WebElement editor = driver.findElement(By.xpath("//p[text()='Your content goes here.']"));
        String editorYazisi = editor.getText();
        System.out.println("editorYazisi = " + editorYazisi);
        Thread.sleep(3000);
        editor.clear();





    }
}
