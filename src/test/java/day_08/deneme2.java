package day_08;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class deneme2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //          Aşağıdaki Task'i Junit framework'u ile yapınız
//                - ebay sayfasına gidiniz
        driver.get("https://www.ebay.com");

//        - electronics bölümüne tıklayınız
        driver.findElement(By.xpath("(//*[text()='Electronics'])[2]")).click();

//        - Genişliği 225 ve Uzunluğu 225 olan resimlerin hepsine tıklayalım
        List<WebElement> resimler_listesi=driver.findElements(By.cssSelector("img[width='225'][height='225']"));

        for (int i = 0; i < resimler_listesi.size(); i++) {
           resimler_listesi=driver.findElements(By.cssSelector("img[width='225'][height='225']"));


            resimler_listesi.get(i).click();
            System.out.println("driver.getTitle() = " + driver.getTitle());
            driver.navigate().back();


        }

        //bir sitede bir listte birden fazla linki tiklamak istiyorsak  get i den fayladanabilirz
        // driver navigate back ile olur ve indeksli calismak  gereltigi icin fori  loop daha saglikli oluyor
        // ayrica her seferinde tiklanan locate edilen web element oldugu icin stale element exception hatasi almamak icin
        //sacma olsada foor loop iceirisinde her seferinde degisken tanimlanmali


        //        - Her sayfanın sayfa başlığını yazdıralım



//        - sayfayı kapatalım
//

    }
}
