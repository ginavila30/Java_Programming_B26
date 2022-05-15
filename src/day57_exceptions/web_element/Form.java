package day57_exceptions.web_element;

public class Form implements WebElement{
    @Override
    public void click() {
        System.out.println("Clicking Form");
    }

    @Override
    public String getText() {
        return "Sign up";
    }

    @Override
    public void sendKeys(String txt) {
        System.out.println("Filling up the form");
    }
    public void submit(){
        System.out.println("Submitting form");
    }

}
