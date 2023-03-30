package ODEV;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Practice_soru {


    // https://ebay.com sayfasına gidiniz
    // electronics bolumune tıklayınız
    // genisligi 225 ve uzunlugu 225 olan resimlerin hepsine sırasıyla tıklayınız ve sayfa baslıgını yazdırınız
    // sayfayı kapatınız

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // https://ebay.com sayfasına gidiniz

        driver.get("https://www.ebay.com");

        //cookies leri kabul ediyoruz


        Thread.sleep(2000);

        WebElement cookies_kabul = driver.findElement(By.xpath("//button[@aria-label='Accept privacy terms and settings']"));
        System.out.println("cookies_kabul.getText() = " + cookies_kabul.getText());
        cookies_kabul.click();


        //  2. YOL ::::::::driver.findElement(By.xpath("//*[text()='Accept All']")).click();


        // electronics bolumune tıklayınız
        WebElement elektronik = driver.findElement(By.xpath("(//a[@href='https://www.ebay.com/b/Electronics/bn_7000259124'])[2]"));
        elektronik.click();


        // genisligi 225 ve uzunlugu 225 olan resimlerin hepsine sırasıyla tıklayınız ve sayfa baslıgını yazdırınız

        List<WebElement> resim_elementleri = driver.findElements(By.xpath("//img[@width='225' and @height='225']"));
        String path = "(//img[@width='225' and @height='225'])";
        String pathdinamik = "";
        for (int i = 1; i <= resim_elementleri.size(); i++) {
            pathdinamik = path + "[" + i + "]";

            driver.findElement(By.xpath(pathdinamik)).click();
            System.out.println("driver.getTitle() = " + driver.getTitle());
            driver.navigate().back();
        }
        // sayfayı kapatınız
        driver.close();

    }//main
}
