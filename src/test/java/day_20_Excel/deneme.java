package day_20_Excel;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class deneme {

    public static void main(String[] args) throws IOException {

        /*

        Excel veya word veya wordpad veya text  gibi dosyalara butuncul olarak ulasmak
        veya  icerisine girip dosyalarin okunmasi veya bu dosyalarin
        icerigine biseyler eklemek veya silmek icin  once dosyaya fiziki olarak ulasmaliyiz
         BU FIZIKI ULASMA ICIN  2 farkli yol var
         ya file new file deriz bu dosyaya butuncul vardirir bizi ve dosya var mi veya dosyayi komple sil gibi islemler yapariz


         ya da fileinput stream deriz
         bununla icergine mudahale ederiz. simdiiii once dosya intellij de olsun





         */

        // 1. adim fis objesi olusturulur . bu exceli oldugu gibi getirecek
        FileInputStream fis = new FileInputStream("src/main/resources/Capitals.xlsx");

        //2. adim olarak bu excel i  intellj in anlayacagi formata donusturmeliyiz
        Workbook workbook = WorkbookFactory.create(fis);

        // artik elimde intellij in anlayacagi excell var ve sayfalara ulasiyorum su anda

        Sheet sheet = workbook.getSheet("Sheet1");

        // simdi satirlara ulasiyorum
        Row row = sheet.getRow(2);

        // son olarak hucrelere ulasiyorum
        Cell cell = row.getCell(1);
        System.out.println(cell);

        //1.satır 1. sütun daki bilgiyi yazdırınız

        System.out.println(workbook.getSheet("Sheet1").getRow(0).getCell(0));

        workbook.getSheet("Sheet1").getRow(2);

        //Kullanılan satır sayısın bulun
        System.out.println(workbook.getSheet("Sheet1").getPhysicalNumberOfRows());


    }
}
