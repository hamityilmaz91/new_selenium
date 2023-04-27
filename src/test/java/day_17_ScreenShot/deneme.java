package day_17_ScreenShot;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class deneme {


    public static void main(String[] args) throws IOException {

        //techpronun ekran  tam ekran goruntusunu alin
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.techproeducation.com");

        driver.findElement(By.cssSelector("i[class=eicon-close]")).click();



        // ekran goruntusu demek yeni bir dosya alip kaydetmek demek
        //dosya demek windows demek file demek
        //input output demek . YAni file class demek oluyor
        // ayrica yeni  dosya demek yeni bir adres yolu demek .
        // bu adres yolunu ben olusturuyorum. ekran goruntusu demek delil demek
        //deliller testin yapildigi yerde saklanir .
        // manuelde jira da otomasyonda projenin oldugu frame workte
        // ve simdi once dosyami olusturuyorum proje seviyesinde . sol tarafta



        String tarih= new SimpleDateFormat("_hh_mm_ss_yyyy_mm_dd").format(new Date());
        //1. adim --- kendi olusturdugum klasore kendi verdigim  isimle png dosyasi olusturdum .
        String dosyayolu="C:\\Users\\hmtyl\\IdeaProjects\\SELE" +
                "NIUM\\src\\test\\Test_Outputs\\ekranfotolari"+tarih+".png";

        //2. adim ---- driver ile ekran resmi alacaz


        TakesScreenshot ts=(TakesScreenshot) driver;

        //3.adim
       FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE),new File(dosyayolu));
        WebElement resim = driver.findElement(By.xpath("(//h2[@class='elementor-heading-title elementor-size-default'])[1]"));
         tarih= new SimpleDateFormat("_hh_mm_ss_yyyy_mm_dd").format(new Date());
         dosyayolu="C:\\Users\\hmtyl\\IdeaProjects\\SELE" +
                "NIUM\\src\\test\\Test_Outputs\\ekranfotolari"+tarih+".png";
        FileUtils.copyFile(resim.getScreenshotAs(OutputType.FILE),new File(dosyayolu));


        File file= new File("C:\\Users\\hmtyl\\IdeaProjects\\SELENIUM\\src\\test\\Test_Outputs\\ekranfotolari.png");
       //file.delete();

        // simdi bir elementin ekran resmini alalim
        // hicbirsey degismiyor . Burda driver a aldiriyoruz
        // simdi elemnti locate edip . koymamiz yeterli gerekli menunun gelmesi icin




    }
}
