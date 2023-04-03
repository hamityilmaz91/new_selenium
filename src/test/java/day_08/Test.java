package day_08;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Test {


    // All butonu altindaki baby secenegine ulasmak

    //1. yol all locate edilecek ve send key ile yollancak
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //1. yol all locate edilecek ve send key ile yollancak
        driver.get("https://www.amazon.com/");
//        driver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']")).
//                sendKeys("Baby"+ Keys.ENTER);

        //2. yol all un icindeki   baby locate ile click yapilacak
        // WebElement aa=driver.findElement(By.xpath("//*[text()='Baby']"));
        //aa.click();

        //3. Yol drop down
        WebElement all2 = driver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']"));
        Select drop_down_objesi = new Select(all2);
        // drop_down_objesi.selectByValue("search-alias=automotive-intl-ship");
        //drop_down_objesi.selectByVisibleText("Automotive");
        drop_down_objesi.selectByIndex(2);
        Thread.sleep(3000);
//        List<WebElement> all_list=drop_down_objesi.getOptions();
//        for (WebElement webElement : all_list) {
//            System.out.println("all menusu = " + webElement.getText());
//        }
        System.out.println("drop_down_objesi.getFirstSelectedOption() = " + drop_down_objesi.getFirstSelectedOption().getText());


    }

}
