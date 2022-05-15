package day57_exceptions.web_element;

import java.util.ArrayList;
import java.util.Arrays;

/*create a runner class to create objects of Link and Input with a focus on the interface references */
public class Google {
    public static void main(String[] args) {
        WebElement link=new Link();
        WebElement input=new Input();

        WebDriverUtil.clickElement(link);
        WebDriverUtil.clickElement(input);
        WebDriverUtil.clickElement(new Link());



        WebElement[]arr=new WebElement[4];
        arr[0]=link;
        arr[1]=input;
        arr[2]=new Input();
        arr[3]=new Image();

        ArrayList<WebElement>list=new ArrayList<>(Arrays.asList(arr));

        list.add(new Input());
        list.add(new Link());

        for (WebElement each:arr) {
            System.out.print(each+" ");
        }
        System.out.println();
        for (WebElement each:list) {
            System.out.print(each+" ");
        }

    }
}
