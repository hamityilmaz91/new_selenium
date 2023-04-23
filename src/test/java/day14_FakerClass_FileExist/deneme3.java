package day14_FakerClass_FileExist;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class deneme3 {

    @Test
    public void dosya_varlik() {


        //Masaüstünde bir dosya oluşturalım

        //Bu dosyanın varlığını doğrulayalım

        // Bu bir dosya islemidir Dosya islemleri de FILESSSSSSSSSSSSSs clasii ile yapiliyor

        Boolean varmi=Files.exists(Path.of("C:\\Users\\hmtyl\\OneDrive\\Masaüstü\\SABIR.txt"));

        Boolean var2= Files.exists(Path.of("C:\\Users\\hmtyl\\OneDrive\\Masaüstü\\Yeni Metin Belgesi.txt"));

        System.out.println(varmi);
        System.out.println(var2);

        System.out.println("System.getProperty(\"user.dir\") = " + System.getProperty("user.dir"));
        //user.dir projemizin icinde bulundugu yolu verir.//buraya kadar olan kisim kisiseldir
        // simdi database de ki bir  dosyanin varligini kontrol etmek icin once dosyanin yolunu  bulmak gerekiyor
        // sonrasinda Files sinifi kullanilirak exist pathof kullanilir
        //burda coookkk sacma birsey var ki o da adresleri \\  ile yazmamiz gerektigi

//LOCALIMIZDAKI kullanici yolu
        System.out.println("System.getProperty(\"user.home\") = " + System.getProperty("user.home"));

        Assert.assertTrue(Files.exists(Path.of("C:\\Users\\hmtyl\\OneDrive\\Masaüstü\\Toplu komutlar sql.rtf")));



    }


}
