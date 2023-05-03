package day_17_ScreenShot;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class deneme3 {
    public static void main(String[] args) throws IOException {


        //amazona git sayfanin ekran goruntusunu al

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");

        WebElement arama_kutusu = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        arama_kutusu.sendKeys("ad");
        arama_kutusu.getScreenshotAs(OutputType.FILE);
        // ekran goruntusu alma  javada kopyala yapistir islemidir
        // kopyala yapistir islemin de de kopyaladigin elemet= ekran goruntusu alma ,, yapistir islemide yeni dosya olusturma


        FileUtils.copyFile(arama_kutusu.getScreenshotAs(OutputType.FILE),new File("src/test/Test_Outputs/ressss.jpg"));



    }
}
