package day_09_Dropdown_Alerts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03bireysel {


    /*
https://testcenter.techproeducation.com/index.php?page=javascript-alerts adresine gidin.

Bir metod olusturun: acceptAlert
1. butona tıklayın, uyarıdaki OK butonuna tıklayın ve result mesajının  “You successfully clicked an alert” oldugunu test edin.
Bir metod olusturun: dismissAlert
2. butona tıklayın, uyarıdaki Cancel butonuna tıklayın ve result mesajının
“successfuly” icermedigini test edin.
Bir metod olusturun: sendKeysAlert
3. butona tıklayın, uyarıdaki metin kutusuna isminizi yazin, OK butonuna
tıklayın ve result mesajında isminizin görüntülendiğini doğrulayın.


  */
    @Test
    public void toplutest() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts ");
//1. butona tıklayın, uyarıdaki OK butonuna tıklayın ve result mesajının  “//*[.='You successfully clicked an alert']” oldugunu test edin.
        driver.findElement(By.xpath("//*[.='Click for JS Alert']")).click();
        //BUNUN alert verdigini anlamam gerekiyor bu noktada
        // alert li alana da giremiyorum. Oraya  gecis icin driver degirsirmem lazim
        driver.switchTo().alert().accept();
        String actually_value= driver.findElement(By.xpath("//*[.='You successfully clicked an alert']")).getText();
        Assert.assertTrue(actually_value.equals("You successfully clicked an alert"));

        //2. butona tıklayın, uyarıdaki Cancel butonuna tıklayın ve result mesajının  “successfuly” icermedigini test edin.
        driver.findElement(By.xpath("//*[.='Click for JS Confirm']")).click();

        // BAK alerte sen manuel ulasabiliyorsun .  BUnda sorun yok. SOrun onu licate edip edememekte
        //alert   oldugunun tek tesbit yolu locate alip alamamam
        // simdi ben dismiss diymedim . cunku locateni almadim. ondan dolayi alert e geciyorum .
        // bir NOT DAHA : ALERT TEN SONRA ZATEN ALERT OTOMATIK KENDI KAPANDIGI ICIN DRIVER ESKI OLDUGU YERE DONUYOR
        // BUNDAN DOLAYI I FRAME DEKI GIBI DRIVER I TEKAR TEKRAR TASIMAYA GEREK OLMUYOR
        driver.switchTo().alert().dismiss();
        String actually_deger=driver.findElement(By.xpath("//*[.='You clicked: Cancel']")).getText();
        Assert.assertFalse(actually_deger.equals("successfuly"));

        //3. butona tıklayın, uyarıdaki metin kutusuna isminizi yazin, OK butonuna
        //tıklayın ve result mesajında isminizin görüntülendiğini doğrulayın.

        driver.findElement(By.xpath("//*[.='Click for JS Prompt']")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("hamit");
        Thread.sleep(2000);

        driver.switchTo().alert().accept();
        String acrually=driver.findElement(By.xpath("//*[.='You entered: hamit']")).getText();
        Assert.assertTrue(acrually.contains("hamit"));












    }


}//class
