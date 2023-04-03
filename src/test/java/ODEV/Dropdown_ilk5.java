package ODEV;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Dropdown_ilk5 {



      /*

    -Amazon sayfasına gidelim
    -Arama Kutusundaki Dropdown menuyu yazdıralım
    -Dropdown menuden sırasıyla ilk 5 başlığı

    (Arts&Crafts ile başlayıp Books'a kadar Books dahil) seçip
    başlık altındakileri aratalım. Her aramada sayfa başlığını yazdıralım
    Not: Select Class'ı kullanalım
    //annotaion kullanin
     */
      public static void main(String[] args) throws InterruptedException {

          WebDriverManager.chromedriver().setup();
         WebDriver driver = new ChromeDriver();
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

          driver.get("https://www.amazon.com");
          WebElement all=driver.findElement(By.xpath("//select[@name='url']"));
          Select all_drop_down=new Select(all);
          List<WebElement> list = all_drop_down.getOptions();
         // list.stream().skip(1).limit(5).forEach(t-> System.out.println(t.getText()));




              all_drop_down.selectByIndex(1);
              driver.findElement(By.xpath("(//div[@class='nav-right'])[1]")).click();
              System.out.println("driver.getTitle() = " + driver.getTitle());



          all_drop_down.selectByIndex(2);
          driver.findElement(By.xpath("(//div[@class='nav-right'])[1]")).click();
          System.out.println("driver.getTitle() = " + driver.getTitle());



          all_drop_down.selectByIndex(3);
          driver.findElement(By.xpath("(//div[@class='nav-right'])[1]")).click();
          System.out.println("driver.getTitle() = " + driver.getTitle());


      }

}


