package day_12_WindowHandle_BasicAuth;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

public class C01_WindowHandle extends TestBase {

      /*
https://www.techproeducation.com adresine gidiniz
Başlığın "Techpro Education | Online It Courses & Bootcamps" olduğunu doğrulayın
Tab 2'de https://www.youtube.com sayfasını açınız
Tab 3'te https://www.linkedin.com sayfasını açınız
techproeducation sayfasına geçiniz
youtube sayfasına geçiniz
linkedIn sayfasına geçiniz
 */


    @Test
    public void newTabTest() throws InterruptedException {
//        https://www.techproeducation.com adresine gidiniz

        driver.get("https://www.techproeducation.com");


//        Başlığın "Techpro Education | Online It Courses & Bootcamps" olduğunu doğrulayın

        Assert.assertEquals(driver.getTitle(),"Techpro Education | Online It Courses & Bootcamps");
        String techpro_hash =driver.getWindowHandle();
//        Tab 2'de https://www.google.com sayfasını açınız
        driver.switchTo().newWindow(WindowType.TAB).get("https://www.google.com");

        String google_hash  =driver.getWindowHandle();


//        Tab 3'te https://www.linkedin.com sayfasını açınız
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.linkedin.com");
        String linkin_hash  =driver.getWindowHandle();



//        techproeducation sayfasına geçiniz
        bekle();
        driver.switchTo().window(techpro_hash);
bekle();
//        youtube sayfasına geçiniz
        driver.switchTo().window(google_hash);
        bekle();
//        linkedIn sayfasına geçiniz
        driver.switchTo().window(linkin_hash);

    }



}//class
