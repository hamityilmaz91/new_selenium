package day_03_practice;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

public class Soru_1 extends TestBase {
    // https://www.amazon.com/ sayfasina gidin
    // dropdown'dan "Books" secenegini secin
    // arama cubuguna "Java" aratın
    // arama sonuclarinin Java icerdigini test edin

    @Test

    public void test01() throws InterruptedException {

        driver.get("https://www.amazon.com");
        WebElement dropbox = driver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']"));
        Select obj = new Select(dropbox);
        obj.selectByVisibleText("Books");
        WebElement buyutec = driver.findElement(By.cssSelector("input[id=nav-search-submit-button]"));
        buyutec.click();
        WebElement arama_cubugu = driver.findElement(By.cssSelector("*[id=twotabsearchtextbox]"));
        arama_cubugu.sendKeys("Java" + Keys.ENTER);
       WebElement sonuc_yazisi= driver.findElement(By.xpath("(//*[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));
        Assert.assertTrue(sonuc_yazisi.getText().contains("Java"));




    }//Test
}