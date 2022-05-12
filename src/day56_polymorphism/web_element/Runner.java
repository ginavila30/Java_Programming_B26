package day56_polymorphism.web_element;

import java.util.ArrayList;
import java.util.Arrays;

/*create a runner class to create objects of Link and Input with a focus on the interface references */
public class Runner {
    public static void main(String[] args) {
        WebElement element1=new Link();
        WebElement element2=new Input();

        WebElement[]arr={element1,element2};

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
