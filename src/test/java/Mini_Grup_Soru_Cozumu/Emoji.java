package Mini_Grup_Soru_Cozumu;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Emoji extends TestBase {


    @Test
    public void test() {


        //
        //  https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/   sitesine gidin

        driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");

        // ikinci emojiye tıklayın
        //  driver.switchTo().frame(1);
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='emoojis']")));


        WebElement ikinciemoji = driver.findElement(By.xpath("(//span[@class='mdl-tabs__ripple-container mdl-js-ripple-effect'])[2]"));
        ikinciemoji.click();


        // İkinci emoji öğelerini yazdırınız
        System.out.println("driver.findElement(By.xpath(\"//div[@id='nature']\")).getText() = " + driver.findElement(By.xpath("//div[@id='nature']")).getText());


        // Parent iframe e geri donun
        driver.switchTo().parentFrame();


        // Formu doldurun,(Formu istediğiniz metinlerle doldurun)
       WebElement ikinci_kutucuk= driver.findElement(By.xpath("(//input[@class='mdl-textfield__input'])[2]"));
        String sabit_kisim="(//input[@class='mdl-textfield__input'])[";
        for (int i = 0; i < 4; i++) {
            String devam=sabit_kisim+i+"]";
            System.out.println(devam);


        }

       // ikinci_kutucuk.sendKeys("ahmet");



        // Apply button a basiniz
    }
}





