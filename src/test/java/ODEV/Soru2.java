package ODEV;

import io.github.bonigarcia.wdm.WebDriverManager;


import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Soru2 {

    //www.google.com/ adresine gidin
    // 3- cookies uyarisini kabul ederek kapatin
//        Sayfa basliginin “Google” ifadesi icerdigini test edin  11111
//        Arama cubuguna “Nutella” yazip aratin
//        Bulunan sonuc sayisini yazdirin     1111111
//        sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
//        Sayfayi kapatin

    WebDriver driver;

    @Before
    public void before() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @Test
    public void baslik_testi() {
        driver.get("https://www.google.com");

        String actually_title =driver.getTitle();
        String expected_title ="Google";
        boolean baslik_iceriyor_mu=actually_title.contains(expected_title);
        assertTrue(baslik_iceriyor_mu);


    }


@Test
    public void amazon_drop_down_test(){
        driver.get("https://www.amazon.com");
        WebElement All_dropdown=driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']"));
    Select all_drop_objesi= new Select(All_dropdown);
    all_drop_objesi.selectByValue("Electronics");

}

}//class