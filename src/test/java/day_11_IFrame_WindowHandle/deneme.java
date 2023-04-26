package day_11_IFrame_WindowHandle;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class deneme {
@Test
    public  void test() throws InterruptedException {

//        https://the-internet.herokuapp.com/iframe sayfasına gidiniz
//        Kalın yazının "Editor" kelimesini içerdiğini doğrulayınız
//        Textbox içindeki yazıyı siliniz.
//        Sildiğiniz yazı yerine "Bu textbox iFrame içinde yer almaktadır" yazınız.
//        Sayfadaki "Elemental Selenium" yazısının görünür olduğunu doğrulayınız.
//

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/iframe");
        WebElement baslik_yazisi= driver.findElement(By.xpath("//h3[text()='An iFrame containing the TinyMCE WYSIWYG Editor']"));
        Assert.assertTrue(baslik_yazisi.getText().contains("Editor"));

driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));
        WebElement yazi=driver.findElement(By.xpath("//p[text()='Your content goes here.']"));
    System.out.println(yazi);
    Thread.sleep(3000);
    yazi.clear();//clear elementin icerisndeki text ifadeyi siler . elementin kendisini silmez
    Thread.sleep(3000);
    yazi.sendKeys("Allah kerimdir ");
    driver.switchTo().parentFrame();
    WebElement disyazi=driver.findElement(By.xpath("//a[text()='Elemental Selenium']"));
    Assert.assertTrue(disyazi.isDisplayed());







}//class
}//metod
