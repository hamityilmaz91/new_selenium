package day_02_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class C03 {


    public static void main(String[] args) {


        // https://ebay.com sayfasına gidiniz
        // electronics bolumune tıklayınız
        // genisligi 225 ve uzunlugu 225 olan resimlerin hepsine sırasıyla tıklayınız ve sayfa baslıgını yazdırınız
        // sayfayı kapatınız

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        // https://ebay.com sayfasına gidiniz
        driver.get("https://ebay.com");


        // electronics bolumune tıklayınız
        driver.findElement(By.xpath("(//a[text()='Electronics'])[2]")).click();


        // genisligi 225 ve uzunlugu 225 olan resimlerin hepsini
        // sırasıyla tıklayınız ve sayfa baslıgını yazdırınız

        List<WebElement> resimler = driver.findElements(By.xpath("//img[@width='225' and @height='225']"));
        // Su anda bu listin elemanlari ortak alani locate etti . Boyle olunca listin tum elemanlari ayni .
        //get(1) de get(2) de ayni . biz her eleman ayri bir linki temsil ediyor diye dusunuyoruz.(for each loop
        // kullanamayisimizin nedeni budur )
        //ondan dolayi find elementS kullanmak zorunda kaldigimizda mecburen  indeks dusunmek zorundayiz
        //bunu da String concat ile yapmak mumkun oluyor . Aslinda find elementsi bulmamizin bize sagladi tek fayda
        // kac  farkli elemana ulasacagimizi bilmek . Yani for loopun size i ni bulup kodu dinamik hale getirmek

        // bana lazim olan xpath yolunu string ile elde etmeliyim ,loop her dondugunde ,yeni bir unic adrese ulasmaliyim

        String ortak_kisim = "(//img[@width='225' and @height='225'])[";
        String dinamik;
        for (int i = 1; i <= resimler.size(); i++) {
            dinamik = ortak_kisim + i + "]";
            System.out.println(dinamik);
            driver.findElement(By.xpath(dinamik)).click();
            System.out.println("baslik " + i + "==>" + driver.getTitle());
            driver.navigate().back();

        }

//
//
//        for (int i = 0; i <24 ; i++) {
//
//            List<WebElement> resimler = driver.findElements(By.xpath("//img[@width='225' and  @height='225']"));
//
//            resimler.get(i).click();
//
//            System.out.println(driver.getTitle());
//
//            driver.navigate().back();
//
//
//        }
//


        // sayfayı kapatınız
        //driver.close();


    }
}