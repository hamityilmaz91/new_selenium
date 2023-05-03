package day_17_ScreenShot;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class deneme4 {
    public static void main(String[] args) throws IOException {



        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");

        WebElement arama_kutusu = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

        arama_kutusu.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(arama_kutusu.getScreenshotAs(OutputType.FILE),new File("Testciktilarimiz/resimmm.jpeg"));


        TakesScreenshot ts=  (TakesScreenshot) driver;

        ts.getScreenshotAs(OutputType.FILE);












        // kopyala yapistir meselesi
        // kopyala= ekran goruntusu yani yeni olustudugumun resim dosyasi
        // yapistirda klasor oluyir . yeni olusturdugugunuz klasor



       //       src/test/Test_Outputs/resim.png
     //   src/test/Test_Outputs/resim.png







    }
}
