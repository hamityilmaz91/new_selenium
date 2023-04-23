package day_07.day_06_Maven;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class deneme {

//    Verilen web sayfasına gidin.
//    https://the-internet.herokuapp.com/checkboxes
//    Checkbox1 ve checkbox2 elementlerini locate edin.
//    Checkbox1 seçili değilse onay kutusunu tıklayın
//    Checkbox2 seçili değilse onay kutusunu tıklayın
public static void main(String[] args) {

    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    driver.get("https://the-internet.herokuapp.com/checkboxes");

   WebElement checkbox1= driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
   WebElement checkbox2= driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));

   if(!checkbox1.isSelected())
       checkbox1.click();
   if (!checkbox2.isSelected())
       checkbox2.click();










}
}
