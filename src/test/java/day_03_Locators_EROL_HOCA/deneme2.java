package day_03_Locators_EROL_HOCA;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class deneme2 {


    // 1- amazon.com'a gidip arama kutusunu locate edin
    @Test
    public void deneme2(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");
        WebElement arama_kutusu=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

        // 2- arama kutusunun tagName'inin input oldugunu test edin
        System.out.println("arama_kutusu.getTagName() = " + arama_kutusu.getTagName());
        Assert.assertTrue(arama_kutusu.getTagName().equals("input"));


        // 3- arama kutusunun name attribute'nun degerinin field-keywords oldugunu test edin
        System.out.println("arama_kutusu.getAttribute() = " + arama_kutusu.getAttribute("name "));
        System.out.println("arama_kutusu.getAttribute(\"id\") = " + arama_kutusu.getAttribute("id"));

    }



    // 2- arama kutusunun tagName'inin input oldugunu test edin



    // 3- arama kutusunun name attribute'nun degerinin field-keywords oldugunu test edin



}
