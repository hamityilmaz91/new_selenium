package day_03_Locators_EROL_HOCA;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;

public class deneme3 {

    //web sayfasına gidin. https://www.amazon.com/
    public static void main(String[] args) {


        //Search(ara) “city bike”
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));

        driver.get("https://www.amazon.com");
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("city bike" + Keys.ENTER);


        //Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        WebElement element = driver.findElement(By.xpath("//div[@class='sg-col-14-of-20 sg-col-18-of-24 sg-col s-breadcrumb sg-col-10-of-16 sg-col-6-of-12']"));

        String sonuc = element.getText();
        System.out.println("sonuc = " + sonuc);

        System.out.println("sonuc.split(\" \")[2] = " + sonuc.split(" ")[2]);

//Sadece sonuc sayısını yazdıralım

        //Sonra karşınıza çıkan ilk sonucun resmine tıklayın.

    }
}