package testCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
public class Example{
        @Test
        public void locator1() throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.thegoodguys.com.au/UserRegistrationForm?myAcctMain=1&new=Y&catalogId=30000&langId=-1&storeId=900");

            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

            //WebDriver.Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.findElement(By.name("firstName")).sendKeys("Firstname");
            //driver.findElement(By.name("firstName")).sendKeys("FirstName");
            driver.findElement(By.id("regAddForm_lastName")).sendKeys("lastname");
            driver.findElement(By.linkText("Catalogues")).click();
            //driver.findElement(By.partialLinkText("Delivery Update")).click();
            driver.findElement(By.partialLinkText("Delivery Update")).click();

            //  Thread.sleep(10000);
            // Thread.sleep(10000);
            //driver.findElement(By.name("firstName")).sendKeys("FirstName");
            // enter data in lastname field
            //locator - id
            //driver.findElement(By.id("regAddForm_lastName")).sendKeys("LastName");
            //by link text
            // driver.findElement(By.linkText("Catalogues")).click();
            //it will stop execution for 10sec--its not recomended to use it
            Thread.sleep(10000);

        }
    }


