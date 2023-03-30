package ODEV;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Erol_hoca_odev_1 {
    /*
    *** Aşağıdaki Task'i Junit framework'u ile yapınız
- http://the-internet.herokuapp.com/add_remove_elements/ adresine gidiniz
            - Add Element butonuna 100 defa basınız
- 100 defa basıldığını test ediniz
- 90 defa delete butonuna basınız
- 90 defa basıldığını doğrulayınız
- Sayfayı kapatınız
}
*/
    public static void main(String[] args) {

//  *** Aşağıdaki Task'i Junit framework'u ile yapınız

//        - http://the-internet.herokuapp.com/add_remove_elements/ adresine gidiniz
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/ adresine gidiniz");

//        - Add Element butonuna 100 defa basınız
        WebElement add_butonu = driver.findElement(By.xpath("//*[text()='Add Element']"));

        System.out.println(add_butonu);
        System.out.println("***********************");
        System.out.println(add_butonu.getText());

        for (int i = 0; i < 100; i++) {
            add_butonu.click();

        }



//        - 100 defa basıldığını test ediniz
            List<WebElement> delete_butonleri= driver.findElements(By.xpath("//*[text()='Delete']"));
            System.out.println(delete_butonleri.size());




//        - 90 defa delete butonuna basınız

        for (int i = 0; i < 90; i++) {
            delete_butonleri.get(i).click();

        }
        System.out.println(delete_butonleri.size());

//        - 90 defa basıldığını doğrulayınız


//                - Sayfayı kapatınız









    }//main
}//class
