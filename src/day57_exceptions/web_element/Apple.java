package day57_exceptions.web_element;

import java.util.ArrayList;

public class Apple {
    public static void main(String[] args) {
        Form obj= new Form();
        Link obj2= new Link();
        Input obj3=new Input();
        Image obj4=new Image();

        ArrayList<WebElement>elements=new ArrayList<>();
        elements.add(obj);
        elements.add(obj2);
        elements.add(obj3);
        elements.add(obj4);
        elements.add(new Form());

        for (WebElement each:elements) {
            each.getText();
            if(each instanceof Form){
               ((Form) each).submit();// casting to access the method in form, since the reference is WebElement and does not have access to
            }
        }

        WebElement logo=new Image();
        logo.click();//click method is accessible by WebElement Interface reference
        ((Image)logo).extension="png"; // temporary casting

        Image logoAsImg=((Image) logo); //permanent casting by creating new reference.

        System.out.println(logoAsImg.extension);
    }
}
