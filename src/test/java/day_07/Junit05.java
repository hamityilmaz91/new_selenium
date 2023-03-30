package day_07;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Junit05 {
    /*
    Verilen web sayfasına gidin.
    https://the-internet.herokuapp.com/checkboxes
    Checkbox1 ve checkbox2 elementlerini locate edin.
    Checkbox1 seçili değilse onay kutusunu tıklayın
    Checkbox2 seçili değilse onay kutusunu tıklayın
     */

    static WebDriver driver;

    @BeforeClass
    public static void driver_kurulum() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/checkboxes\n");
    }

    @Test
    public void checkbox1_test(){

        WebElement kutucuk_1=driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        if(!kutucuk_1.isSelected()){
            kutucuk_1.click();
        }
    }


    @Test
    public void checkbox2_test(){

        WebElement kutucuk_2=driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        if(!kutucuk_2.isSelected()){
            kutucuk_2.click();
        }
    }





}//class
