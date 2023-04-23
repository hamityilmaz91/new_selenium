package day_03_Locators_EROL_HOCA;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.TestBase;

import java.time.Duration;
import java.util.List;

public class deneme1  {


    //Amazon sayfasında kaç tane link olduğunu konsolda yazdıralım
    //Linkleri yazdıralım

    @Test
    public  void tekrar1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");

        //Amazon sayfasında kaç tane link olduğunu konsolda yazdıralım
        //linkler a tag lari ile baslarlar
        List<WebElement> linklerlistesi =driver.findElements(By.xpath("//a"));
        System.out.println("link sayisi = "+linklerlistesi.size());
        //linkleri yazdiriniz


        List<WebElement> list2=driver.findElements(By.tagName("a"));

        System.out.println("linklerlistesi.get(0).getText() = " + linklerlistesi.get(0).getText());
        System.out.println("list2.get(0).getText() = " + list2.get(0).getText());
        System.out.println("*****************");
        System.out.println("linklerlistesi.get(0) = " + linklerlistesi.get(0));
        System.out.println("list2.get(0) = " + list2.get(0));


    }

    @Test
    public  void tekrar2(){


    }


}
