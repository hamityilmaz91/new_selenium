package day_03_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class deneme2 {
    public static void main(String[] args) {


        // https://www.amazon.com/ sayfasina gidin
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(14));
        driver.get("https://www.amazon.com");



        // dropdown'dan "Baby" secenegini secin

        WebElement dropdown= driver.findElement(By.cssSelector("select[class='nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown']"));
        //dropdown.click();
       // dropdown.sendKeys("Baby");
        Select obtions = new Select(dropdown);
       List<WebElement> optionslist = obtions.getOptions();
       optionslist.stream().forEach(t-> System.out.println(t.getText()));

obtions.selectByVisibleText("Baby");


        // sectiginiz option'i yazdirin



        // dropdown'daki optionlarin toplam sayısının 28'e esit oldugunu test edin

        // dropdown'daki optionların tamamını yazdırın

    }


}
