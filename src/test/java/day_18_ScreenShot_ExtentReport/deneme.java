package day_18_ScreenShot_ExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
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

    /*
        EXTENTREPORT kullanabilmemiz için;
            1-pom.xml dosyasına extentreports dependency'si eklenir
            2-ExtentReports class'ından bir obje oluşturulur
            3-HTML formatında düzenleneceği için ExtentHtmlReporter class'ından obje oluşturulur
            4-Rapora test ile ilgili bilgiler girebilmek için ExtentTest class'ından bir obje oluşturulur
         */

    public static void main(String[] args) throws IOException {


        // amazona git ve arama cubugunu  locate et . icine Allah yaz. Allah yazisinin locateini al ve bu testin raporunu olustur

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Allah" + Keys.ENTER);

        // cikan sayfanin ekran goruntusu al
        String tarih = new SimpleDateFormat("_hh_mm_ss_dd_mm_yyyy").format(new Date());

        ExtentReports genisrapor=new ExtentReports();
        ExtentHtmlReporter htmlrapor=new ExtentHtmlReporter("target/classes/kendiproje" + tarih + ".html");
        genisrapor.attachReporter(htmlrapor);//ikisini ic ice gecirmis oldum . burasi tamam

        genisrapor.setSystemInfo("tester","hamit");
        genisrapor.setSystemInfo("browser","chrome");
        htmlrapor.config().setDocumentTitle("ilk sahsi rapor ");
        htmlrapor.config().setReportName("Allah yazisi gorunumu ");
        ExtentTest extendtest=genisrapor.createTest("bu deneme testi","yazigör");


        TakesScreenshot ts = (TakesScreenshot) driver;
        extendtest.info("driver kamera yapildi ");
        FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE), new File("target/classes/kendiproje" + tarih + ".png"));
//SImdi raporlamaya gecelim
        extendtest.info("kopyala yapistir yapildi ");
        // raporlama yalniz en basta yapilir
        //before clasina ait bir kodlar zinciridir

        //Rapor 3 adimdan olusur
        genisrapor.flush();




    }


}
