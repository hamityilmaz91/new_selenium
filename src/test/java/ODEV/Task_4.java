package ODEV;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Task_4 {
    /*

    -Amazon sayfasına gidelim
    -Arama Kutusundaki Dropdown menuyu yazdıralım
    -Dropdown menuden sırasıyla ilk 5 başlığı (Arts&Crafts ile başlayıp Books'a kadar Books dahil) seçip
    başlık altındakileri aratalım. Her aramada sayfa başlığını yazdıralım
    Not: Select Class'ı kullanalım
    //annotaion kullanin
     */

   static WebDriver driver;
    @BeforeClass

    public static void driverKurulum(){
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @After
    public void kapanis() throws InterruptedException {

        Thread.sleep(4000);
        driver.quit();
    }


    @Test
    public void Dropdown(){



//        -Amazon sayfasına gidelim
        driver.get("https://www.amazon.com");

//        -Arama Kutusundaki Dropdown menuyu yazdıralım(List )

        //1. locate alll  (//div[@class='nav-left'])[2]
        //2. locate yolu   //div[@id='nav-search-dropdown-card']

        //3. locate yolu    //div[@class='nav-search-scope nav-sprite']

        //4. locate yolu     //div[@class='nav-search-facade']

        // 5. locate yolu      //span[@id='nav-search-label-id']

        // 6. locate yolu     //i[@class='nav-icon']


       //7. locate yolu        //select[@class='nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown']


        driver.findElement(By.xpath("//select[@class='nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown']")).click();


//        -Dropdown menuden sırasıyla ilk 5 başlığı (Arts&Crafts ile başlayıp Books'a kadar Books dahil) seçip
//        başlık altındakileri aratalım. Her aramada sayfa başlığını yazdıralım
//        Not: Select Class'ı kullanalım


    }
















}
