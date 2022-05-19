package day26_05_17_2022;

import day25_05_09_2022.browser_task.ChromeDriver;
import day25_05_09_2022.browser_task.FirefoxDriver;
import day25_05_09_2022.browser_task.SafariDriver;
import day25_05_09_2022.browser_task.WebDriver;

public class DriverUtil {
    public static WebDriver getDriver(String browserName){

        WebDriver driver;

        switch (browserName){

            case "chrome":
                // WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                break;

            case "safari":
                // WebDriverManager.safaridriver().setup();
                driver=new SafariDriver();
                break;

            case "firefox":
                // WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
                break;

            default:
                System.out.println("UNKNOWN BROWSER");
                driver=null;

        }

        return driver;

    }

}
