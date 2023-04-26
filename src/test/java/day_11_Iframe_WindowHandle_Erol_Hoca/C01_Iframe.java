package day_11_Iframe_WindowHandle_Erol_Hoca;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C01_Iframe extends TestBase {
    /*
   https://the-internet.herokuapp.com/iframe sayfasına gidiniz
   Kalın yazının "Editor" kelimesini içerdiğini doğrulayınız
   Textbox içindeki yazıyı siliniz.
   Sildiğiniz yazı yerine "Bu textbox iFrame içinde yer almaktadır" yazınız.
   Sayfadaki "Elemental Selenium" yazısının görünür olduğunu doğrulayınız.
    */

    @Test
    public void iframe() throws InterruptedException {
        //https://the-internet.herokuapp.com/iframe sayfasına gidiniz
        driver.get("https://the-internet.herokuapp.com/iframe");

        //Kalın yazının "Editor" kelimesini içerdiğini doğrulayınız
        WebElement baslikElementi = driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(baslikElementi.getText().contains("Editor"));
        Thread.sleep(2000);
        //Textbox içindeki yazıyı siliniz.
        driver.switchTo().frame(0);
        WebElement textbox = driver.findElement(By.xpath("//p"));
        textbox.clear();//Textbox içindeki yazıyı sileriz
        Thread.sleep(2);
        //Sildiğiniz yazı yerine "Bu textbox iFrame içinde yer almaktadır" yazınız.
        textbox.sendKeys("Bu textbox iFrame içinde yer almaktadır");
        Thread.sleep(2);
        //Sayfadaki "Elemental Selenium" yazısının görünür olduğunu doğrulayınız.
        driver.switchTo().defaultContent();
        //driver.switchTo().parentFrame();
        //driver.navigate().refresh();-->Bu methodla sayfayı yenilediğimiz için ilk bölüme tekrar geçmiş oluruz
        Thread.sleep(2);
        WebElement elementalSeleniumWE = driver.findElement(By.xpath("(//a)[3]"));
        elementalSeleniumWE.sendKeys("denenenene");
        Assert.assertTrue(elementalSeleniumWE.isDisplayed());

    }
}