package day_11_Iframe_WindowHandle_Erol_Hoca;

import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

import java.util.Set;

public class deneme  extends TestBase {



    @Test
    public void deneme(){

        driver.get("https://www.google.com");
        System.out.println("driver.getTitle() = " + driver.getTitle());
        Set<String> hanls1=driver.getWindowHandles();
        System.out.println(hanls1);

        driver.get("https://www.youtube.com");
        System.out.println("driver.getTitle() = " + driver.getTitle());
        Set<String> hanls=driver.getWindowHandles();
        System.out.println(hanls);

        // Bu kod bizim eski bildigimiz seneryo.
        // BU TEST CALISINCA BASLAT MENUSUNDE  CHROME SIMGESI UZERINE GELDIGINIZ ZAMAN BIR PENCERE GOZUKUYOR
        // ZATEN TEK BIR HASH KOD ALMAMIZIN SEBEBI DE BU : BUNDAN DOLAYI BU SENERYODA DRIVERI DEGISTIRMEYE GEREK KALMADAN
        // BULUNDUGUMUZ HER SAYFADA LOCATE ALABILDIK

    }
    @Test
    public void neden_switch_to(){

        driver.get("https://www.google.com");
        System.out.println("driver.getTitle() = " + driver.getTitle());
        Set<String> hanls1=driver.getWindowHandles();
        System.out.println(hanls1);
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.youtube.com");
        System.out.println("driver.getTitle() = " + driver.getTitle());
        Set<String> hanls=driver.getWindowHandles();
        System.out.println(hanls);


// BU TEST CALISTIGINDA ISE BASLAT MENSUNDEKI CHROME SIMGESINE MAUSE  U TUTUNCA IKI FARKLI PENCERE OLUYOR
        // HASH KODLARININ BIRDEN FAZLA OLMASINDAN DA ANLIYORUZ BUNU
        // BUNDAN DOLAYI SAYFALARA FARKLI DRIVERLER ILE GITMEK ZORUNDA KALIYORUZ :




    }
}
