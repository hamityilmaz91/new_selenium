package day_14_FakerClass_FileExist;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import java.io.File;

public class den3 extends TestBase {

    @Test
    public void test(){
        //"https://testcenter.techproeducation.com/index.php?page=file-download"   adresine gidin

        driver.get("https://testcenter.techproeducation.com/index.php?page=file-download");



        //"b10 all test cases" dosyasını indirin

      //  driver.findElement(By.xpath("//*[text()='b10 all test cases, code.docx']")).click();










        // Dosyanın başarıyla indirilip indirilmediğini test edin.

       File dosya= new File("C:\\Users\\hmtyl\\Downloads\\b10 all test cases, code (2).docx");

        Boolean dosya_var_mi= dosya.exists();
        Assert.assertTrue(dosya_var_mi);
        dosya.delete();





    }

}
