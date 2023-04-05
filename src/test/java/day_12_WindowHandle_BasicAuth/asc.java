package day_12_WindowHandle_BasicAuth;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class asc {


    @Test
    public void teste() {
        //1-Amazon anasayfaya gidin
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");


        //2-tum cookie’leri listeleyin

        Set<Cookie> cookies = driver.manage().getCookies();
        for (Cookie w : cookies) {
            System.out.println(w);
            System.out.println("******************************************************************************************************************************");


        }


        //TÜM COOKIE'LERI LİSTELEYEBİLMEK İÇİN driver.manage().getCookies() METHODUNU KULLANIRIZ


        //3-Sayfadaki cookies sayisinin 5’den buyuk oldugunu test edin
        Assert.assertTrue(cookies.size() > 5);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        //4-ismi i18n-prefs olan cookie degerinin USD oldugunu test edin
        System.out.println("driver.manage().getCookieNamed(\"i18n-prefs\") = " + driver.manage().getCookieNamed("i18n-prefs"));


        // COOKIE LERI TOPLU OLARAKTA VEYA "getCookiNamed" ILE BIREYSEL OLARAKTA CAGIRABILIRIZ

       /*
       I. YOL
        String actuall_value = driver.manage().getCookieNamed("i18n-prefs").getValue();
        Assert.assertTrue(actuall_value.equals("USD"));

        */
        for (Cookie w : cookies) {


            if (w.getName().equals("i18n-prefs")) {
                Assert.assertTrue(w.getValue().equals("USD"));
            }

        }


    /*
        Name : i18n-prefs
        Value : USD
        String cookieValue = --> USD
         */

 /*
        for (Cookie each:cookieSet) {
            if (each.getName().equals("i18n-prefs")){
                Assert.assertEquals("USD",cookieValue);
            }
        }
         */

        //5-ismi “en sevdigim cookie” ve degeri “cikolatali” olan bir cookie  olusturun ve sayfaya ekleyin
        Cookie cookie = new Cookie("en sevdigim cookie","cikolatali");
        driver.manage().addCookie(cookie);

        System.out.println("driver.manage().getCookieNamed(\"EN SEVDIGIM COOKIE\") = " + driver.manage().getCookieNamed("en sevdigim cookie"));


        //6-eklediginiz cookie’nin sayfaya eklendigini test edin

        //7-ismi skin olan cookie’yi silin ve silindigini test edin
        for (Cookie w : cookies) {
            System.out.println(w.getName());

        }
        driver.manage().deleteCookieNamed("skin");

        for (Cookie w :  driver.manage().getCookies()) {
            System.out.println(w.getName());
        }


        //8-tum cookie’leri silin ve silindigini test edin


    }
}