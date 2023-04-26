package day_14_FakerClass_FileExist;

import org.apache.xmlbeans.impl.xb.ltgfmt.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class dosyadeneme {

    //Masaüstünde bir dosya oluşturalım
    //Bu dosyanın varlığını doğrulayalım
    @Test
    public void test() {

        File dosya = new File("C:\\Users\\hmtyl\\OneDrive\\Masaüstü\\dosyayoludogrulama.odt");
        Assert.assertTrue(dosya.exists());

/*

deneme yanilma yaparak file mi files mi olduguna karar verebildim .
Buradaki kistas yanlis ta olussa obje ,yani java kizarsa da obje nokta calisiyor
ve obje  nokta dedigimizde exist hangisinde cikiyorsa oradan   devam ettim ben
Bu birinci mevzu idi . ikincisi obje olusunca cikan hata da konstraktira string bir deger gir uyarisi veriliyor
bu  string deger  adres yolu olmalidir . Peki adres yolunda onemli olan nedir???
adrs C ile baslamali ve sola yatik  ikili slashlar olmali ve dosyanin uzantisi ile  bitmeli




 */
        //    "C:\Users\hmtyl\OneDrive\Masaüstü\dosyayoludogrulama.odt"

        //Normal kopyalama olunca sola yatik bir tane oluyor . biz obje olusturunca sola yatik iki tane oluyor
        System.out.println("System.getProperty(\"user.home\") = " + System.getProperty("user.home"));
        System.out.println("System.getProperty(\"user.dir\") = " + System.getProperty("user.dir"));

       Boolean ikinicyol= Files.exists(Path.of("C:\\Users\\hmtyl\\OneDrive\\Masaüstü\\dosyayoludogrulama.odt"));
        Assert.assertTrue(ikinicyol);

        // SONUC:::::::::::::::::::::::::SONUC::::::::::::::::::::


        /*
        Dosyanin varligini dogrulamak icin iki farkli yol vardir
        1. yol file class indan bir obje olusturmak.Eger girdigimiz adres var ise dosya olusuyor
        2. Yol ise FileS  tan   . koyup static metodlara ulasmak
        birinde konstraktira adres giriyorsun. sola yatik cift slash li olcak sekilde
        digerinde  Files.exist(Path..dosya yolu ) olacak sekilde
        Ama anladigim kadari ile dosya ile islem yapmak icin File  klasini kullnamak
        dosyayi nesne olarak elimize almak ,dosya ile ilgili okuma yazma silme islemlerini yapmamizi saglayacak




         */





    }
}
