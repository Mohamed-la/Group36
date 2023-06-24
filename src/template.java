
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class template
//{
    static WebDriver driver = null;
//    public static void main(String[] args)
//
//    {
//        String driverType = "webdriver.chrome.driver";
//        String driverPath = "C:\\Users\\mabdelq1\\IdeaProjects\\design_pattern\\drivers\\chromedriver.exe";
//        System.setProperty("www.chromedriver.com",driverPath);
//        driver = new ChromeDriver();
//
//        driver.navigate().to("http://the-internet.herokuapp.com/");
//
//        locators loc = new locators();
//
//        loc.forAuthPos().click();
//        loc.userNamePos().sendKeys("tomsmith");
//
//
//    }
//
//}
//

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;

public class template
{
    public static void main(String[] args) throws InterruptedException {

        String driverType = "webdriver.chrome.driver";
        String driverPath = "C:\\Users\\mabdelq1\\IdeaProjects\\locators\\drivers\\chromedriver.exe";
        System.setProperty(driverType,driverPath);
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://the-internet.herokuapp.com/");

        Thread.sleep(3000);
        driver.findElement(By.linkText("Form Authentication")).click();
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");

        //driver.findElement(By.id("flash")).isDisplayed() ;

        driver.findElement(By.xpath("//i[@class=\"fa fa-2x fa-sign-in\"]")).click();

        System.out.println(driver.findElement(By.id("flash")).isDisplayed() );
        driver.quit();

    }


}
