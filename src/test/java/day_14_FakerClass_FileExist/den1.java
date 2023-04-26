package day_14_FakerClass_FileExist;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class den1 extends TestBase {

    //"https://techproeducation.com/" gidin
    // İlk kelime SHIFT tuşuna basılı şekilde, ikinci kelime basılmadan "TECHPRO education" araması yapın.

@Test
    public void test01(){

    driver.get("https://techproeducation.com/");

   WebElement arama_kutusu = driver.findElement(By.cssSelector("[class='elementor-search-form__input']"));
    Actions klavye= new Actions(driver);
    arama_kutusu.sendKeys(Keys.SHIFT+"techpro"+Keys.SHIFT+"education");


}







}

