package day_09_Dropdown_Alerts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class bireysel {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");

//parentin xpath i tam olarak yazilir sonra child class in xpath i tam olarak yazilir.
// En sonda buraya kadarki kisim paranteze alinmadan index yazilir

      // WebElement list=driver.findElement(By.xpath("//select[@id='state']//option"));
       // System.out.println(list);
       //System.out.println("*************************************");


       //List<WebElement> list1=driver.findElements(By.xpath("//select[@id='state']//option"));

      //  System.out.println(list1);
//        list.click();




      // WebElement ahmet=driver.findElement(By.xpath("//select[@id='state']"));
       // System.out.println(ahmet.getText());
        //  CSS TE INDEX MEVZUU YOK
        //  XPATH TE VAR

// SU ANDA PARENTE LOCATE EDIYORUM

        WebElement ustklas=driver.findElement(By.xpath("//div[@class='col-md-8']"));
        System.out.println(ustklas.getText());


        List<WebElement> ustklas1=driver.findElements(By.xpath("//div[@class='col-md-8']"));
        for (WebElement webElement : ustklas1) {
            System.out.println("webElement.getText() = " + webElement.getText());
        }




    }
}
