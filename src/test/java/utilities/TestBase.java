package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public abstract class TestBase {

    // TestBase classlari abstrackt yapilir ki ilerde obje olusturmada karisikliga sebep olmasin
    // Bu class larda beforlar ve afterlar olur
    // Testbase class classlari utulitirs package lari icerinde yapariz
    // Utulities package lerinda olusutrdugumuz classlarin variablari extend lik duruma gore
    // dusunulup access modifierlari olusturulmali
    // protected min erisim duzeyi olur inheritens icin
    // after de 3 saniye ve quik olustur


    //  test claslarinda sadece  test anotaionlari olmalidir




    //TestBase class'ından Obje oluşturmanın önüne geçilmesi için abstract yapılabilir
    //Orn: TestBase base = new TestBase()
    //Bu class'a extends ettiğimiz test classlarından ulaşabiliriz
    protected static WebDriver driver;
    @Before
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @After
    public void tearDown() throws Exception {
        //Thread.sleep(3000);
        //driver.quit();
    }
    public static int a;
}