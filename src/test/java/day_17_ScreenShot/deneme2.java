package day_17_ScreenShot;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Date;

public class deneme2 {

    // techproya git ,ekran resmini al gel

    @Test
    public void testsakin() throws IOException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // bu impilicty wait tüm sayfanin  yuklenmesi icin yani tüm web elemetlerin yuklenmesi icin tanimlanmis max suredir
        //bir element bu ilk asamada cikmayacak secilde tanimlanmissa , yani elementin locate edilmesi
        // belirli bir sarta baglanmissa eger o elementin ozelinde bir zaamanlama tanimlanir .
        // bu ozel zaman implicty wait suresi dolunca devreye girer
        //cunku sayfa once bir yukleniyor arkada .
        // yani ozel web elementi mesela 5. satirda .  7. satirda da normal bir web element var diyelim
        //5. satirda ozel sure devreye giryor . ama o devreye girene kadar 7. satirdaki elemet görülebiliyor oluyor
        // bundan dolayi once implicity wait calisiyor dedim

        // Ve o ozel element icin kullanilan ozel zamanlama  sadce o elemetin ozelinde gecerlidir
        // sonrasinda driver eski driver olmaya devam ediyor

        // SIMDIIIIIIIIIII   gelelim screen shoot konsuuna

        driver.get("https://www.techproeducation.com");

        // simdi ekran goruntusunu intellij de neden alirsin
        // test yapiyorsundur ve delile ihtiyacin vardirdir . ondan dolayi


        // Simdi oncelikle kodla caliyoruz .// selenyum kutuphanesinden screenshot interface ini kullanmak lazim


        // tüm ekran görüntüsü alacagim icin driver imi kamera yapmam lazim. onu da data tipini degistirerek yapiyorum

        TakesScreenshot ts= (TakesScreenshot)driver;


        // EKRAN GORUNTUSU ALMAK DEMEK KOPYALA YAPISTIR YAPMAK DEMEK
        //KOPYALA = EKRAN GORUNTUSU ;;;;;YAPISTIR=NEW FILE ADRES
        // IKI SEYI SEN OLUSUTURYORSUN : ADRESI VE KAYIT FORMATINDAKI .PNG KISMINI
        ts.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE),new File("src/test/Test_Outputs/resim.png"));
        // IKINCI ONEMLI OLAN KONU EKRAN RESIMLERI UST USTE BINMEMELI
        // BUNDAN DOLAYI TARIH ILE ISIMLENDIRME
        String tarih = new SimpleDateFormat("_hh_mm_ss_mm_dd_yyyy").format(new Date());
        System.out.println(tarih);

    }

    @Test
    public void amazonekranfotosu() throws IOException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");

       WebElement ddm= driver.findElement(By.cssSelector("select[aria-describedby=\"searchDropdownDescription\"]"));

       // simdi bu ekran goruntusu . kopyaladik. ve simdi yapistimam lazim

        FileUtils.copyFile(ddm.getScreenshotAs(OutputType.FILE),new File("target/classes/resim.png"));

        File dosya= new File("target/classes/resim.png");
        System.out.println("dosya.getTotalSpace() = " + dosya.getTotalSpace());



    }
}
