package day_14_FakerClass_FileExist;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import java.io.File;

public class deneme6 extends TestBase {


    @Test
    public void test(){


        //"https://testcenter.techproeducation.com/index.php?page=file-download"   adresine gidin
        driver.get("https://testcenter.techproeducation.com/index.php?page=file-download");
        File obje = new File("C:\\Users\\hmtyl\\Downloads\\b10 all test cases, code (1).docx");
        obje.delete();


        driver.findElement(By.xpath("//*[text()='b10 all test cases, code.docx']")).click();



        //"b10 all test cases" dosyasını indirin

         obje = new File("C:\\Users\\hmtyl\\Downloads\\b10 all test cases, code (1).docx");

        // Dosyanın başarıyla indirilip indirilmediğini test edin.

        System.out.println(System.getProperty("user.home"));

        //          String özel=      C:\Users\hmtyl
//                         C:\\Users\\hmtyl\\Downloads\\b10 all test cases, code (1).docx"
       //            String genel

        //                  "C:\Users\hmtyl\OneDrive\Masaüstü\b129.txt"
    }
}
