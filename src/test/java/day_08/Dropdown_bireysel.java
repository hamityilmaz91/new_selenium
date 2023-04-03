package day_08;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Dropdown_bireysel {


    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");

        //2016 yilini seciniz
        // simdi bu bir secenekli menu . yani bu bir drop down
        //drop dawn menusunun locati bildigimiz gibi
        // icerisine erisim ise select objesi ile yapiliyor . Zaten locate ettiginde de gozune geliyor

        //2016 yilini seciniz
        // Secim yaptigin kutu bir web element degil

        WebElement dropdown_kutusu=driver.findElement(By.xpath("//*[@id='year']"));
        Select drop_yil_objesi=new Select(dropdown_kutusu);
        drop_yil_objesi.selectByValue("2016");
        Thread.sleep(3000);
        drop_yil_objesi.selectByVisibleText("2015");
        // Dropdown  state selection menusunu tamamen yazdirin
        WebElement sehir_drop_down=driver.findElement(By.xpath("//select[@id='state']"));
        Select sehirler_objesi = new Select(sehir_drop_down);
        List<WebElement> sehirler = sehirler_objesi.getOptions();
        for (WebElement webElement : sehirler) {

            System.out.println("sehirler  = " + webElement.getText());


        }











    }
}
