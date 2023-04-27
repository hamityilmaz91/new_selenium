package day_19_WebTables;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class deneme {

    static WebDriver  driver;
    public static void main(String[] args) {

        //    https://the-internet.herokuapp.com/tables sayfasına gidin

        WebDriverManager.chromedriver().setup();
         driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://the-internet.herokuapp.com/tables");




        //    Task 1 : Table1’i yazdırın
        WebElement tablo1 =driver.findElement(By.xpath("//table[@id='table1']"));
        System.out.println("TABLO 1");
        System.out.println(tablo1.getText());





        //    Task 2 : 3. Satır verilerini yazdırın

        // 1. yol :::: satir olarak alip yazdirilabilir

        WebElement tablo1_satir3=driver.findElement(By.xpath("((//table)[1]/tbody/tr)[3]"));
        System.out.println("tablo1_satir3.getText() = " + tablo1_satir3.getText());





        // 2. yol ::::  table date olarak hucre hucre ulasilip da yazdirilabilir

        List<WebElement> satir3_hücreleri=driver.findElements(By.xpath("//table[1]/tbody/tr[3]/td"));
        System.out.println("*****************************************************************");

        satir3_hücreleri.stream().forEach(t-> System.out.println(t.getText()+"----"));





        //    Task 3 : Son satırın verilerini yazdırın

        System.out.println(Arrays.toString(driver.findElement(By.xpath("//table[1]/tbody/tr[last()]")).getText().split(" ")));

        //    Task 4 : 5. Sütun verilerini yazdırın

        List<WebElement> sütün5_verileri=driver.findElements(By.xpath("(//table)[1]/tbody//td[5]"));
        for (WebElement w : sütün5_verileri) {
            System.out.println(w.getText());
        }


        //    Task 5 : Iki parametreli bir Java metodu oluşturalım: printData
        //    Parameter 1 = satır numarası
        //    Parameter 2 = sütun numarası
        //    printData(2,3);  => 2. satır, 3. sütundaki veriyi yazdırsın.


        satirsutunmetodu(1,2,4);


    }//main

        //     "(//table)["+tablono+"]/tbody/tr["+satirno+"]/td["+sutunno+"]"
//

    public static void satirsutunmetodu(int tablono,int satirno,int sutunno){

        System.out.println(driver.findElement(By.xpath("(//table)[" + tablono + "]/tbody/tr[" + satirno + "]/td[" + sutunno + "]")).getText());


    }



}
