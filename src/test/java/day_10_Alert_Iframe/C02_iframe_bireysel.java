package day_10_Alert_Iframe;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_iframe_bireysel {

    //➢	https://testcenter.techproeducation.com/index.php?page=iframe

    //➢	Ana sayfadaki ‘An iframe with a thin black border:’ metninde ‘black border’ yazisinin   oldugunu test edelim
    //➢	Ayrica ‘Applications lists’ yazisinin sayfada oldugunu test edelim

    //➢	Son olarak footer daki ‘Povered By’ yazisini varligini test edilip

    /*
        Eğer iki tane iframe olsaydı ve 2. frame'e geçmek isteseydim index'i 1 almam gerekicekti
        Örneğin:
            <body>
	            <iframe id="outerIframe" src="https://www.w3schools.com"> --> driver.switchTo().frame("outerIframe");
		            <iframe id="innerIframe" src="https://www.google.com"></iframe> -->Eğer bir üst frame içinde bir frame daha varsa tekrar driver.switchTo().frame("innerIframe");
	            </iframe>
            </body>
        -Index ile yukarıda bahsettiğimiz gibide yapabilirsiniz
        -iframe'i locate ederekte örneğin yukarıdaki kodun "iframe[id='outerIframe']" ccsSelector ile locate edilmiş hali
        -id ve name attributu varsa "driver.switchTo().frame("outerIframe")" bu şekildede geçiş yapabilirsiniz
         */
    @Test
    public void tümtest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //➢	https://testcenter.techproeducation.com/index.php?page=iframe
        driver.get("https://testcenter.techproeducation.com/index.php?page=iframe");

        //➢	Ana sayfadaki ‘An iframe with a thin black border:’ metninde ‘black border’ yazisinin   oldugunu test edelim

        String ilkdeger = driver.findElement(By.xpath("//*[.='An iframe with a thin black border:']")).getText();
        Assert.assertTrue(ilkdeger.contains("black border"));


        //➢	Ayrica ‘Applications lists’ yazisinin sayfada oldugunu test edelim
        WebElement iframe_web_elementi = driver.findElement(By.xpath("//iframe[@src='/index.php']"));
        driver.switchTo().frame(iframe_web_elementi);
        driver.switchTo().frame(0);

        String degeriki = driver.findElement(By.xpath("//*[.='Applications lists']")).getText();
        Assert.assertTrue(driver.findElement(By.xpath("//*[.='Applications lists']")).isDisplayed());

        //➢	Son olarak footer daki ‘Povered By’ yazisini varligini test edilip
        // simdi footer yazisi ilk sayfada . Yani driver imi disa cekmeliyim tekrar .
        driver.switchTo().parentFrame();// driver imim disa cekmis bulunmaktaimm. Sonrasi bildik isler


        WebElement son = driver.findElement(By.xpath("(//p[text()='Povered By'])[1]"));
        String olan_deger = son.getText();
        Assert.assertTrue(son.isDisplayed());

        // Simdi LOCATE 'TINDEN EMINSIN . INCELE YAPABILIYORSUN : FKAT BUNA RAGMEN NO SUCH ELEMENT EXCEPTION ALIYORSAN
        //  VEEEEE
        // SAYFA ICINDE BAGIMSIZ BIR PENCERE GORUYORSAN AKLINA IFRAME GELMELI
        // IFRAME DE  ALERT TEN FARKLI OLARAK UNTERSUCHEN  YAPABILIYORSUN

        // DRIVER IN IFRAME E GECISI IKI ADIMDA MUMKUN OLUYOR
        // ONCELIKLE  ;; IFRAME ANA SAYFANIN  BIR WEB ELEMENTIDIR : BUNU UNUTMAMAK LAZIM
        // ONDAN DOLAYI IFRAME LER ILK DRIVER IN HAKIMIYET ALANINDADIR
        // 1. ADIM ..::
        // IFRAME   I   LOcate edip ,ilk driverin elementi seklinde aliyorsun
        //2.  Adim  driver i   o  elementin icerisine gonderiyorsun


    }
}//class
