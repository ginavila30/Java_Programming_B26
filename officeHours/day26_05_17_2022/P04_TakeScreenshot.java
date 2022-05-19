package day26_05_17_2022;

import day25_05_09_2022.browser_task.*;

public class P04_TakeScreenshot {
    public static void main(String[] args) {

        // How to take screenshot
        WebDriver driver=new ChromeDriver();


        ((RemoteDriver)driver).TakeScreenShot("pic001");

        ((TakeScreenShot)driver).TakeScreenShot("pic002");


        // how to executeScripts
        ((JavaScriptExecuter)driver).executeScript("Executing Script");





    }
}
