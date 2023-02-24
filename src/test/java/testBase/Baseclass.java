package testBase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;


public class Baseclass {
    public WebDriver driver;
    @BeforeClass
    public void  setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();


       // driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        // driver.get("http://localhost/opencart/upload/index.php");
        driver.get("https://demo.opencart.com/index.php");

        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }

    public String randomeString() {
        String generatedString = RandomStringUtils.randomAlphabetic(5);
        return (generatedString);
    }

    public String randomeNumber() {
        String generatedString2 = RandomStringUtils.randomNumeric(10);
        return (generatedString2);
    }

    public String randomAlphaNumeric() {
        String st = RandomStringUtils.randomAlphabetic(4);
        String num = RandomStringUtils.randomNumeric(3);

        return (st+"@"+num);
    }


}
