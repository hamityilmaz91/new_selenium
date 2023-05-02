package day_15_FileUpload_Wait;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class deneme3 extends TestBase {

    @Test
    public void test(){

        //https://the-internet.herokuapp.com/upload adresine gidin
        driver.get("https://the-internet.herokuapp.com/upload");

        //b129.txt dosyasını yükleyin(upload)
        WebElement dosyaSecWebElement = driver.findElement(By.id("file-upload"));
        dosyaSecWebElement.sendKeys("C:\\Users\\hmtyl\\OneDrive\\Masaüstü\\b129.txt");

        driver.findElement(By.id("file-submit")).click();
        //“File Uploaded!” textinin görüntülendiğini test edin






    }



}
