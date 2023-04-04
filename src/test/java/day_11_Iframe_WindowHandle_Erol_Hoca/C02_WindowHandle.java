package day_11_Iframe_WindowHandle_Erol_Hoca;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.List;

public class C02_WindowHandle extends TestBase {
    /*
    //Window 1'de https://www.techproeducation.com adresine gidiniz
    //Başlığın "Techpro Education | Online It Courses & Bootcamps" olduğunu doğrulayın
    //Window 2'de https://www.youtube.com sayfasını açınız:
    //Window 3'te https://www.linkedin.com sayfasını açınız:
    //techproeducation sayfasına geçiniz:
    //youtube sayfasına geçiniz:
    //linkedIn sayfasına geçiniz:
     */

    @Test
    public void windowHandle() throws InterruptedException {
        //Window 1'de https://www.techproeducation.com adresine gidiniz
        driver.get("https://www.techproeducation.com");
        //String techproWindowHandle = driver.getWindowHandle();//Techpro sayfasının handle değerini bir String'e assing ettik
        //System.out.println(techproWindowHandle);

        //Başlığın "Techpro Education | Online It Courses & Bootcamps" olduğunu doğrulayın
        String actualTitle = driver.getTitle();
        String expectedTitle = "Techpro Education | Online It Courses & Bootcamps";
        Assert.assertEquals(expectedTitle,actualTitle);

        //Window 2'de https://www.youtube.com sayfasını açınız:
        Thread.sleep(2000);
        driver.switchTo().//Geçiş yap
                newWindow(WindowType.WINDOW);//-->Yeni bir pencereye driver'i taşır
        //-->WindowType.TAB-->Yeni sekme açar

        driver.get("https://www.youtube.com");
        //String youtubeWindowHandle = driver.getWindowHandle();//Youtube sayfasının handle değerini bir String'e assing ettik
        //System.out.println(youtubeWindowHandle);

        //Window 3'te https://www.linkedin.com sayfasını açınız:
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.linkedin.com");
        //String linkedinWindowHandle = driver.getWindowHandle();
        //System.out.println(linkedinWindowHandle);

        List<String> tumWindowList = new ArrayList<String>(driver.getWindowHandles());
        //Bütün açtığım pencerelerin handle değerlerini bir ArrayList'e atadık


        //techproeducation sayfasına geçiniz:
        Thread.sleep(3000);
        //driver.switchTo().window(techproWindowHandle);
        driver.switchTo().window(tumWindowList.get(0));//--> Ilk açtığımız pencereye index ile geçebiliriz

        //youtube sayfasına geçiniz:
        Thread.sleep(3000);
        //driver.switchTo().window(youtubeWindowHandle);
        driver.switchTo().window(tumWindowList.get(1));

        //linkedIn sayfasına geçiniz:
        Thread.sleep(3000);
        //driver.switchTo().window(linkedinWindowHandle);
        driver.switchTo().window(tumWindowList.get(2));
    }
}