package day_13_ActionsClass;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class deneme2  extends TestBase {

    @Test
    public void test(){
//        https://techproeducation.com adresine gidin
//        Sayfanın alt tarafına gidin
//        Sayfanın üst tarafına gidin

           driver.get("https://techproeducation.com");

            //reklam kapatiliyor
        driver.findElement(By.cssSelector("i[class='eicon-close']")).click();
        Actions mause = new Actions(driver);
        WebElement sayfa_alti=driver.findElement(By.xpath("//div[text()='OFFERS IN THE LAST 3 MONTHS']"));
        mause.scrollToElement(sayfa_alti).perform();
        WebElement sayfanin_ustu =driver.findElement(By.cssSelector("input[class=elementor-search-form__input]"));
        mause.scrollToElement(sayfanin_ustu).perform();


    }

}
