package day_15_FileUpload_Wait;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.TreeSet;

public class dosya_yükleme extends TestBase {


    @Test
    public void test() throws InterruptedException {


        //https://the-internet.herokuapp.com/upload adresine gidin
        driver.get("https://the-internet.herokuapp.com/upload");


        //b129.txt dosyasını yükleyin(upload)
        WebElement dosyasec= driver.findElement(By.cssSelector("input[id=file-upload]"));
        Thread.sleep(2000);
        dosyasec.sendKeys("C:\\Users\\hmtyl\\OneDrive\\Masaüstü\\b129.txt");
        WebElement upload= driver.findElement(By.cssSelector("[id=file-submit]"));
        upload.click();





        //“File Uploaded!” textinin görüntülendiğini test edin

       Boolean evet = driver.findElement(By.xpath("//*[text()='File Uploaded!']")).isDisplayed();
        Assert.assertTrue(evet);
    }


}
