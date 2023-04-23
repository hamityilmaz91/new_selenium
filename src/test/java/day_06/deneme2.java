package day_06;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class deneme2 {
    public static void main(String[] args) {

//
//        https://www.amazon.com/ sayfasına gidelim
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


//        Arama kutusunu locate edelim
        driver.get("https://www.amazon.com");
        WebElement arama_butonu = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

//    “Samsung headphones” ile arama yapalım
        arama_butonu.sendKeys("Samsung headphones"+ Keys.ENTER);


        //        Bulunan sonuç yazısını yazdıralım
        System.out.println(" " + driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[1]")).getText().split(" ")[2]);

//        İlk ürünü tıklayalım

driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();

//        Sayfadaki tüm başlıkları yazdıralım
        List<WebElement> basliklar_listesi = driver.findElements(By.xpath("//h1"));
        for (WebElement w : basliklar_listesi) {
            System.out.println("w.getText() = " + w.getText());

        }
    }
}
