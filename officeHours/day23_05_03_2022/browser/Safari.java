package day23_05_03_2022.browser;

public class Safari extends Browser{
//    public Safari(String version) {
//        super(version);
//    }

    @Override
    public void openBrowser() {
        System.out.println("Opening safari browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing safari browser");
    }
}
