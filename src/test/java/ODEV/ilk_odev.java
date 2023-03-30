package ODEV;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ilk_odev {

    //        ............................................................................................
//
//        “https://www.saucedemo.com” Adresine gidin
//        Username kutusuna “standard_user” yazdirin
//        Password kutusuna “secret_sauce” yazdirin
//        Login tusuna basin
//        Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
//        Add to Cart butonuna basin
//        Alisveris sepetine tiklayin
//        Sectiginiz urunun basarili olarak sepete eklendigini control edin
        //        Sayfayi kapatin
    public static void main(String[] args) {


        //        “https://www.saucedemo.com” Adresine gidin

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.saucedemo.com");


        //        Username kutusuna “standard_user” yazdirin
        WebElement username_kutusu = driver.findElement(By.cssSelector("input[id='user-name'"));
        username_kutusu.sendKeys("standard_user");


        //        Password kutusuna “secret_sauce” yazdirin
        WebElement passwort_kutusu = driver.findElement(By.xpath("//input[@id='password']"));
        passwort_kutusu.sendKeys("secret_sauce");

        //        Login tusuna basin
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/input")).click();


        //        Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin

        WebElement ilk_urun = driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']"));
        System.out.println("ilk_urun.getText() = " + ilk_urun.getText());
        ilk_urun.click();


        //        Add to Cart butonuna basin
        WebElement sepete_ekle = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
        sepete_ekle.click();


        //        Alisveris sepetine tiklayin
        WebElement alisveris_sepeti=driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        alisveris_sepeti.click();


        //        Sectiginiz urunun basarili olarak sepete eklendigini control edin



        //        Sayfayi kapatin


    }//main
}//class
