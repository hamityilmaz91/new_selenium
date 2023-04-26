package day_13_ActionsClass;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class SORRRRRRRRRRRRRRR extends TestBase {


//    Amazon anasayfasına gidin
//    "Account & List" üzerinde bekleyin (mouse over - hover over)
//    Açılan menüde "Account" linkine tıklayın

    public static void main(String[] args) {

        driver.get("https://www.amazon.com");
        WebElement hedef =driver.findElement(By.xpath("//span[text()='Konto und Listen']"));
        Actions mause= new Actions(driver);
        mause.moveToElement(hedef);


    }


    @Test
    public void test(){

        driver.get("https://www.amazon.com");
        WebElement hedef =driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
        Actions mause= new Actions(driver);
        mause.moveToElement(hedef).perform();
        driver.findElement(By.xpath("//*[text()='Account']")).click();
    }
}
