package day_11_Iframe_WindowHandle_Erol_Hoca;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.TestBase;

import java.time.Duration;
import java.util.ArrayList;

public class C02_tekrar_Bireysel extends TestBase {

    /*
    //Window 1'de https://www.techproeducation.com adresine gidiniz
    //Başlığın "Techpro Education | Online It Courses & Bootcamps" olduğunu doğrulayın
    //Window 2'de https://www.youtube.com sayfasını açınız:
    //Window 3'te https://www.linkedin.com sayfasını açınız:
    //techproeducation sayfasına geçiniz:
    //youtube sayfasına geçiniz:
    //linkedIn sayfasına geçiniz:
     */

    @Test
    public void test01() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Window 1'de https://www.techproeducation.com adresine gidiniz

        driver.get("https://www.techproeducation.com");
        String techpro_hash_kodu = driver.getWindowHandle();
        //Başlığın "Techpro Education | Online It Courses & Bootcamps" olduğunu doğrulayın

        System.out.println("driver.getTitle() = " + driver.getTitle());
        //Window 2'de https://www.youtube.com sayfasını açınız:
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.youtube.com");
        String youtube_hash_kodu = driver.getWindowHandle();


        //Window 3'te https://www.linkedin.com sayfasını açınız:

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.linkedin.com");
        String linkedn_hash_kodu = driver.getWindowHandle();
        bekle();
        //techproeducation sayfasına geçiniz:

        driver.switchTo().window(techpro_hash_kodu);
//
//        //  NAVIGATE METODU KULLANILAMADIGI ICIN SAYFALAR ARASI GEZME ISINI MECBUREN DRIVER IN SWITCH METODU ILE YAACAGIZ
//        // BUNUN ICINDE  HASH KODLARINA  IHTIYACIMIZ VAR
//        bekle();
//        //youtube sayfasına geçiniz:
//        driver.switchTo().window(youtube_hash_kodu);
//        bekle();
//        //linkedIn sayfasına geçiniz:
//        driver.switchTo().window(linkedn_hash_kodu);
//        System.out.println(techpro_hash_kodu);
//        System.out.println("youtube_hash_kodu = " + youtube_hash_kodu);
//        System.out.println("linkedn_hash_kodu = " + linkedn_hash_kodu);

        ArrayList tüm_hash_kodlar= new ArrayList(driver.getWindowHandles());
        System.out.println(tüm_hash_kodlar);
        System.out.println("tüm_hash_kodlar.get(1) = " + tüm_hash_kodlar.get(1));
        //***********************************************************************************************************************
        System.out.println("driver.getWindowHandles().toArray() = " + driver.getWindowHandles().toArray()[1].toString());
        //****************************************************************************************************************************


    }
}
