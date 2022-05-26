package day62_maps;

public class UsingBrowserEnum {
    public static void main(String[] args) {
        Browser browser=Browser.CHROME;

        switch (browser){
            case EDGE:
            case CHROME:
                System.out.println("Opening chrome browser");
                break;
            case SAFARI:
                System.out.println("Opening safari browser");
                break;
            case FIREFOX:
        }
    }
}
