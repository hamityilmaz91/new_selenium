package day_06;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class deneme1 {


    public static void main(String[] args) {


//    https://www.amazon.com/ sayfasına gidelim
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");

//    Arama kutusunu locate edelim

        driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("SAMSUNG HEADPHONES");



//    “Samsung headphones” ile arama yapalım


//    Bulunan sonuç yazısını yazdıralım
        System.out.println("sonuc sayisi = " + driver.findElement(By.xpath("//span[text()='1-16 of 196 results for']")).getText());


//    İlk ürünü tıklayalım


//    Sayfadaki tüm başlıkları yazdıralım

//
//

}
}
