package day_03_practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

public class Soru_3 extends TestBase {

    @Test
    public void test01(){
        // https://www.amazon.com/ sayfasina gidin
        driver.get("https://www.amazon.com");

        // dropdown'dan "Baby" secenegini secin
        WebElement All_menusu = driver.findElement(By.cssSelector("select[aria-describedby=searchDropdownDescription]"));
        Select ddm= new Select(All_menusu);
        ddm.selectByVisibleText("Baby");



        // sectiginiz option'i yazdirin

        System.out.println("ddm.getFirstSelectedOption() = " + ddm.getFirstSelectedOption().getText());

        // dropdown'daki optionlarin toplam sayısının 28'e esit oldugunu test edin
        Assert.assertEquals(28, ddm.getOptions().size());
        // dropdown'daki optionların tamamını yazdırın
        for (WebElement w : ddm.getOptions()) {
            System.out.println("w.getText() = " + w.getText());
        }

    }
}
