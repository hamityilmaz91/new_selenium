package Mini_Grup_Soru_Cozumu;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.List;

public class Soru1 extends TestBase {
    /*
    1.“
    https://www.saucedemo.com
            ” Adresine gidin
        2. Username kutusuna “standard_user”yazdirin
        3. Password kutusuna “secret_sauce”yazdirin
        4. Login tusuna basin
        5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
        6. Add to Cart butonuna basin
        7. Alisveris sepetine tiklayin
        8. Sectiginiz urunun basarili olarak sepete eklendigini control edin
        9. Sayfayi kapatin
*/
//
//    https://www.saucedemo.com
//            ” Adresine gidin

    @Test
    public void test1() {

        driver.get("https://www.saucedemo.com");


//        2. Username kutusuna “standard_user”yazdirin

        driver.findElement(By.cssSelector("input[id='user-name']")).sendKeys("standard_user" + Keys.ENTER);
//
//
//        3. Password kutusuna “secret_sauce”yazdirin

        driver.findElement(By.cssSelector("input[id=password]")).sendKeys("secret_sauce");


//        4. Login tusuna basin

        WebElement login = driver.findElement(By.cssSelector("input[id='login-button']"));
        login.click();

//        5. Ilk urunun ismini alin ve bu urunun sayfasina gidin

        WebElement ilk_urun = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));

        String ilk_urun_kayit = ilk_urun.getText();
        System.out.println("ilk_urun_kayit = " + ilk_urun_kayit);
        System.out.println("driver.getTitle() = " + driver.getTitle());
        ilk_urun.click();

//        6. Add to Cart butonuna basin

        driver.findElement(By.cssSelector("button[id=add-to-cart-sauce-labs-backpack]")).click();


//        7. Alisveris sepetine tiklayin


        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();

        driver.findElement(By.cssSelector("button[id=continue-shopping]")).click();
        driver.findElement(By.xpath("//*[text()='Sauce Labs Bolt T-Shirt']")).click();
        driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
        System.out.println("******************************************************");


        // sepetteki urunleri liste atin 

        List<WebElement> urunler = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));

        List<String> string_urunler_listi = new ArrayList<>();

        for (WebElement w : urunler) {
            System.out.println("w.getText() = " + w.getText());
            string_urunler_listi.add(w.getText());
        }

        System.out.println(string_urunler_listi);

        Assert.assertTrue(string_urunler_listi.contains("Sauce Labs Backpack"));

//        8. Sectiginiz urunun basarili olarak sepete eklendigini control edin




//        9. Sayfayi kapatin
//


    }


}
