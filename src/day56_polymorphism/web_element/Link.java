package day56_polymorphism.web_element;
/* implement the WebElement interface and implement all abstract methods*/
public class Link implements WebElement {

    @Override
    public void click() {
        System.out.println("Clicking Linked");
    }

    @Override
    public String getText() {
        return "Link Text";
    }

    @Override
    public void sendKeys(String txt) {
        System.out.println("Sending txt to link");
        System.out.println(txt);
    }

}
