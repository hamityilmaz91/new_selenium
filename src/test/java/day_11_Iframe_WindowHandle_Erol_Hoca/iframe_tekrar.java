package day_11_Iframe_WindowHandle_Erol_Hoca;

import day_05_RelativeLocators.C01_RelativeLocators;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class iframe_tekrar extends TestBase {


//   https://the-internet.herokuapp.com/iframe sayfasına gidiniz
//
//   Kalın yazının "Editor" kelimesini içerdiğini doğrulayınız
//   Textbox içindeki yazıyı siliniz.
//   Sildiğiniz yazı yerine "Bu textbox iFrame içinde yer almaktadır" yazınız.
//   Sayfadaki "Elemental Selenium" yazısının görünür olduğunu doğrulayınız.
//


    @Test
    public void iframe() {

        driver.get("https://the-internet.herokuapp.com/iframe");
//   Kalın yazının "Editor" kelimesini içerdiğini doğrulayınız
        WebElement text = driver.findElement(By.xpath("//h3[text()='An iFrame containing the TinyMCE WYSIWYG Editor']"));
        Assert.assertTrue(text.getText().contains("Editor"));


//   Textbox içindeki yazıyı siliniz.

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));
        WebElement textbox = driver.findElement(By.xpath("//p"));
        textbox.clear();


//   Sildiğiniz yazı yerine "Bu textbox iFrame içinde yer almaktadır" yazınız.
        textbox.sendKeys("Bu text box Iframe icerisinde yer almaktadir ");


//   Sayfadaki "Elemental Selenium" yazısının görünür olduğunu doğrulayınız.

        driver.switchTo().parentFrame();
        Assert.assertTrue(driver.findElement(By.xpath("//a[text()='Elemental Selenium']")).isDisplayed());



//


    }

}
