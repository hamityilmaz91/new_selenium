package day_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver", "src/resources/Drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();//Boş bir browser açar
        driver.get("https://www.google.com");//Gitmek istediğimiz ayfayı belirtiriz
        System.out.println("Sayfa başlığı: " + driver.getTitle());//driver.getTitle() sayfa başlığını getirir
        System.out.println("Sayfa adresi(URL): " + driver.getCurrentUrl());//driver.getCurrentUrl() sayfa adresini getirir
        //System.out.println(driver.getPageSource()); driver.getPageSource() ==> Sayda kaynak kodlarını getirir.
        System.out.println(driver.getWindowHandle());//Sayfanın(Window) hash değerini getirir.
        // Bu hash değerleri ile başka sayfadan bu sayfaya direkt dönebilmeyi sağlar.
        //(Sayfalar arası geçiş)

    }
}