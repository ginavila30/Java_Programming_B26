package day26_05_17_2022;

import day25_05_09_2022.browser_task.ChromeDriver;
import day25_05_09_2022.browser_task.JavaScriptExecuter;
import day25_05_09_2022.browser_task.SafariDriver;
import day25_05_09_2022.browser_task.WebDriver;
import day25_05_09_2022.browser_task.TakeScreenShot;
public class P02_Casting {
    public static void main(String[] args) {


    /* UP CASTING

    - Smaller Type to Larger Type (Child to Parents )
    - Implicity

     */

        WebDriver driver= new ChromeDriver();
        driver.get("www.google.com");

        TakeScreenShot takeScreenshot=new ChromeDriver();
        takeScreenshot.TakeScreenShot("pic001");


        JavaScriptExecuter js=new ChromeDriver();
        js.executeScript("Executing Script");


        /*
        Why we use WebDriver instead of JS (2) / TakeScreenShot (1) as reference Type ?

            - has more methods
            - we dont need to more downcasting

         */

        /* DOWN  CASTING

        - Larger Type to Smaller Type (Parent to Child  )
        - Explicitly
        - To access features of object type which is not accesible from reference

     */

        WebDriver safari=new SafariDriver();
        ((SafariDriver)safari).secure();
        ((SafariDriver)safari).talk();
        ((SafariDriver)safari).fast();


    /*
    NOTE :There must be IS A relation between object type and reference type
          Otherwise it will givce ClassCastException

     */

        WebDriver chrome=new ChromeDriver();
        // ((SafariDriver)driver).get("www.google.com"); // We did this to get ClassCastException
        ((SafariDriver)driver).fast();
        ((SafariDriver)driver).secure();


    }
}
