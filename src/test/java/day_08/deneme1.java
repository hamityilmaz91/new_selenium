package day_08;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class deneme1 {

WebDriver driver ;

        @Before

    public void baslangic() {
//
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }


    @Test
    public void test1() {

        driver.get("https://amazon.com");
        String sayfa_basligi =driver.getTitle();
        String gercek_deger ="Amazon";
        Assert.assertTrue(sayfa_basligi.contains(gercek_deger));

        //         1)https://amazon.com adresinegidin
//        2)Aşağıdaki adları kullanarak 3 test metodu oluşturun ve gerekli testleriyapin


//            ○ title Test  => Sayfa başlığının "Amazon" icerip icermedigini


//            ○ image Test => Amazon resminin görüntülendiğini (isDisplayed()) test edin
        WebElement resim = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
        Assert.assertTrue(resim.isDisplayed());




//            ○ Search Box 'in erisilebilir oldugunu test edin(isEnabled())
        WebElement arama_kutusu= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        Assert.assertTrue(arama_kutusu.isEnabled());



//            ○ wrongTitleTest => Sayfa basliginin "amazon" olmadigini dogrulayin

        Assert.assertTrue(driver.getTitle().equals("amazon"));
//

    }
    //main metod
}//class
