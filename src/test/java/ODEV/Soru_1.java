package ODEV;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.time.Duration;

public class Soru_1 {

    //www.google.com/ adresine gidin
    // 3- cookies uyarisini kabul ederek kapatin
//        Sayfa basliginin “Google” ifadesi icerdigini test edin  11111
//        Arama cubuguna “Nutella” yazip aratin
//        Bulunan sonuc sayisini yazdirin     1111111
//        sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
//        Sayfayi kapatin

    public static String sonuc_sayisi;

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.google.com");
        WebElement cerez_butonu = driver.findElement(By.xpath("//button[@id='L2AGLb']"));
        cerez_butonu.click();
        WebElement arama_motoru = driver.findElement(By.xpath("//input[@class='gLFyf']"));
        arama_motoru.sendKeys("Nutella" + Keys.ENTER);
        System.out.println("Sonuc sayisi = " + driver.findElement(By.xpath("//div[@id='result-stats']")).getText());
        System.out.println("********************************************");
        sonuc_sayisi = driver.findElement(By.xpath("//div[@id='result-stats']")).getText();
        System.out.println(sonuc_sayisi);
        System.out.println("************************************************");
        String a=sonuc_sayisi.split(" ")[1];
        System.out.println(a);
        System.out.println("*********************************************************");
       String  m =a.replaceAll(".","");
        System.out.println(m);
driver.close();
    }

    @Test
    public void sonuc_sayisi() {
        System.out.println("sonuc_sayisi = " + sonuc_sayisi);
        System.out.println("sonuc_sayisi = " + sonuc_sayisi);
    }


}//class
