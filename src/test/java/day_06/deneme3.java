package day_06;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class deneme3 {

    public static void main(String[] args) {


//    http://zero.webappsecurity.com sayfasına gidin
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://zero.webappsecurity.com");

//    Signin buttonuna tıklayın

        WebElement sign_in= driver.findElement(By.xpath("//button[@id='signin_button']"));
        sign_in.click();

//    Login alanına  “username” yazdırın

        driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("username");


//    Password alanına “password” yazdırın

            driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("password");

//    Sign in buttonuna tıklayın

        driver.findElement(By.xpath("//input[@name='submit']")).click();


//    Pay Bills sayfasına gidin


//    Amount kısmına yatırmak istediğiniz herhangi bir miktarı yazın


//    Date kısmına “2023-03-27” yazdırın


//    Pay buttonuna tıklayın


//    “The payment was successfully submitted.” mesajının çıktığını kontrol edin

    }
}

