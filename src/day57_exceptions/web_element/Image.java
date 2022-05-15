package day57_exceptions.web_element;

public class Image implements WebElement{
    @Override
   public void click(){
        System.out.println("Clicking image");};

    @Override
    public String getText(){return "Text Desc";};

    @Override
    public void sendKeys(String txt){
        System.out.println("Uploading pictures");
    }

    String extension;
}
