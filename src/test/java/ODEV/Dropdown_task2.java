package ODEV;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Dropdown_task2 {

      /*

    -Amazon sayfasına gidelim
    -Arama Kutusundaki Dropdown menuyu yazdıralım

   başlık altındakileri aratalım. Her aramada sayfa başlığını yazdıralım
    Not: Select Class'ı kullanalım
    //annotaion kullanin
     */


    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //-Amazon sayfasına gidelim
        driver.get("https://www.amazon.com");

        //    -Arama Kutusundaki Dropdown menuyu yazdıralım
        //     bu bir dropdown menu ve bu menu icerisine select objesi ile ulasabiliriz
        Thread.sleep(3000);
        WebElement all_butonu = driver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']"));
        Select all_drop_down = new Select(all_butonu);
        List<WebElement> menu_listleri = all_drop_down.getOptions();
        for (WebElement webElement : menu_listleri) {
            System.out.println("Dropdown menuleri  = " + webElement.getText());
        }

        // menudeki ilk 5 basligi sirasi ile aratalim

        // Buyutec web elementi
        WebElement buyutec = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
        Thread.sleep(3000);

        all_drop_down.selectByIndex(1);
        buyutec.click();
        driver.navigate().back();
        Thread.sleep(3000);
        all_drop_down.selectByIndex(2);
        Thread.sleep(3000);

        all_drop_down.selectByIndex(3);



        buyutec.click();
        driver.navigate().to("https://www.amazon.com");
        all_butonu.click();
        all_drop_down.selectByIndex(4);



        // all_drop_down.selectByIndex();


    }//main


}//class
