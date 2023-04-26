package day_14_FakerClass_FileExist;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class deneme {


    public static void main(String[] args) throws InterruptedException {

        //"https://techproeducation.com/" gidin


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://techproeducation.com");

        driver.findElement(By.xpath("//i[@class='eicon-close']")).click();


        // İlk kelime SHIFT tuşuna basılı şekilde, ikinci kelime basılmadan "TECHPRO education" araması yapın.
        WebElement arama_kutusu = driver.findElement(By.xpath("//input[@class='elementor-search-form__input']"));
        Actions action= new Actions(driver);
        action.sendKeys(arama_kutusu,"TECHPRO education").perform();
        arama_kutusu.sendKeys(Keys.SHIFT, "techpro", Keys.SHIFT, "education");


        //Sayfayi Richmond College Enrollment Form linkine kadar scroll yapalım

        //***********bazen biz sayfada locate edeceginmiz yeri asagilarda buluruz. Locate dogru olsa bile hata alabiliriz
        //*********Bundan dolayi sayfayi bir kere asagiya kadar cekmek mantikli

        WebElement asagilar =driver.findElement(By.xpath("//a[text()='Salesforce Developer Course (Starting)']"));
   Thread.sleep(3000);
        //action.moveToElement(asagilar).perform();//Bu da sanki Keys.down gibi islem goruyor
     //   action.scrollToElement(asagilar).perform();
        action.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();



    }



}
