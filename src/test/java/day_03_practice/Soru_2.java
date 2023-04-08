package day_03_practice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Soru_2 extends TestBase {

    // https://demo.guru99.com/test/radio.html adresine gidin
    // checkbox elementlerini locate edin
    // checkbox1 ve checkbox3  secili degil ise secin
    // checkbox1 ve checkbox3 elementlerinin secili oldugunu Test edin
    // checkbox2 elementinin secili olmadıgını test edin

    @Test
    public void topla() throws InterruptedException {


        // https://demo.guru99.com/test/radio.html adresine gidin
        driver.get("https://demo.guru99.com/test/radio.html");
        Thread.sleep(2000);
        //    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='__uspapiLocator']")))

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='faktor-iframe-wrapper']")));

        //cookie 1
        WebElement cookies = driver.findElement(By.xpath("(//div[@style='font-size: 14px;'])[1]"));
        cookies.click();
        Thread.sleep(3000);
        //cookie 2
        driver.findElement(By.cssSelector("button[class='mat-focus-indicator okButton mat-raised-button mat-button-base']")).click();

        // checkbox elementlerini locate edin

        // checkbox1 ve checkbox3  secili degil ise secin
        // checkbox1 ve checkbox3 elementlerinin secili oldugunu Test edin
        // checkbox2 elementinin secili olmadıgını test edin

        ////iframe[@class='faktor-iframe-wrapper']   1. katman i frame
        ////iframe[@name='__uspapiLocator']     2. katman iframe ama sanmiyorum
    }
}
