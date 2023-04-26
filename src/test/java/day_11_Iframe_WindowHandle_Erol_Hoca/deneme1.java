package day_11_Iframe_WindowHandle_Erol_Hoca;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class deneme1 {


    @Test
    public void test1(){

        //Window 1'de https://www.techproeducation.com adresine gidiniz
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.techproeducation.com");

        //Başlığın "Techpro Education | Online It Courses & Bootcamps" olduğunu doğrulayın
       Boolean sonuc= driver.getTitle().equals("Techpro Education | Online It Courses & Bootcamps");
        Assert.assertTrue(sonuc);




        //Window 2'de https://www.youtube.com sayfasını açınız:

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.youtube.com");

        //Window 3'te https://www.linkedin.com sayfasını açınız:

        driver.switchTo().newWindow(WindowType.WINDOW);

        driver.get("https://www.linkedin.com");

        //techproeducation sayfasına geçiniz:
        Set<String> hash_kodlar =driver.getWindowHandles();
        System.out.println(hash_kodlar);

        //youtube sayfasına geçiniz:

        //linkedIn sayfasına geçiniz:







    }//metod
}//classs
