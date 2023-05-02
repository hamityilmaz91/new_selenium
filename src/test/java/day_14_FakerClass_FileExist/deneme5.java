package day_14_FakerClass_FileExist;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.nio.file.Files;

public class deneme5 {

    //Masaüstünde bir dosya oluşturalım

    //Bu dosyanın varlığını doğrulayalım
    @Test
    public void test01() {

        //                                  src/main/resources/Capitals.xlsx
        //                 yanlis olan              "C:\Users\hmtyl\OneDrive\Masaüstü\b129.txt"

        File obje = new File("C:/Users/hmtyl/OneDrve/Masaüstü/b129.txt");

        Assert.assertTrue(obje.exists());

        File obje2 = new File("src/test/Test_Outputs/resim.png");
        Assert.assertTrue(obje2.exists());

        //                                      src/main/resources/Capitals.xlsx


    }


}
