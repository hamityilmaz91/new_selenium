package day_02_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.List;

public class task01 {
    static WebDriver driver;
    static List<WebElement> urunler;

    @BeforeClass
    public static void setUp() throws Exception {
        WebDriverManager.edgedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void test01() throws InterruptedException {
        //- ebay sayfasına gidiniz
        driver.get("https://ebay.com");

        //- electronics bölümüne tıklayınız
        driver.findElement(By.xpath("(//*[text()='Electronics'])[2]")).click();

        //- Genişliği 225 ve Uzunluğu 225 olan resimlerin hepsine tıklayalım
        //- Her sayfanın sayfa başlığını yazdıralım
        urunler = driver.findElements(By.xpath("//*[@width='225' and @height='225']"));
        System.out.println(urunler.size());
        for (int i = 0; i < urunler.size(); i++) {
            urunler = driver.findElements(By.xpath("//*[@width='225' and @height='225']"));
            urunler.get(i).click();

            System.out.println(i+1 +". başlık : " + driver.getTitle());

            driver.navigate().back();

        }

    }

    @AfterClass
    public static void afterClass() throws Exception {
        driver.close();
    }
}