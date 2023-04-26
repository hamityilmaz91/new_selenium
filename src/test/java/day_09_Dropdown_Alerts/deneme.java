package day_09_Dropdown_Alerts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class deneme {

    public static void main(String[] args) {

   //tüm menuleri yazdirin
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");


       WebElement all_yazisi= driver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']"));
        all_yazisi.click();

        Select select=new Select(all_yazisi);
        List<WebElement> dropdowndaki_menüler =select.getOptions();
        for (WebElement w : dropdowndaki_menüler) {
            System.out.println("w.getText() = " + w.getText());
        }


        select.selectByVisibleText("Baby");
        driver.findElement(By.cssSelector("input[id=nav-search-submit-button]")).click();





    }//main
}//class
