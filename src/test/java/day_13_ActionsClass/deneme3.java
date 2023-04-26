package day_13_ActionsClass;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class deneme3 extends TestBase {
    public static void main(String[] args) {


//        https://jqueryui.com/droppable/ adresine gidin
//        "Drag me to my target" elementini "Drop here" elementi üzerine bırakınız.
//                */

        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));

        WebElement tutulacak_element= driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement tasinacak = driver.findElement(By.xpath("//div[@id='droppable']"));
        Actions mause= new Actions(driver);
        mause.dragAndDrop(tutulacak_element,tasinacak).perform();




    }
    @Test
    public void test(){

        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));

        WebElement tutulacak_element= driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement tasinacak = driver.findElement(By.xpath("//div[@id='droppable']"));
        Actions mause= new Actions(driver);
        mause.dragAndDrop(tutulacak_element,tasinacak).perform();
    }


}
